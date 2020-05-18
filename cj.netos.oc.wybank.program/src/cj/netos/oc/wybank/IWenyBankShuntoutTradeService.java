package cj.netos.oc.wybank;

import cj.netos.oc.wybank.bo.ShuntoutBO;
import cj.studio.ecm.net.CircuitException;

public interface IWenyBankShuntoutTradeService {
    void shuntout(ShuntoutBO shuntoutBO) throws CircuitException;

}
