package cj.netos.oc.wybank;

import cj.netos.oc.wybank.bo.ExchangeWenyBO;
import cj.studio.ecm.net.CircuitException;

public interface IWenyBankExchangeTradeService {
    void exchange(ExchangeWenyBO exchangeWenyBO) throws CircuitException;

}
