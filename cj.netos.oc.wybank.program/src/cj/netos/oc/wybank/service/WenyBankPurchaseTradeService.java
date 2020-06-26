package cj.netos.oc.wybank.service;

import cj.netos.oc.wybank.IBucketService;
import cj.netos.oc.wybank.IWenyBankPurchaseTradeService;
import cj.netos.oc.wybank.bo.PurchaseWenyBO;
import cj.netos.oc.wybank.extern.model.PurchaseRecord;
import cj.netos.oc.wybank.mapper.*;
import cj.netos.oc.wybank.model.*;
import cj.netos.oc.wybank.util.BankUtils;
import cj.netos.oc.wybank.util.IdWorker;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.net.CircuitException;
import cj.studio.orm.mybatis.annotation.CjTransaction;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;

@CjBridge(aspects = "@transaction")
@CjService(name = "wenyBankPurchaseTradeService")
public class WenyBankPurchaseTradeService implements IWenyBankPurchaseTradeService {
    @CjServiceRef(refByName = "mybatis.cj.netos.oc.wybank.mapper.FundBillMapper")
    FundBillMapper fundBillMapper;
    @CjServiceRef(refByName = "mybatis.cj.netos.oc.wybank.mapper.FreezenBillMapper")
    FreezenBillMapper freezenBillMapper;
    @CjServiceRef(refByName = "mybatis.cj.netos.oc.wybank.mapper.FreeBillMapper")
    FreeBillMapper freeBillMapper;
    @CjServiceRef(refByName = "mybatis.cj.netos.oc.wybank.mapper.PriceBillMapper")
    PriceBillMapper priceBillMapper;
    @CjServiceRef(refByName = "mybatis.cj.netos.oc.wybank.mapper.StockBillMapper")
    StockBillMapper stockBillMapper;

    @CjServiceRef
    IBucketService bucketService;

    @CjTransaction
    @Override
    public void purchase(PurchaseWenyBO purchaseWenyBO) throws CircuitException {
        PurchaseRecord record = purchaseWenyBO.getRecord();

        addFundBill(record);
        addFreezenBill(record);
        addFreeBill(record);
        addStockBill(record);
        addPriceBill(record);

    }

    private void addPriceBill(PurchaseRecord record) {
        //冻结金余额除以纹银余额
        PriceBucket priceBucket = bucketService.getandInitPriceBucket(record.getBankid());
        record.setPrice(priceBucket.getPrice());//返回用

        PriceBill priceBill = new PriceBill();
        priceBill.setPrice(priceBucket.getPrice());
        priceBill.setBankid(record.getBankid());
        priceBill.setCtime(BankUtils.dateTimeToMicroSecond(System.currentTimeMillis()));
        priceBill.setNote(record.getNote());
        priceBill.setOrder(0);
        priceBill.setParticipant(record.getPurchaser());
        priceBill.setRefsn(record.getSn());
        priceBill.setSn(IdWorker.nextId());
        priceBill.setTitle(record.getPersonName());
        priceBill.setWorkday(BankUtils.dateTimeToDay(System.currentTimeMillis()));

        Calendar calendar=Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        priceBill.setDay(calendar.get(Calendar.DAY_OF_MONTH));
        priceBill.setWeekday(calendar.get(Calendar.DAY_OF_WEEK));
        priceBill.setMonth(calendar.get(Calendar.MONTH));
        priceBill.setSeason(priceBill.getMonth()%4);
        priceBill.setYear(calendar.get(Calendar.YEAR));

        FreezenBucket freezenBucket = bucketService.getAndInitFreezenBucket(record.getBankid());
        StockBucket stockBucket = bucketService.getAndInitStockBucket(record.getBankid());
        BigDecimal afterPrice = new BigDecimal(freezenBucket.getAmount()).divide(stockBucket.getStock(), 14, RoundingMode.HALF_DOWN);
        priceBill.setAfterPrice(afterPrice);

        priceBillMapper.insert(priceBill);

        bucketService.updatePriceBucket(priceBill.getBankid(), priceBill.getAfterPrice());

    }

