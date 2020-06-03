package cj.netos.oc.wybank;

import cj.netos.oc.wybank.model.FreezenBill;
import cj.netos.oc.wybank.model.FundBill;
import cj.studio.orm.mybatis.annotation.CjTransaction;

import java.util.List;

public interface IFundBillService {
    List<FundBill> pageBill(String wenyBankID, int limit, long offset);

    List<FundBill> getBillOfMonth(String wenyBankID,int year, int month, int limit, long offset);

    long getTotalInBillOfMonth(String wenyBankID, int year,int month);

    long totalOutBillOfMonth(String wenyBankID,int year, int month);

    long totalInBillOfYear(String wenyBankID, int year);

    long totalOutBillOfYear(String wenyBankID, int year);

    long totalPurchaseFundOfDay(String wenyBankID, int year, int month, int day);

    long totalExchangeFundOfDay(String wenyBankID, int year, int month, int day);
}
