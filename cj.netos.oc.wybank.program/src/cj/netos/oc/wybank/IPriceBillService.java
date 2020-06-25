package cj.netos.oc.wybank;

import cj.netos.oc.wybank.model.PriceBill;
import cj.netos.oc.wybank.result.BulletinBoard;

import java.util.List;

public interface IPriceBillService {
    List<PriceBill> pagePriceBill(String wenyBankID, int limit, long offset);

    List<PriceBill> getPriceBillOfMonth(String wenyBankID, int year, int month, int limit, long offset);

    List<PriceBill> getPriceBillOfDay(String wenyBankID, int year, int month, int day, int limit, long offset);

    List<PriceBill> getAfterTimePriceBill(String wenyBankID, String ctime);

    BulletinBoard getBulletinBoard(String wenyBankID, int year, int month, int day);

}
