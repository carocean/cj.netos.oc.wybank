package cj.netos.oc.wybank.ports;

import cj.netos.oc.wybank.IBucketService;
import cj.netos.oc.wybank.model.*;
import cj.netos.oc.wybank.openports.IBucketPorts;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.ISecuritySession;

import java.util.List;
import java.util.Map;

@CjService(name = "/balance.ports")
public class BucketPorts implements IBucketPorts {

    @CjServiceRef
    IBucketService bucketService;

    @Override
    public PriceBucket getPriceBucket(ISecuritySession securitySession, String wenyBankID) throws CircuitException {
        return bucketService.getandInitPriceBucket(wenyBankID);
    }

    @Override
    public List<PriceBucket> pagePriceBucket(ISecuritySession securitySession, int limit, long offset) throws CircuitException {
        return bucketService.pagePriceBucket(limit,offset);
    }

    @Override
    public FundBucket getFundBucket(ISecuritySession securitySession, String wenyBankID) throws CircuitException {
        return bucketService.getAndInitFundBucket(wenyBankID);
    }

    @Override
    public List<FundBucket> pageFundBucket(ISecuritySession securitySession, int limit, long offset) throws CircuitException {
        return bucketService.pageFundBucket(limit,offset);
    }

    @Override
    public FreezenBucket getFreezenBucket(ISecuritySession securitySession, String wenyBankID) throws CircuitException {
        return bucketService.getAndInitFreezenBucket(wenyBankID);
    }

    @Override
    public List<FreezenBucket> pageFreezenBucket(ISecuritySession securitySession, int limit, long offset) throws CircuitException {
        return bucketService.pageFreezenBucket(limit,offset);
    }

    @Override
    public FreeBucket getFreeBucket(ISecuritySession securitySession, String wenyBankID) throws CircuitException {
        return bucketService.getAndInitFreeBucket(wenyBankID);
    }

    @Override
    public List<FreeBucket> pageFreeBucket(ISecuritySession securitySession, int limit, long offset) throws CircuitException {
        return bucketService.pageFreeBucket(limit,offset);
    }

    @Override
    public StockBucket getStockBucket(ISecuritySession securitySession, String wenyBankID) throws CircuitException {
        return bucketService.getAndInitStockBucket(wenyBankID);
    }

    @Override
    public List<StockBucket> pageStockBucket(ISecuritySession securitySession, int limit, long offset) throws CircuitException {
        return bucketService.pageStockBucket(limit,offset);
    }

    @Override
    public Map<String, Object> getAllBucketOfBank(ISecuritySession securitySession, String wenyBankID) throws CircuitException {
        return bucketService.getAllBucketOfBank(wenyBankID);
    }

}
