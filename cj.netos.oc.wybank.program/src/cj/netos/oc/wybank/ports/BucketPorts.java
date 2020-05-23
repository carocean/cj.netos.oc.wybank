package cj.netos.oc.wybank.ports;

import cj.netos.oc.wybank.IBucketService;
import cj.netos.oc.wybank.ICuratorPathChecker;
import cj.netos.oc.wybank.model.*;
import cj.netos.oc.wybank.openports.IBucketPorts;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.ISecuritySession;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.framework.recipes.locks.InterProcessReadWriteLock;

import java.util.List;
import java.util.Map;

@CjService(name = "/balance.ports")
public class BucketPorts implements IBucketPorts {

    @CjServiceRef
    IBucketService bucketService;
    @CjServiceRef(refByName = "curator.framework")
    CuratorFramework framework;

    @CjServiceRef
    ICuratorPathChecker curatorPathChecker;

    @Override
    public PriceBucket getPriceBucket(ISecuritySession securitySession, String wenyBankID) throws CircuitException {
        String path = String.format("/wenybank/%s/locks", wenyBankID);
        try {
            curatorPathChecker.check(framework, path);
        } catch (Exception e) {
            throw new CircuitException("500", e);
        }
        InterProcessReadWriteLock lock = new InterProcessReadWriteLock(framework, path);
        InterProcessMutex mutex = lock.writeLock();
        try {
            mutex.acquire();
            return bucketService.getandInitPriceBucket(wenyBankID);
        } catch (Exception e) {
            CircuitException ce = CircuitException.search(e);
            if (ce != null) {
                throw ce;
            }
            throw new CircuitException("500", e);
        } finally {
            try {
                mutex.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<PriceBucket> pagePriceBucket(ISecuritySession securitySession, int limit, long offset) throws CircuitException {
        return bucketService.pagePriceBucket(limit, offset);
    }

    @Override
    public FundBucket getFundBucket(ISecuritySession securitySession, String wenyBankID) throws CircuitException {
        String path = String.format("/wenybank/%s/locks", wenyBankID);
        try {
            curatorPathChecker.check(framework, path);
        } catch (Exception e) {
            throw new CircuitException("500", e);
        }
        InterProcessReadWriteLock lock = new InterProcessReadWriteLock(framework, path);
        InterProcessMutex mutex = lock.writeLock();
        try {
            mutex.acquire();
            return bucketService.getAndInitFundBucket(wenyBankID);
        } catch (Exception e) {
            CircuitException ce = CircuitException.search(e);
            if (ce != null) {
                throw ce;
            }
            throw new CircuitException("500", e);
        } finally {
            try {
                mutex.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public List<FundBucket> pageFundBucket(ISecuritySession securitySession, int limit, long offset) throws CircuitException {
        return bucketService.pageFundBucket(limit, offset);
    }

    @Override
    public FreezenBucket getFreezenBucket(ISecuritySession securitySession, String wenyBankID) throws CircuitException {

        String path = String.format("/wenybank/%s/locks", wenyBankID);
        try {
            curatorPathChecker.check(framework, path);
        } catch (Exception e) {
            throw new CircuitException("500", e);
        }
        InterProcessReadWriteLock lock = new InterProcessReadWriteLock(framework, path);
        InterProcessMutex mutex = lock.writeLock();
        try {
            mutex.acquire();
            return bucketService.getAndInitFreezenBucket(wenyBankID);
        } catch (Exception e) {
            CircuitException ce = CircuitException.search(e);
            if (ce != null) {
                throw ce;
            }
            throw new CircuitException("500", e);
        } finally {
            try {
                mutex.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<FreezenBucket> pageFreezenBucket(ISecuritySession securitySession, int limit, long offset) throws CircuitException {
        return bucketService.pageFreezenBucket(limit, offset);
    }

    @Override
    public FreeBucket getFreeBucket(ISecuritySession securitySession, String wenyBankID) throws CircuitException {

        String path = String.format("/wenybank/%s/locks", wenyBankID);
        try {
            curatorPathChecker.check(framework, path);
        } catch (Exception e) {
            throw new CircuitException("500", e);
        }
        InterProcessReadWriteLock lock = new InterProcessReadWriteLock(framework, path);
        InterProcessMutex mutex = lock.writeLock();
        try {
            mutex.acquire();
            return bucketService.getAndInitFreeBucket(wenyBankID);
        } catch (Exception e) {
            CircuitException ce = CircuitException.search(e);
            if (ce != null) {
                throw ce;
            }
            throw new CircuitException("500", e);
        } finally {
            try {
                mutex.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<FreeBucket> pageFreeBucket(ISecuritySession securitySession, int limit, long offset) throws CircuitException {
        return bucketService.pageFreeBucket(limit, offset);
    }

    @Override
    public StockBucket getStockBucket(ISecuritySession securitySession, String wenyBankID) throws CircuitException {


        String path = String.format("/wenybank/%s/locks", wenyBankID);
        try {
            curatorPathChecker.check(framework, path);
        } catch (Exception e) {
            throw new CircuitException("500", e);
        }
        InterProcessReadWriteLock lock = new InterProcessReadWriteLock(framework, path);
        InterProcessMutex mutex = lock.writeLock();
        try {
            mutex.acquire();
            return bucketService.getAndInitStockBucket(wenyBankID);
        } catch (Exception e) {
            CircuitException ce = CircuitException.search(e);
            if (ce != null) {
                throw ce;
            }
            throw new CircuitException("500", e);
        } finally {
            try {
                mutex.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<StockBucket> pageStockBucket(ISecuritySession securitySession, int limit, long offset) throws CircuitException {
        return bucketService.pageStockBucket(limit, offset);
    }

    @Override
    public Map<String, Object> getAllBucketOfBank(ISecuritySession securitySession, String wenyBankID) throws CircuitException {

        String path = String.format("/wenybank/%s/locks", wenyBankID);
        try {
            curatorPathChecker.check(framework, path);
        } catch (Exception e) {
            throw new CircuitException("500", e);
        }
        InterProcessReadWriteLock lock = new InterProcessReadWriteLock(framework, path);
        InterProcessMutex mutex = lock.writeLock();
        try {
            mutex.acquire();
            return bucketService.getAllBucketOfBank(wenyBankID);
        } catch (Exception e) {
            CircuitException ce = CircuitException.search(e);
            if (ce != null) {
                throw ce;
            }
            throw new CircuitException("500", e);
        } finally {
            try {
                mutex.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
