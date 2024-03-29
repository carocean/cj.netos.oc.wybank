package cj.netos.oc.wybank.service;

import cj.netos.oc.wybank.IBucketService;
import cj.netos.oc.wybank.mapper.*;
import cj.netos.oc.wybank.model.*;
import cj.netos.rabbitmq.IRabbitMQProducer;
import cj.studio.ecm.CJSystem;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.util.Encript;
import cj.studio.orm.mybatis.annotation.CjTransaction;
import cj.ultimate.gson2.com.google.gson.Gson;
import com.rabbitmq.client.AMQP;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@CjBridge(aspects = "@transaction")
@CjService(name = "bucketService")
public class BucketService implements IBucketService {
    @CjServiceRef(refByName = "mybatis.cj.netos.oc.wybank.mapper.PriceBucketMapper")
    PriceBucketMapper priceBucketMapper;
    @CjServiceRef(refByName = "mybatis.cj.netos.oc.wybank.mapper.FundBucketMapper")
    FundBucketMapper fundBucketMapper;
    @CjServiceRef(refByName = "mybatis.cj.netos.oc.wybank.mapper.FreezenBucketMapper")
    FreezenBucketMapper freezenBucketMapper;
    @CjServiceRef(refByName = "mybatis.cj.netos.oc.wybank.mapper.FreeBucketMapper")
    FreeBucketMapper freeBucketMapper;
    @CjServiceRef(refByName = "mybatis.cj.netos.oc.wybank.mapper.StockBucketMapper")
    StockBucketMapper stockBucketMapper;

    @CjServiceRef(refByName = "@.rabbitmq.producer.price_notify")
    IRabbitMQProducer rabbitMQProducer;

    @CjTransaction
    @Override
    public FundBucket getAndInitFundBucket(String bankid) {
        FundBucketExample example = new FundBucketExample();
        example.createCriteria().andBankidEqualTo(bankid);
        List<FundBucket> list = fundBucketMapper.selectByExample(example);
        FundBucket fundBucket = null;
        if (list.isEmpty()) {
            fundBucket = new FundBucket();
            fundBucket.setAmount(0L);
            fundBucket.setBankid(bankid);
            fundBucket.setId(Encript.md5(UUID.randomUUID().toString()));
            fundBucketMapper.insert(fundBucket);
            return fundBucket;
        }
        return list.get(0);
    }

    @CjTransaction
    @Override
    public void updateFundBucket(String bankid, Long balance) {
        fundBucketMapper.updateAmount(balance, bankid);
    }

    @CjTransaction
    @Override
    public FreezenBucket getAndInitFreezenBucket(String bankid) {
        FreezenBucketExample example = new FreezenBucketExample();
        example.createCriteria().andBankidEqualTo(bankid);
        List<FreezenBucket> list = freezenBucketMapper.selectByExample(example);
        FreezenBucket freezenBucket = null;
        if (list.isEmpty()) {
            freezenBucket = new FreezenBucket();
            freezenBucket.setAmount(0L);
            freezenBucket.setBankid(bankid);
            freezenBucket.setId(Encript.md5(UUID.randomUUID().toString()));
            freezenBucketMapper.insert(freezenBucket);
            return freezenBucket;
        }
        return list.get(0);
    }

    @CjTransaction
    @Override
    public void updateFreezenBucket(String bankid, Long balance) {
        freezenBucketMapper.updateAmount(balance, bankid);
    }

    @CjTransaction
    @Override
    public FreeBucket getAndInitFreeBucket(String bankid) {
        FreeBucketExample example = new FreeBucketExample();
        example.createCriteria().andBankidEqualTo(bankid);
        List<FreeBucket> list = freeBucketMapper.selectByExample(example);
        FreeBucket freeBucket = null;
        if (list.isEmpty()) {
            freeBucket = new FreeBucket();
            freeBucket.setAmount(0L);
            freeBucket.setBankid(bankid);
            freeBucket.setId(Encript.md5(UUID.randomUUID().toString()));
            freeBucketMapper.insert(freeBucket);
            return freeBucket;
        }
        return list.get(0);
    }

