package cj.netos.oc.wybank.ports;

import cj.netos.oc.wybank.IFreeBillService;
import cj.netos.oc.wybank.model.FreeBill;
import cj.netos.oc.wybank.openports.IFreeBillPorts;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.ISecuritySession;

import java.util.List;

@CjService(name = "/bill/free.ports")
public class FreeBillPorts implements IFreeBillPorts {
    @CjServiceRef
    IFreeBillService freeBillService;

    @Override
    public List<FreeBill> pageBill(ISecuritySession securitySession, String wenyBankID, int limit, long offset) throws CircuitException {
        return freeBillService.pageBill(wenyBankID, limit, offset);
    }

    @Override
    public List<FreeBill> getBillOfMonth(ISecuritySession securitySession, String wenyBankID, int year, int month, int limit, long offset) throws CircuitException {
        return freeBillService.getBillOfMonth(wenyBankID,year,month,limit,offset);
    }


    @Override
    public long totalInBillOfMonth(ISecuritySession securitySession, String wenyBankID,int year, int month) throws CircuitException {
        return freeBillService.getTotalInBillOfMonth(wenyBankID,year,month);
    }

    @Override
    public long totalOutBillOfMonth(ISecuritySession securitySession, String wenyBankID,int year, int month) throws CircuitException {
        return freeBillService.totalOutBillOfMonth(wenyBankID,year,month);
    }

    @Override
    public long totalInBillOfYear(ISecuritySession securitySession, String wenyBankID, int year) throws CircuitException {
        return freeBillService.totalInBillOfYear(wenyBankID,year);
    }

    @Override
    public long totalOutBillOfYear(ISecuritySession securitySession, String wenyBankID, int year) throws CircuitException {
        return freeBillService.totalOutBillOfYear(wenyBankID,year);
    }
}
