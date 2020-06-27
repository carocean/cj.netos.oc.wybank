package cj.netos.oc.wybank.service;

import cj.netos.oc.wybank.IPriceBillService;
import cj.netos.oc.wybank.mapper.PriceBillMapper;
import cj.netos.oc.wybank.model.PriceBill;
import cj.netos.oc.wybank.result.BulletinBoard;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@CjService(name = "priceBillService")
public class PriceBillService implements IPriceBillService {
    @CjServiceRef(refByName = "mybatis.cj.netos.oc.wybank.mapper.PriceBillMapper")
    PriceBillMapper priceBillMapper;

    @CjTransaction
    @Override
    public List<PriceBill> pagePriceBill(String wenyBankID, int limit, long offset) {
        return priceBillMapper.pagePriceBill(wenyBankID, limit, offset);
    }

    @CjTransaction
    @Override
    public List<PriceBill> getAfterTimePriceBill(String wenyBankID, String ctime) {
        return priceBillMapper.getAfterTimePriceBill(wenyBankID, ctime);
    }

    @CjTransaction
    @Override
    public List<PriceBill> getPriceBillOfMonth(String wenyBankID, int year, int month, int limit, long offset) {
        return priceBillMapper.getPriceBillOfMonth(wenyBankID, year, month, limit, offset);
    }

    @CjTransaction
    @Override
    public List<PriceBill> getPriceBillOfDay(String wenyBankID, int year, int month, int day, int limit, long offset) {
        return priceBillMapper.getPriceBillOfDay(wenyBankID, year, month, day, limit, offset);
    }

    @CjTransaction
    @Override
    public BulletinBoard getBulletinBoard(String wenyBankID, int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        calendar.add(Calendar.DATE, -1);
        PriceBill closePrice = priceBillMapper.getClosePrice(wenyBankID, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE));
        if (closePrice == null) {
            closePrice=priceBillMapper.getBeforePrice(wenyBankID,calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE));
        }
        BulletinBoard bulletinBoard = new BulletinBoard();
        bulletinBoard.setClosePrice(closePrice == null ? new BigDecimal("0.001") : closePrice.getPrice());

        PriceBill openPrice = priceBillMapper.getOpenPrice(wenyBankID, year, month, day);
        bulletinBoard.setOpenPrice(openPrice == null ? bulletinBoard.getClosePrice() : openPrice.getPrice());
        return bulletinBoard;
    }
}
