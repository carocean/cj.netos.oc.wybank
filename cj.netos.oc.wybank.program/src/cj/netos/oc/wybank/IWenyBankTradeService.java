package cj.netos.oc.wybank;

import cj.netos.oc.wybank.bo.PurchaseWenyBO;
import cj.studio.ecm.net.CircuitException;

public interface IWenyBankTradeService {
    void purchase(PurchaseWenyBO purchaseWenyBO) throws CircuitException;

}
