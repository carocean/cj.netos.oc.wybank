package cj.netos.oc.wybank.service;

import cj.netos.oc.wybank.IFreeBillService;
import cj.netos.oc.wybank.mapper.FreeBillMapper;
import cj.netos.oc.wybank.model.FreeBill;
import cj.netos.oc.wybank.model.FreeBillExample;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;

import java.util.List;

@CjBridge(aspects = "@transaction")
@CjService(name = "freeBillService")
public class FreeBillService implements IFreeBillService {

    @CjServiceRef(refByName = "mybatis.cj.netos.oc.wybank.mapper.FreeBillMapper")
    FreeBillMapper freeBillMapper;

    @CjTransaction
    @Override
    public List<FreeBill> pageBill(String wenyBankID, int limit, long offset) {
        return freeBillMapper.page(wenyBankID, limit, offset);
    }

    @CjTransaction
    @Override
    public List<FreeBill> getBillOfMonth(String wenyBankID, int month) {
        FreeBillExample example = new FreeBillExample();
        example.createCriteria().andMonthEqualTo(month);
        return freeBillMapper.selectByExample(example);
    }

    @CjTransaction
    @Override
    public long getTotalInBillOfMonth(String wenyBankID, int month) {
        return freeBillMapper.totalInBillOfMonth(wenyBankID, month);
    }

    @CjTransaction
    @Override
    public long totalOutBillOfMonth(String wenyBankID, int month) {
        return freeBillMapper.totalOutBillOfMonth(wenyBankID, month);
    }

    @CjTransaction
    @Override
    public long totalInBillOfYear(String wenyBankID, int year) {
        return freeBillMapper.totalInBillOfYear(wenyBankID, year);
    }

    @CjTransaction
    @Override
    public long totalOutBillOfYear(String wenyBankID, int year) {
        return freeBillMapper.totalOutBillOfYear(wenyBankID, year);
    }
}
