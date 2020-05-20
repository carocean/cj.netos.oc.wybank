package cj.netos.oc.wybank;

import cj.netos.oc.wybank.model.FreeBill;
import cj.netos.oc.wybank.model.FreezenBill;

import java.util.List;

public interface IFreezenBillService {
    List<FreezenBill> pageBill(String wenyBankID, int limit, long offset);

    List<FreezenBill> getBillOfMonth(String wenyBankID, int year, int month, int limit, long offset);

    long getTotalInBillOfMonth(String wenyBankID, int year,int month);

    long totalOutBillOfMonth(String wenyBankID,int year, int month);

    long totalInBillOfYear(String wenyBankID, int year);

    long totalOutBillOfYear(String wenyBankID, int year);
}
