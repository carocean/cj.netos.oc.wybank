package cj.netos.oc.wybank.ports;

import cj.netos.oc.wybank.IFreezenBillService;
import cj.netos.oc.wybank.model.FreezenBill;
import cj.netos.oc.wybank.openports.IFreezenBillPorts;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.ISecuritySession;

import java.util.List;

@CjService(name = "/bill/freezen.ports")
public class FreezenBillPorts implements IFreezenBillPorts {
    @CjServiceRef
    IFreezenBillService freezenBillService;

    @Override
    public List<FreezenBill> pageBill(ISecuritySession securitySession, String wenyBankID, int limit, long offset) throws CircuitException {
        return freezenBillService.pageBill(wenyBankID, limit, offset);
    }

    @Override
    public List<FreezenBill> getBillOfMonth(ISecuritySession securitySession, String wenyBankID, int month) throws CircuitException {
        return freezenBillService.getBillOfMonth(wenyBankID,month);
    }

    @Override
    public long totalInBillOfMonth(ISecuritySession securitySession, String wenyBankID, int month) throws CircuitException {
        return freezenBillService.getTotalInBillOfMonth(wenyBankID,month);
    }

    @Override
    public long totalOutBillOfMonth(ISecuritySession securitySession, String wenyBankID, int month) throws CircuitException {
        return freezenBillService.totalOutBillOfMonth(wenyBankID,month);
    }

    @Override
    public long totalInBillOfYear(ISecuritySession securitySession, String wenyBankID, int year) throws CircuitException {
        return freezenBillService.totalInBillOfYear(wenyBankID,year);
    }

    @Override
    public long totalOutBillOfYear(ISecuritySession securitySession, String wenyBankID, int year) throws CircuitException {
        return freezenBillService.totalOutBillOfYear(wenyBankID,year);
    }
}
