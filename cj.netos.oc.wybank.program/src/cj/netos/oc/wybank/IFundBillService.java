package cj.netos.oc.wybank;

import cj.netos.oc.wybank.model.FreezenBill;
import cj.netos.oc.wybank.model.FundBill;

import java.util.List;

public interface IFundBillService {
    List<FundBill> pageBill(String wenyBankID, int limit, long offset);

    List<FundBill> getBillOfMonth(String wenyBankID, int month);

    long getTotalInBillOfMonth(String wenyBankID, int month);

    long totalOutBillOfMonth(String wenyBankID, int month);

    long totalInBillOfYear(String wenyBankID, int year);

    long totalOutBillOfYear(String wenyBankID, int year);
}
