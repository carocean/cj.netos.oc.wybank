package cj.netos.oc.wybank.ports;

import cj.netos.oc.wybank.IStockBillService;
import cj.netos.oc.wybank.model.StockBill;
import cj.netos.oc.wybank.openports.IStockBillPorts;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.ISecuritySession;

import java.math.BigDecimal;
import java.util.List;

@CjService(name = "/bill/stock.ports")
public class StockBillPorts implements IStockBillPorts {
    @CjServiceRef
    IStockBillService stockBillService;

    @Override
    public List<StockBill> pageBill(ISecuritySession securitySession, String wenyBankID, int limit, long offset) throws CircuitException {
        return stockBillService.pageBill(wenyBankID, limit, offset);
    }

    @Override
    public List<StockBill> getBillOfMonth(ISecuritySession securitySession, String wenyBankID, int year, int month, int limit, long offset) throws CircuitException {
        return stockBillService.getBillOfMonth(wenyBankID,year,month,limit,offset);
    }

    @Override
    public List<StockBill> pageBillOfMonth(ISecuritySession securitySession, String wenyBankID, int order, int year, int month, int limit, long offset) throws CircuitException {
        return stockBillService.pageBillOfMonth(wenyBankID,order,year,month,limit,offset);
    }

    @Override
    public BigDecimal totalInBillOfMonth(ISecuritySession securitySession, String wenyBankID,int year, int month) throws CircuitException {
        return stockBillService.getTotalInBillOfMonth(wenyBankID,year,month);
    }

    @Override
    public BigDecimal totalOutBillOfMonth(ISecuritySession securitySession, String wenyBankID, int year,int month) throws CircuitException {
        return stockBillService.totalOutBillOfMonth(wenyBankID,year,month);
    }

    @Override
    public BigDecimal totalInBillOfYear(ISecuritySession securitySession, String wenyBankID, int year) throws CircuitException {
        return stockBillService.totalInBillOfYear(wenyBankID,year);
    }

    @Override
    public BigDecimal totalOutBillOfYear(ISecuritySession securitySession, String wenyBankID, int year) throws CircuitException {
        return stockBillService.totalOutBillOfYear(wenyBankID,year);
    }
}
