package cj.netos.oc.wybank.cmd;

import cj.netos.oc.wybank.ICuratorPathChecker;
import cj.netos.oc.wybank.IWenyBankPurchaseTradeService;
import cj.netos.oc.wybank.bo.PurchaseWenyBO;
import cj.netos.oc.wybank.extern.model.PurchaseRecord;
import cj.netos.oc.wybank.result.PurchaseResponse;
import cj.netos.rabbitmq.CjConsumer;
import cj.netos.rabbitmq.IRabbitMQProducer;
import cj.netos.rabbitmq.RabbitMQException;
import cj.netos.rabbitmq.RetryCommandException;
import cj.netos.rabbitmq.consumer.IConsumerCommand;
import cj.studio.ecm.IServiceSite;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.annotation.CjServiceSite;
import cj.studio.ecm.net.CircuitException;
import cj.ultimate.gson2.com.google.gson.Gson;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Envelope;
import com.rabbitmq.client.LongString;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.framework.recipes.locks.InterProcessReadWriteLock;

import java.util.HashMap;

@CjConsumer(name = "fromGateway_receipt_purchase")
@CjService(name = "/wybank.ports#purchase")
public class PurchaseWenyCommand implements IConsumerCommand {
    @CjServiceSite
    IServiceSite site;

    @CjServiceRef(refByName = "curator.framework")
    CuratorFramework framework;

    @CjServiceRef
    ICuratorPathChecker curatorPathChecker;

    @CjServiceRef(refByName = "@.rabbitmq.producer.toGateway_ack_purchase")
    IRabbitMQProducer toGateway_ack_purchase;

    @CjServiceRef
    IWenyBankPurchaseTradeService wenyBankPurchaseTradeService;

    @Override
    public void command(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws RabbitMQException, RetryCommandException {
        LongString wenyBankIDLS = (LongString) properties.getHeaders().get("wenyBankID");
        String path = String.format("/wenybank/%s/locks", wenyBankIDLS.toString());
        try {
            curatorPathChecker.check(framework, path);
        } catch (Exception e) {
            throw new RabbitMQException("500", e);
        }
        LongString record_snLS = (LongString) properties.getHeaders().get("record_sn");
        LongString purchaserLS = (LongString) properties.getHeaders().get("purchaser");
        InterProcessReadWriteLock lock = new InterProcessReadWriteLock(framework, path);
        InterProcessMutex mutex = lock.writeLock();
        try {
            mutex.acquire();
            PurchaseResponse response = purchase(properties, body);
            response.setMessage("ok");
            response.setState("200");
            response.setRecordSN(record_snLS.toString());
            //发送消息到交易网关，标记申购状态为：已申购，如果出错，标记为错误状态，交记录错误信息
            _sendAck(response);
        } catch (RabbitMQException e) {
            PurchaseResponse response = new PurchaseResponse();
            response.setState("500");
            response.setMessage(e.getMessage());
            response.setRecordSN(record_snLS.toString());
            try {
                _sendAck(response);
            } catch (CircuitException ex) {
                throw new RabbitMQException(ex.getStatus(), ex.getMessage());
            }
            throw e;
        } catch (Exception e) {
            PurchaseResponse response = new PurchaseResponse();
            response.setState("500");
            response.setMessage(e.getMessage());
            response.setRecordSN(record_snLS.toString());
            try {
                _sendAck(response);
            } catch (CircuitException ex) {
                throw new RabbitMQException(ex.getStatus(), ex.getMessage());
            }
            throw new RabbitMQException("500", e);
        } finally {
            try {
                mutex.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private PurchaseResponse purchase(AMQP.BasicProperties properties, byte[] body) throws CircuitException {

        LongString wenyBankIDLS = (LongString) properties.getHeaders().get("wenyBankID");
        LongString purchaserLS = (LongString) properties.getHeaders().get("purchaser");
        LongString purchaserNameLS = (LongString) properties.getHeaders().get("purchaserName");
//

        PurchaseWenyBO purchaseWenyBO = new PurchaseWenyBO();
        purchaseWenyBO.setWenyBankID(wenyBankIDLS.toString());
        purchaseWenyBO.setPurchaser(purchaserLS.toString());
        purchaseWenyBO.setPurchaserName(purchaserNameLS.toString());
        purchaseWenyBO.setRecord(new Gson().fromJson(new String(body), PurchaseRecord.class));

        wenyBankPurchaseTradeService.purchase(purchaseWenyBO);

        PurchaseResponse response = new PurchaseResponse();
        response.setPurchaser(purchaseWenyBO.getPurchaser());
        response.setPurchaserName(purchaseWenyBO.getPurchaserName());
        response.setRecord(purchaseWenyBO.getRecord());
        response.setWenyBankID(purchaseWenyBO.getWenyBankID());
        return response;
    }


    private void _sendAck(PurchaseResponse response) throws CircuitException {
        AMQP.BasicProperties properties = new AMQP.BasicProperties().builder()
                .type("/wybank.ports")
                .headers(new HashMap() {
                    {
                        put("state", response.getState());
                        put("message", response.getMessage());
                        put("command", "ackPurchase");
                        put("purchaser", response.getPurchaser());
                        put("purchaserName", response.getPurchaserName());
                        put("wenyBankID", response.getWenyBankID());
                        put("record_sn", response.getRecordSN());
                    }
                }).build();
        byte[] body = null;
        if (!"200".equals(response.getState())) {
            body = new byte[0];
        } else {
            body = new Gson().toJson(response.getRecord()).getBytes();
        }
        toGateway_ack_purchase.publish("gateway", properties, body);
    }

}