    private void addStockBill(PurchaseRecord record) {
        PriceBucket priceBucket = bucketService.getandInitPriceBucket(record.getBankid());
        //本金除以当前价即纹银量
        BigDecimal stock = new BigDecimal(record.getPrincipalAmount()).divide(priceBucket.getPrice(), 14, RoundingMode.HALF_DOWN);
        record.setStock(stock);//返回用

        StockBill stockBill = new StockBill();
        stockBill.setStock(stock);
        stockBill.setBankid(record.getBankid());
        stockBill.setCtime(BankUtils.dateTimeToMicroSecond(System.currentTimeMillis()));
        stockBill.setNote(record.getNote());
        stockBill.setOrder(0);
        stockBill.setParticipant(record.getPurchaser());
        stockBill.setRefsn(record.getSn());
        try {
            stockBill.setSn(IdWorker.nextId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        stockBill.setTitle(record.getPersonName());
        stockBill.setWorkday(BankUtils.dateTimeToDay(System.currentTimeMillis()));

        Calendar calendar=Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        stockBill.setDay(calendar.get(Calendar.DAY_OF_MONTH));
        stockBill.setWeekday(calendar.get(Calendar.DAY_OF_WEEK));
        stockBill.setMonth(calendar.get(Calendar.MONTH));
        stockBill.setSeason(stockBill.getMonth()%4);
        stockBill.setYear(calendar.get(Calendar.YEAR));

        StockBucket stockBucket = bucketService.getAndInitStockBucket(record.getBankid());

        BigDecimal balance = stockBucket.getStock().add(stockBill.getStock()).setScale(14, RoundingMode.HALF_DOWN);
        stockBill.setBalance(balance);

        stockBillMapper.insert(stockBill);

        bucketService.updateStockBucket(stockBill.getBankid(), stockBill.getBalance());

    }

    private void addFreeBill(PurchaseRecord record) {
        FreeBill freeBill = new FreeBill();
        freeBill.setAmount(record.getFreeAmount());
        freeBill.setBankid(record.getBankid());
        freeBill.setCtime(BankUtils.dateTimeToMicroSecond(System.currentTimeMillis()));
        freeBill.setNote(record.getNote());
        freeBill.setOrder(0);
        freeBill.setParticipant(record.getPurchaser());
        freeBill.setRefsn(record.getSn());
        freeBill.setSn(IdWorker.nextId());
        freeBill.setTitle(record.getPersonName());
        freeBill.setWorkday(BankUtils.dateTimeToDay(System.currentTimeMillis()));

        Calendar calendar=Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        freeBill.setDay(calendar.get(Calendar.DAY_OF_MONTH));
        freeBill.setWeekday(calendar.get(Calendar.DAY_OF_WEEK));
        freeBill.setMonth(calendar.get(Calendar.MONTH));
        freeBill.setSeason(freeBill.getMonth()%4);
        freeBill.setYear(calendar.get(Calendar.YEAR));

        FreeBucket freeBucket = bucketService.getAndInitFreeBucket(record.getBankid());

        freeBill.setBalance(freeBucket.getAmount() + freeBill.getAmount());

        freeBillMapper.insert(freeBill);

        bucketService.updateFreeBucket(freeBill.getBankid(), freeBill.getBalance());
    }

    private void addFreezenBill(PurchaseRecord record) {
        long freezenAmount = record.getReserveAmount() + record.getPrincipalAmount();
        FreezenBill freezenBill = new FreezenBill();
        freezenBill.setAmount(freezenAmount);
        freezenBill.setBankid(record.getBankid());
        freezenBill.setCtime(BankUtils.dateTimeToMicroSecond(System.currentTimeMillis()));
        freezenBill.setNote(record.getNote());
        freezenBill.setOrder(0);
        freezenBill.setParticipant(record.getPurchaser());
        freezenBill.setRefsn(record.getSn());
        freezenBill.setSn(IdWorker.nextId());
        freezenBill.setTitle(record.getPersonName());
        freezenBill.setWorkday(BankUtils.dateTimeToDay(System.currentTimeMillis()));

        Calendar calendar=Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        freezenBill.setDay(calendar.get(Calendar.DAY_OF_MONTH));
        freezenBill.setWeekday(calendar.get(Calendar.DAY_OF_WEEK));
        freezenBill.setMonth(calendar.get(Calendar.MONTH));
        freezenBill.setSeason(freezenBill.getMonth()%4);
        freezenBill.setYear(calendar.get(Calendar.YEAR));

        FreezenBucket freezenBucket = bucketService.getAndInitFreezenBucket(record.getBankid());

        freezenBill.setBalance(freezenBucket.getAmount() + freezenAmount);

        freezenBillMapper.insert(freezenBill);

        bucketService.updateFreezenBucket(freezenBill.getBankid(), freezenBill.getBalance());
    }

    private void addFundBill(PurchaseRecord record) {
        FundBill fundBill = new FundBill();
        fundBill.setAmount(record.getAmount());
        fundBill.setBankid(record.getBankid());
        fundBill.setCtime(BankUtils.dateTimeToMicroSecond(System.currentTimeMillis()));
        fundBill.setNote(record.getNote());
        fundBill.setOrder(0);
        fundBill.setParticipant(record.getPurchaser());
        fundBill.setRefsn(record.getSn());
        fundBill.setSn(IdWorker.nextId());
        fundBill.setWorkday(BankUtils.dateTimeToDay(System.currentTimeMillis()));
        fundBill.setTitle(record.getPersonName());

        Calendar calendar=Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        fundBill.setDay(calendar.get(Calendar.DAY_OF_MONTH));
        fundBill.setWeekday(calendar.get(Calendar.DAY_OF_WEEK));
        fundBill.setMonth(calendar.get(Calendar.MONTH));
        fundBill.setSeason(fundBill.getMonth()%4);
        fundBill.setYear(calendar.get(Calendar.YEAR));

        FundBucket fundBucket = bucketService.getAndInitFundBucket(record.getBankid());

        fundBill.setBalance(fundBucket.getAmount() + record.getAmount());

        fundBillMapper.insert(fundBill);

        bucketService.updateFundBucket(fundBill.getBankid(), fundBill.getBalance());
    }
}
