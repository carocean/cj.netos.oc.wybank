package cj.netos.oc.wybank.cmd;

import cj.netos.oc.wybank.ICuratorPathChecker;
import cj.netos.oc.wybank.IWenyBankExchangeTradeService;
import cj.netos.oc.wybank.bo.ExchangeWenyBO;
import cj.netos.oc.wybank.extern.model.ExchangeRecord;
import cj.netos.oc.wybank.result.ExchangeResponse;
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

@CjConsumer(name = "trade")
@CjService(name = "/wybank.ports#exchange")
public class ExchangeWenyCommand implements IConsumerCommand {
    @CjServiceSite
    IServiceSite site;

    @CjServiceRef(refByName = "curator.framework")
    CuratorFramework framework;

    @CjServiceRef
    ICuratorPathChecker curatorPathChecker;

    @CjServiceRef(refByName = "@.rabbitmq.producer.ack")
    IRabbitMQProducer ackRabbitMQProducer;

    @CjServiceRef
    IWenyBankExchangeTradeService wenyBankExchangeTradeService;
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
        LongString exchangerLS = (LongString) properties.getHeaders().get("exchanger");
        InterProcessReadWriteLock lock = new InterProcessReadWriteLock(framework, path);
        InterProcessMutex mutex = lock.writeLock();
        try {
            mutex.acquire();
            ExchangeResponse response = exchange(properties, body);
            response.setMessage("ok");
            response.setStatus("200");
            response.setRecordSN(record_snLS.toString());
            //发送消息到交易网关，标记申购状态为：已申购，如果出错，标记为错误状态，交记录错误信息
            _sendAck(response);
        } catch (RabbitMQException e) {
            ExchangeResponse response = new ExchangeResponse();
            response.setStatus("500");
            response.setMessage(e.getMessage());
            response.setRecordSN(record_snLS.toString());
            try {
                _sendAck(response);
            } catch (CircuitException ex) {
                throw new RabbitMQException(ex.getStatus(), ex.getMessage());
            }
            throw e;
        } catch (Exception e) {
            ExchangeResponse response = new ExchangeResponse();
            response.setStatus("500");
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


    private void _sendAck(ExchangeResponse response) throws CircuitException {
        AMQP.BasicProperties properties = new AMQP.BasicProperties().builder()
                .type("/wybank.ports")
                .headers(new HashMap() {
                    {
                        put("state", response.getStatus());
                        put("message", response.getMessage());
                        put("command", "ackExchange");
                        put("purchaser", response.getExchanger());
                        put("purchaserName", response.getExchangerName());
                        put("wenyBankID", response.getWenyBankID());
                        put("record_sn", response.getRecordSN());
                    }
                }).build();
        byte[] body = null;
        if (!"200".equals(response.getStatus())) {
            body = new byte[0];
        } else {
            body = new Gson().toJson(response.getRecord()).getBytes();
        }
        ackRabbitMQProducer.publish("gateway",properties, body);
    }

    private ExchangeResponse exchange(AMQP.BasicProperties properties, byte[] body)throws CircuitException {
        LongString wenyBankIDLS = (LongString) properties.getHeaders().get("wenyBankID");
        LongString exchangerLS = (LongString) properties.getHeaders().get("exchanger");
        LongString exchangerNameLS = (LongString) properties.getHeaders().get("exchangerName");
//        LongString record_snLS = (LongString) properties.getHeaders().get("record_sn");

        ExchangeWenyBO exchangeWenyBO = new ExchangeWenyBO();
        exchangeWenyBO.setWenyBankID(wenyBankIDLS.toString());
        exchangeWenyBO.setExchanger(exchangerLS.toString());
        exchangeWenyBO.setExchangerName(exchangerNameLS.toString());
        exchangeWenyBO.setRecord(new Gson().fromJson(new String(body), ExchangeRecord.class));

        wenyBankExchangeTradeService.exchange(exchangeWenyBO);
        ExchangeResponse response = new ExchangeResponse();
        response.setExchanger(exchangeWenyBO.getExchanger());
        response.setExchangerName(exchangeWenyBO.getExchangerName());
        response.setRecord(exchangeWenyBO.getRecord());
        response.setWenyBankID(exchangeWenyBO.getWenyBankID());
        return response;
    }
}
