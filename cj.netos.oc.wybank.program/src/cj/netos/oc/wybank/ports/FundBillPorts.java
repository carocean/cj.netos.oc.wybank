package cj.netos.oc.wybank.ports;

import cj.netos.oc.wybank.IFundBillService;
import cj.netos.oc.wybank.model.FundBill;
import cj.netos.oc.wybank.openports.IFundBillPorts;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.ISecuritySession;

import java.util.List;

@CjService(name = "/bill/fund.ports")
public class FundBillPorts implements IFundBillPorts {
    @CjServiceRef
    IFundBillService fundBillService;

    @Override
    public List<FundBill> pageBill(ISecuritySession securitySession, String wenyBankID, int limit, long offset) throws CircuitException {
        return fundBillService.pageBill(wenyBankID, limit, offset);
    }

    @Override
    public List<FundBill> getBillOfMonth(ISecuritySession securitySession, String wenyBankID, int year, int month, int limit, long offset) throws CircuitException {
        return fundBillService.getBillOfMonth(wenyBankID, year, month, limit, offset);
    }

    @Override
    public long totalInBillOfMonth(ISecuritySession securitySession, String wenyBankID, int year, int month) throws CircuitException {
        return fundBillService.getTotalInBillOfMonth(wenyBankID, year, month);
    }

    @Override
    public long totalOutBillOfMonth(ISecuritySession securitySession, String wenyBankID, int year, int month) throws CircuitException {
        return fundBillService.totalOutBillOfMonth(wenyBankID, year, month);
    }

    @Override
    public long totalInBillOfYear(ISecuritySession securitySession, String wenyBankID, int year) throws CircuitException {
        return fundBillService.totalInBillOfYear(wenyBankID, year);
    }

    @Override
    public long totalOutBillOfYear(ISecuritySession securitySession, String wenyBankID, int year) throws CircuitException {
        return fundBillService.totalOutBillOfYear(wenyBankID, year);
    }

    @Override
    public long totalPurchaseFundOfDay(ISecuritySession securitySession, String wenyBankID, int year, int month, int day) throws CircuitException {
        return fundBillService.totalPurchaseFundOfDay(wenyBankID, year, month, day);
    }

    @Override
    public long totalExchangeFundOfDay(ISecuritySession securitySession, String wenyBankID, int year, int month, int day) throws CircuitException {
        return fundBillService.totalExchangeFundOfDay(wenyBankID, year, month, day);
    }
}
