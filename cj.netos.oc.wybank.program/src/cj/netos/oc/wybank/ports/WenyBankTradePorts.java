package cj.netos.oc.wybank.ports;

import cj.netos.oc.wybank.IWenyBankTradeService;
import cj.netos.oc.wybank.bo.PurchaseWenyBO;
import cj.netos.oc.wybank.openports.IWenyBankTradePorts;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.ISecuritySession;

@CjService(name = "/trade.ports")
public class WenyBankTradePorts implements IWenyBankTradePorts {
    @CjServiceRef
    IWenyBankTradeService wenyBankTradeService;

    @Override
    public void purchase(ISecuritySession securitySession, PurchaseWenyBO purchaseWenyBO) throws CircuitException {
        wenyBankTradeService.purchase(purchaseWenyBO);
    }
}
