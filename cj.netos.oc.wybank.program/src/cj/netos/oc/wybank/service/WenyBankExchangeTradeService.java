package cj.netos.oc.wybank.service;

import cj.netos.oc.wybank.IBucketService;
import cj.netos.oc.wybank.IWenyBankExchangeTradeService;
import cj.netos.oc.wybank.bo.ExchangeWenyBO;
import cj.netos.oc.wybank.bo.model.ExchangeRecord;
import cj.netos.oc.wybank.mapper.FreezenBillMapper;
import cj.netos.oc.wybank.mapper.FundBillMapper;
import cj.netos.oc.wybank.mapper.PriceBillMapper;
import cj.netos.oc.wybank.mapper.StockBillMapper;
import cj.netos.oc.wybank.model.*;
import cj.netos.oc.wybank.util.BankUtils;
import cj.netos.oc.wybank.util.IdWorker;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;

import java.math.BigDecimal;
import java.math.RoundingMode;

@CjBridge(aspects = "@transaction")
@CjService(name = "wenyBankExchangeTradeService")
public class WenyBankExchangeTradeService implements IWenyBankExchangeTradeService {
    @CjServiceRef(refByName = "mybatis.cj.netos.oc.wybank.mapper.FundBillMapper")
    FundBillMapper fundBillMapper;
    @CjServiceRef(refByName = "mybatis.cj.netos.oc.wybank.mapper.FreezenBillMapper")
    FreezenBillMapper freezenBillMapper;
    @CjServiceRef(refByName = "mybatis.cj.netos.oc.wybank.mapper.PriceBillMapper")
    PriceBillMapper priceBillMapper;
    @CjServiceRef(refByName = "mybatis.cj.netos.oc.wybank.mapper.StockBillMapper")
    StockBillMapper stockBillMapper;

    @CjServiceRef
    IBucketService bucketService;

    @CjTransaction
    @Override
    public void exchange(ExchangeWenyBO exchangeWenyBO) {
        ExchangeRecord record = exchangeWenyBO.getRecord();
        PriceBucket priceBucket = bucketService.getandInitPriceBucket(record.getBankid());
        long payableAmount = priceBucket.getPrice().multiply(record.getStock()).setScale(0, RoundingMode.HALF_DOWN).longValue();
        record.setPrice(priceBucket.getPrice());
        record.setAmount(payableAmount);
        record.setProfit(record.getAmount()-record.getPurchaseAmount() );

        addStockBill(record);
        addFundBill(record, payableAmount);
        addFreezenBill(record, payableAmount);
        addPriceBill(record, priceBucket);

    }

    private void addPriceBill(ExchangeRecord record, PriceBucket priceBucket) {
        PriceBill priceBill = new PriceBill();
        priceBill.setPrice(priceBucket.getPrice());
        priceBill.setBankid(record.getBankid());
        priceBill.setCtime(BankUtils.dateTimeToSecond(System.currentTimeMillis()));
        priceBill.setNote(record.getNote());
        priceBill.setOrder(1);
        priceBill.setParticipant(record.getExchanger());
        priceBill.setRefsn(record.getSn());
        priceBill.setSn(IdWorker.nextId());
        priceBill.setTitle(record.getPersonName());
        priceBill.setWorkday(BankUtils.dateTimeToDay(System.currentTimeMillis()));

        FreezenBucket freezenBucket = bucketService.getAndInitFreezenBucket(record.getBankid());
        StockBucket stockBucket = bucketService.getAndInitStockBucket(record.getBankid());
        BigDecimal afterPrice = new BigDecimal(freezenBucket.getAmount()).divide(stockBucket.getStock(), 14, RoundingMode.HALF_DOWN);
        if (afterPrice.compareTo(new BigDecimal("0.001")) < 0) {
            afterPrice = new BigDecimal("0.001");
        }
        priceBill.setAfterPrice(afterPrice);

        priceBillMapper.insert(priceBill);

        bucketService.updatePriceBucket(priceBill.getBankid(), priceBill.getAfterPrice());
    }

    private void addFreezenBill(ExchangeRecord record, long payableAmount) {
        FreezenBill freezenBill = new FreezenBill();
        freezenBill.setAmount(payableAmount * -1);
        freezenBill.setBankid(record.getBankid());
        freezenBill.setCtime(BankUtils.dateTimeToSecond(System.currentTimeMillis()));
        freezenBill.setNote(record.getNote());
        freezenBill.setOrder(1);
        freezenBill.setParticipant(record.getExchanger());
        freezenBill.setRefsn(record.getSn());
        freezenBill.setSn(IdWorker.nextId());
        freezenBill.setTitle(record.getPersonName());
        freezenBill.setWorkday(BankUtils.dateTimeToDay(System.currentTimeMillis()));

        FreezenBucket freezenBucket = bucketService.getAndInitFreezenBucket(record.getBankid());

        freezenBill.setBalance(freezenBucket.getAmount() + freezenBill.getAmount());

        freezenBillMapper.insert(freezenBill);

        bucketService.updateFreezenBucket(freezenBill.getBankid(), freezenBill.getBalance());
    }

    private void addFundBill(ExchangeRecord record, long payableAmount) {
        FundBill fundBill = new FundBill();
        fundBill.setAmount(payableAmount * -1);
        fundBill.setBankid(record.getBankid());
        fundBill.setCtime(BankUtils.dateTimeToSecond(System.currentTimeMillis()));
        fundBill.setNote(record.getNote());
        fundBill.setOrder(1);
        fundBill.setParticipant(record.getExchanger());
        fundBill.setRefsn(record.getSn());
        fundBill.setSn(IdWorker.nextId());
        fundBill.setWorkday(BankUtils.dateTimeToDay(System.currentTimeMillis()));
        fundBill.setTitle(record.getPersonName());

        FundBucket fundBucket = bucketService.getAndInitFundBucket(record.getBankid());

        fundBill.setBalance(fundBucket.getAmount() + fundBill.getAmount());

        fundBillMapper.insert(fundBill);

        bucketService.updateFundBucket(fundBill.getBankid(), fundBill.getBalance());
    }

    private void addStockBill(ExchangeRecord record) {
        StockBill stockBill = new StockBill();
        stockBill.setStock(record.getStock().multiply(new BigDecimal("-1.0")).setScale(14, RoundingMode.HALF_DOWN));
        stockBill.setBankid(record.getBankid());
        stockBill.setCtime(BankUtils.dateTimeToSecond(System.currentTimeMillis()));
        stockBill.setNote(record.getNote());
        stockBill.setOrder(1);
        stockBill.setParticipant(record.getExchanger());
        stockBill.setRefsn(record.getSn());
        stockBill.setSn(IdWorker.nextId());
        stockBill.setTitle(record.getPersonName());
        stockBill.setWorkday(BankUtils.dateTimeToDay(System.currentTimeMillis()));

        StockBucket stockBucket = bucketService.getAndInitStockBucket(record.getBankid());

        BigDecimal balance = stockBucket.getStock().add(stockBill.getStock()).setScale(14, RoundingMode.HALF_DOWN);
        stockBill.setBalance(balance);

        stockBillMapper.insert(stockBill);

        bucketService.updateStockBucket(stockBill.getBankid(), stockBill.getBalance());
    }
}
