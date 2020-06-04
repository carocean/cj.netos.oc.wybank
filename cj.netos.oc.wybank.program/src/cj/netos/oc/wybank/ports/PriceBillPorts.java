package cj.netos.oc.wybank.ports;

import cj.netos.oc.wybank.IPriceBillService;
import cj.netos.oc.wybank.model.PriceBill;
import cj.netos.oc.wybank.openports.IPriceBillPorts;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.ISecuritySession;

import java.util.List;

@CjService(name = "/bill/price.ports")
public class PriceBillPorts implements IPriceBillPorts {
    @CjServiceRef
    IPriceBillService priceBillService;

    @Override
    public List<PriceBill> pagePriceBill(ISecuritySession securitySession, String wenyBankID, int limit, long offset) throws CircuitException {
        return priceBillService.pagePriceBill(wenyBankID, limit, offset);
    }

    @Override
    public List<PriceBill> getAfterTimePriceBill(ISecuritySession securitySession, String wenyBankID, String ctime) throws CircuitException {
        return priceBillService.getAfterTimePriceBill(wenyBankID,ctime);
    }

    @Override
    public List<PriceBill> getPriceBillOfMonth(ISecuritySession securitySession, String wenyBankID, int year, int month, int limit, long offset) throws CircuitException {
        return priceBillService.getPriceBillOfMonth(wenyBankID, year, month, limit, offset);
    }

    @Override
    public List<PriceBill> getPriceBillOfDay(ISecuritySession securitySession, String wenyBankID, int year, int month, int day, int limit, long offset) throws CircuitException {
        return priceBillService.getPriceBillOfDay(wenyBankID, year, month, day, limit, offset);
    }
}
