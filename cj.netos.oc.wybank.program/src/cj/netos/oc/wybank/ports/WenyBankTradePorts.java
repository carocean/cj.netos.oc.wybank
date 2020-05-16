package cj.netos.oc.wybank.ports;

import cj.netos.oc.wybank.IWenyBankExchangeTradeService;
import cj.netos.oc.wybank.IWenyBankPurchaseTradeService;
import cj.netos.oc.wybank.bo.ExchangeResponse;
import cj.netos.oc.wybank.bo.ExchangeWenyBO;
import cj.netos.oc.wybank.bo.PurchaseResponse;
import cj.netos.oc.wybank.bo.PurchaseWenyBO;
import cj.netos.oc.wybank.openports.IWenyBankTradePorts;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.ISecuritySession;

@CjService(name = "/trade.ports")
public class WenyBankTradePorts implements IWenyBankTradePorts {
    @CjServiceRef
    IWenyBankPurchaseTradeService wenyBankPurchaseTradeService;

    @CjServiceRef
    IWenyBankExchangeTradeService wenyBankExchangeTradeService;

    @Override
    public PurchaseResponse purchase(ISecuritySession securitySession, PurchaseWenyBO purchaseWenyBO) throws CircuitException {
        wenyBankPurchaseTradeService.purchase(purchaseWenyBO);

        PurchaseResponse response = new PurchaseResponse();
        response.setPurchaser(purchaseWenyBO.getPurchaser());
        response.setPurchaserName(purchaseWenyBO.getPurchaserName());
        response.setRecord(purchaseWenyBO.getRecord());
        response.setWenyBankID(purchaseWenyBO.getWenyBankID());
        return response;
    }

    @Override
    public ExchangeResponse exchange(ISecuritySession securitySession, ExchangeWenyBO exchangeWenyBO) throws CircuitException {
        wenyBankExchangeTradeService.exchange(exchangeWenyBO);
        ExchangeResponse response = new ExchangeResponse();
        response.setExchanger(exchangeWenyBO.getExchanger());
        response.setExchangerName(exchangeWenyBO.getExchangerName());
        response.setRecord(exchangeWenyBO.getRecord());
        response.setWenyBankID(exchangeWenyBO.getWenyBankID());
        return response;
    }
}
