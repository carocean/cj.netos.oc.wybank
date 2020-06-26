package cj.netos.oc.wybank;

import cj.netos.oc.wybank.model.StockBill;

import java.math.BigDecimal;
import java.util.List;

public interface IStockBillService {
    List<StockBill> pageBill(String wenyBankID, int limit, long offset);

    List<StockBill> getBillOfMonth(String wenyBankID,  int year, int month, int limit, long offset);

    BigDecimal getTotalInBillOfMonth(String wenyBankID, int year,int month);

    BigDecimal totalOutBillOfMonth(String wenyBankID, int year,int month);

    BigDecimal totalInBillOfYear(String wenyBankID, int year);

    BigDecimal totalOutBillOfYear(String wenyBankID, int year);

    List<StockBill> pageBillOfMonth(String wenyBankID, int order, int year, int month, int limit, long offset);

}
