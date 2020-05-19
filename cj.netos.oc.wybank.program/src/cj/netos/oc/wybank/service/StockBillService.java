package cj.netos.oc.wybank.service;

import cj.netos.oc.wybank.IStockBillService;
import cj.netos.oc.wybank.mapper.StockBillMapper;
import cj.netos.oc.wybank.model.StockBill;
import cj.netos.oc.wybank.model.StockBillExample;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;

import java.math.BigDecimal;
import java.util.List;

@CjBridge(aspects = "@transaction")
@CjService(name = "stockBillService")
public class StockBillService implements IStockBillService {

    @CjServiceRef(refByName = "mybatis.cj.netos.oc.wybank.mapper.StockBillMapper")
    StockBillMapper stockBillMapper;

    @CjTransaction
    @Override
    public List<StockBill> pageBill(String wenyBankID, int limit, long offset) {
        return stockBillMapper.page(wenyBankID, limit, offset);
    }

    @CjTransaction
    @Override
    public List<StockBill> getBillOfMonth(String wenyBankID, int month) {
        StockBillExample example = new StockBillExample();
        example.createCriteria().andMonthEqualTo(month);
        return stockBillMapper.selectByExample(example);
    }

    @CjTransaction
    @Override
    public BigDecimal getTotalInBillOfMonth(String wenyBankID, int month) {
        BigDecimal bigDecimal= stockBillMapper.totalInBillOfMonth(wenyBankID, month);
        if (bigDecimal == null) {
            return new BigDecimal(0.00);
        }
        return bigDecimal;
    }

    @CjTransaction
    @Override
    public BigDecimal totalOutBillOfMonth(String wenyBankID, int month) {
        BigDecimal bigDecimal= stockBillMapper.totalOutBillOfMonth(wenyBankID, month);
        if (bigDecimal == null) {
            return new BigDecimal(0.00);
        }
        return bigDecimal;
    }

    @CjTransaction
    @Override
    public BigDecimal totalInBillOfYear(String wenyBankID, int year) {
        BigDecimal bigDecimal= stockBillMapper.totalInBillOfYear(wenyBankID, year);
        if (bigDecimal == null) {
            return new BigDecimal(0.00);
        }
        return bigDecimal;
    }

    @CjTransaction
    @Override
    public BigDecimal totalOutBillOfYear(String wenyBankID, int year) {
        BigDecimal bigDecimal= stockBillMapper.totalOutBillOfYear(wenyBankID, year);
        if (bigDecimal == null) {
            return new BigDecimal(0.00);
        }
        return bigDecimal;
    }
}
