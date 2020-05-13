package cj.netos.oc.wybank;

import cj.netos.oc.wybank.bo.ShunterRuleBO;
import cj.netos.oc.wybank.bo.TTMBO;
import cj.netos.oc.wybank.bo.WenyBankBO;
import cj.netos.oc.wybank.model.BankInfo;
import cj.netos.oc.wybank.model.ShunterRule;
import cj.netos.oc.wybank.model.TtmConfig;

import java.util.List;

public interface IWenyBankService {
    BankInfo createWenyBank(String creator,WenyBankBO wenyBankBO);

    List<BankInfo> pageWenyBank(int limit, int offset);

    void stopWenyBank(String banksn);

    BankInfo getWenyBank(String banksn);

    void startWenyBank(String banksn);

    void cancelWenyBank(String banksn);

    void setShunterRules(String banksn, List<ShunterRuleBO> rules);

    void emptyShunterRules(String banksn);

    void setTTMTable(String banksn, List<TTMBO> ttmTable);

    void emptyTTMTable(String banksn);

    List<ShunterRule> getShunterRules(String banksn);

    List<TtmConfig> getTTMTable(String banksn);

}