    @CjTransaction
    @Override
    public void updateFreeBucket(String bankid, Long balance) {
        freeBucketMapper.updateAmount(balance, bankid);
    }

    @CjTransaction
    @Override
    public PriceBucket getandInitPriceBucket(String bankid) {
        PriceBucketExample example = new PriceBucketExample();
        example.createCriteria().andBankidEqualTo(bankid);
        List<PriceBucket> list = priceBucketMapper.selectByExample(example);
        PriceBucket priceBucket = null;
        if (list.isEmpty()) {
            priceBucket = new PriceBucket();
            priceBucket.setPrice(new BigDecimal(0.001));
            priceBucket.setBankid(bankid);
            priceBucket.setId(Encript.md5(UUID.randomUUID().toString()));
            priceBucketMapper.insert(priceBucket);
            return priceBucket;
        }
        return list.get(0);
    }

    @CjTransaction
    @Override
    public StockBucket getAndInitStockBucket(String bankid) {
        StockBucketExample example = new StockBucketExample();
        example.createCriteria().andBankidEqualTo(bankid);
        List<StockBucket> list = stockBucketMapper.selectByExample(example);
        StockBucket stockBucket = null;
        if (list.isEmpty()) {
            stockBucket = new StockBucket();
            stockBucket.setStock(new BigDecimal(0.0));
            stockBucket.setBankid(bankid);
            stockBucket.setId(Encript.md5(UUID.randomUUID().toString()));
            stockBucketMapper.insert(stockBucket);
            return stockBucket;
        }
        return list.get(0);
    }

    @CjTransaction
    @Override
    public void updateStockBucket(String bankid, BigDecimal balance) {
        stockBucketMapper.updateStock(balance, bankid);
    }

    @CjTransaction
    @Override
    public void updatePriceBucket(String bankid, BigDecimal afterPrice) {
        priceBucketMapper.updatePrice(afterPrice, bankid);

        AMQP.BasicProperties properties = new AMQP.BasicProperties().builder()
                .type("/notify/price.ports")
                .headers(new HashMap() {
                    {
                        put("command", "update");
                    }
                }).build();
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("bankid", bankid);
            map.put("price", afterPrice);
            rabbitMQProducer.publish("price_effector", properties, new Gson().toJson(map).getBytes());
        } catch (CircuitException e) {
            CJSystem.logging().error(getClass(), e);
        }
    }

    @CjTransaction
    @Override
    public Map<String, Object> getAllBucketOfBank(String wenyBankID) {
        Map<String, Object> map = new HashMap<>();
        map.put("free", getAndInitFreeBucket(wenyBankID));
        map.put("freezen", getAndInitFreezenBucket(wenyBankID));
        map.put("fund", getAndInitFundBucket(wenyBankID));
        map.put("price", getandInitPriceBucket(wenyBankID));
        map.put("stock", getAndInitStockBucket(wenyBankID));
        return map;
    }

    @CjTransaction
    @Override
    public List<StockBucket> pageStockBucket(int limit, long offset) {
        return stockBucketMapper.page(limit, offset);
    }

    @CjTransaction
    @Override
    public List<FreeBucket> pageFreeBucket(int limit, long offset) {
        return freeBucketMapper.page(limit, offset);
    }

    @CjTransaction
    @Override
    public List<FreezenBucket> pageFreezenBucket(int limit, long offset) {
        return freezenBucketMapper.page(limit, offset);
    }

    @CjTransaction
    @Override
    public List<FundBucket> pageFundBucket(int limit, long offset) {
        return fundBucketMapper.page(limit, offset);
    }

    @CjTransaction
    @Override
    public List<PriceBucket> pagePriceBucket(int limit, long offset) {
        return priceBucketMapper.page(limit, offset);
    }
}
