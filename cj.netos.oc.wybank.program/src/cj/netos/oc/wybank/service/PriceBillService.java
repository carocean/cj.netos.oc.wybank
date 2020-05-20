package cj.netos.oc.wybank.service;

import cj.netos.oc.wybank.IPriceBillService;
import cj.netos.oc.wybank.mapper.PriceBillMapper;
import cj.netos.oc.wybank.model.PriceBill;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;

import java.util.List;

@CjService(name = "priceBillService")
public class PriceBillService implements IPriceBillService {
    @CjServiceRef(refByName = "mybatis.cj.netos.oc.wybank.mapper.PriceBillMapper")
    PriceBillMapper priceBillMapper;

    @CjTransaction
    @Override
    public List<PriceBill> pagePriceBill(String wenyBankID, int limit, long offset) {
        return priceBillMapper.pagePriceBill(wenyBankID, limit, offset);
    }

    @CjTransaction
    @Override
    public List<PriceBill> getPriceBillOfMonth(String wenyBankID, int year, int month, int limit, long offset) {
        return priceBillMapper.getPriceBillOfMonth(wenyBankID, year, month, limit, offset);
    }

    @CjTransaction
    @Override
    public List<PriceBill> getPriceBillOfDay(String wenyBankID, int year, int month, int day, int limit, long offset) {
        return priceBillMapper.getPriceBillOfDay(wenyBankID, year, month, day, limit, offset);
    }
}
