package cj.netos.oc.wybank;

import cj.netos.oc.wybank.bo.model.*;
import cj.netos.oc.wybank.model.*;

import java.math.BigDecimal;

public interface IBucketService {
    FundBucket getAndInitFundBucket(String bankid);


    void updateFundBucket(String bankid, Long balance);

    FreezenBucket getAndInitFreezenBucket(String bankid);

    void updateFreezenBucket(String bankid, Long balance);

    FreeBucket getAndInitFreeBucket(String bankid);

    void updateFreeBucket(String bankid, Long balance);

    PriceBucket getandInitPriceBucket(String bankid);

    StockBucket getAndInitStockBucket(String bankid);

    void updateStockBucket(String bankid, BigDecimal balance);

    void updatePriceBucket(String bankid, BigDecimal afterPrice);

}
