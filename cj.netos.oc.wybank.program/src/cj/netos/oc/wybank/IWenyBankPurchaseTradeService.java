package cj.netos.oc.wybank;

import cj.netos.oc.wybank.bo.PurchaseWenyBO;
import cj.studio.ecm.net.CircuitException;

public interface IWenyBankPurchaseTradeService {
    void purchase(PurchaseWenyBO purchaseWenyBO) throws CircuitException;

}
