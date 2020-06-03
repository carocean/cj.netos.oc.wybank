package cj.netos.oc.wybank.service;

import cj.netos.oc.wybank.IFundBillService;
import cj.netos.oc.wybank.mapper.FundBillMapper;
import cj.netos.oc.wybank.model.FreezenBillExample;
import cj.netos.oc.wybank.model.FundBill;
import cj.netos.oc.wybank.model.FundBillExample;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;

import java.util.List;

@CjBridge(aspects = "@transaction")
@CjService(name = "fundBillService")
public class FundBillService implements IFundBillService {

    @CjServiceRef(refByName = "mybatis.cj.netos.oc.wybank.mapper.FundBillMapper")
    FundBillMapper fundBillMapper;

    @CjTransaction
    @Override
    public List<FundBill> pageBill(String wenyBankID, int limit, long offset) {
        return fundBillMapper.page(wenyBankID, limit, offset);
    }
    @CjTransaction
    @Override
    public List<FundBill> getBillOfMonth(String wenyBankID, int year, int month, int limit, long offset) {
        return fundBillMapper.getBillOfMonth(wenyBankID,year,month,limit,offset);
    }


    @CjTransaction
    @Override
    public long getTotalInBillOfMonth(String wenyBankID,int year, int month) {
        return fundBillMapper.totalInBillOfMonth(wenyBankID,year, month);
    }

    @CjTransaction
    @Override
    public long totalOutBillOfMonth(String wenyBankID,int year, int month) {
        return fundBillMapper.totalOutBillOfMonth(wenyBankID,year, month);
    }

    @CjTransaction
    @Override
    public long totalInBillOfYear(String wenyBankID, int year) {
        return fundBillMapper.totalInBillOfYear(wenyBankID, year);
    }

    @CjTransaction
    @Override
    public long totalOutBillOfYear(String wenyBankID, int year) {
        return fundBillMapper.totalOutBillOfYear(wenyBankID, year);
    }

    @CjTransaction
    @Override
    public long totalPurchaseFundOfDay(String wenyBankID,int year, int month,int day) {
        return fundBillMapper.totalPurchaseFundOfDay(wenyBankID,year, month,day);
    }

    @CjTransaction
    @Override
    public long totalExchangeFundOfDay(String wenyBankID,int year, int month,int day) {
        return fundBillMapper.totalExchangeFundOfDay(wenyBankID,year, month,day);
    }
}
