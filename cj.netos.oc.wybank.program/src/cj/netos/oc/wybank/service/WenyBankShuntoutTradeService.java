package cj.netos.oc.wybank.service;

import cj.netos.oc.wybank.IBucketService;
import cj.netos.oc.wybank.IWenyBankShuntoutTradeService;
import cj.netos.oc.wybank.bo.ShuntoutBO;
import cj.netos.oc.wybank.extern.model.ShuntRecord;
import cj.netos.oc.wybank.mapper.*;
import cj.netos.oc.wybank.model.FreeBill;
import cj.netos.oc.wybank.model.FreeBucket;
import cj.netos.oc.wybank.model.FundBill;
import cj.netos.oc.wybank.model.FundBucket;
import cj.netos.oc.wybank.util.BankUtils;
import cj.netos.oc.wybank.util.IdWorker;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.net.CircuitException;
import cj.studio.orm.mybatis.annotation.CjTransaction;

import java.util.Calendar;

@CjBridge(aspects = "@transaction")
@CjService(name = "wenyBankShuntoutTradeService")
public class WenyBankShuntoutTradeService implements IWenyBankShuntoutTradeService {
    @CjServiceRef(refByName = "mybatis.cj.netos.oc.wybank.mapper.FundBillMapper")
    FundBillMapper fundBillMapper;

    @CjServiceRef(refByName = "mybatis.cj.netos.oc.wybank.mapper.FreeBillMapper")
    FreeBillMapper freeBillMapper;

    @CjServiceRef
    IBucketService bucketService;

    @CjTransaction
    @Override
    public void shuntout(ShuntoutBO shuntoutBO) throws CircuitException {
        ShuntRecord record = shuntoutBO.getRecord();
        FreeBucket freeBucket = bucketService.getAndInitFreeBucket(shuntoutBO.getWenyBankID());
        if (freeBucket.getAmount() <= 0) {
            throw new CircuitException("1200","余额不足");
        }
        long realAmount = record.getReqAmount();
        if (record.getReqAmount() > freeBucket.getAmount()) {
            realAmount = freeBucket.getAmount();
        }
        addFreeBill(record, realAmount);
        addFundBill(record, realAmount);

        record.setRealAmount(realAmount);
    }

    private void addFundBill(ShuntRecord record, long realAmount) {
        FundBucket fundBucket = bucketService.getAndInitFundBucket(record.getBankid());
        FundBill bill = new FundBill();
        bill.setSn(IdWorker.nextId());
        bill.setTitle(record.getOperator());
        bill.setParticipant(record.getPersonName());
        bill.setBankid(record.getBankid());
        bill.setOrder(2);
        bill.setAmount(realAmount);
        bill.setBalance(fundBucket.getAmount() - realAmount);
        bill.setRefsn(record.getSn());
        bill.setCtime(BankUtils.dateTimeToMicroSecond(System.currentTimeMillis()));
        bill.setNote(record.getNote());
        bill.setWorkday(BankUtils.dateTimeToDay(System.currentTimeMillis()));

        Calendar calendar=Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        bill.setDay(calendar.get(Calendar.DAY_OF_MONTH));
        bill.setWeekday(calendar.get(Calendar.DAY_OF_WEEK));
        bill.setMonth(calendar.get(Calendar.MONTH));
        bill.setSeason(bill.getMonth()%4);
        bill.setYear(calendar.get(Calendar.YEAR));

        fundBillMapper.insert(bill);

        bucketService.updateFundBucket(bill.getBankid(), bill.getBalance());
    }

    private void addFreeBill(ShuntRecord record, long realAmount) {
        FreeBucket freeBucket = bucketService.getAndInitFreeBucket(record.getBankid());
        FreeBill bill = new FreeBill();
        bill.setSn(IdWorker.nextId());
        bill.setTitle(record.getPersonName());
        bill.setParticipant(record.getOperator());
        bill.setBankid(record.getBankid());
        bill.setOrder(2);
        bill.setAmount(realAmount);
        bill.setBalance(freeBucket.getAmount() - realAmount);
        bill.setRefsn(record.getSn());
        bill.setCtime(BankUtils.dateTimeToMicroSecond(System.currentTimeMillis()));
        bill.setNote(record.getNote());
        bill.setWorkday(BankUtils.dateTimeToDay(System.currentTimeMillis()));

        Calendar calendar=Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        bill.setDay(calendar.get(Calendar.DAY_OF_MONTH));
        bill.setWeekday(calendar.get(Calendar.DAY_OF_WEEK));
        bill.setMonth(calendar.get(Calendar.MONTH));
        bill.setSeason(bill.getMonth()%4);
        bill.setYear(calendar.get(Calendar.YEAR));

        freeBillMapper.insert(bill);

        bucketService.updateFreeBucket(bill.getBankid(), bill.getBalance());
    }

}
