package cj.netos.oc.wybank.service;

import cj.netos.oc.wybank.IFreezenBillService;
import cj.netos.oc.wybank.mapper.FreezenBillMapper;
import cj.netos.oc.wybank.model.FreeBill;
import cj.netos.oc.wybank.model.FreeBillExample;
import cj.netos.oc.wybank.model.FreezenBill;
import cj.netos.oc.wybank.model.FreezenBillExample;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;

import java.util.List;

@CjBridge(aspects = "@transaction")
@CjService(name = "freezenBillService")
public class FreezenBillService implements IFreezenBillService {

    @CjServiceRef(refByName = "mybatis.cj.netos.oc.wybank.mapper.FreezenBillMapper")
    FreezenBillMapper freezenBillMapper;

    @CjTransaction
    @Override
    public List<FreezenBill> pageBill(String wenyBankID, int limit, long offset) {
        return freezenBillMapper.page(wenyBankID, limit, offset);
    }

    @CjTransaction
    @Override
    public List<FreezenBill> getBillOfMonth(String wenyBankID, int year, int month, int limit, long offset) {
        return freezenBillMapper.getBillOfMonth(wenyBankID, year, month, limit, offset);
    }

    @CjTransaction
    @Override
    public List<FreezenBill> pageBillOfMonth(String wenyBankID, int order, int year, int month, int limit, long offset) {
        return freezenBillMapper.pageBillOfMonth(wenyBankID,order, year, month, limit, offset);
    }

    @CjTransaction
    @Override
    public long getTotalInBillOfMonth(String wenyBankID, int year, int month) {
        return freezenBillMapper.totalInBillOfMonth(wenyBankID, year, month);
    }

    @CjTransaction
    @Override
    public long totalOutBillOfMonth(String wenyBankID, int year, int month) {
        return freezenBillMapper.totalOutBillOfMonth(wenyBankID, year, month);
    }

    @CjTransaction
    @Override
    public long totalInBillOfYear(String wenyBankID, int year) {
        return freezenBillMapper.totalInBillOfYear(wenyBankID, year);
    }

    @CjTransaction
    @Override
    public long totalOutBillOfYear(String wenyBankID, int year) {
        return freezenBillMapper.totalOutBillOfYear(wenyBankID, year);
    }
}
