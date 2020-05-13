package cj.netos.oc.wybank.ports;

import cj.netos.oc.wybank.IWenyBankService;
import cj.netos.oc.wybank.bo.ShunterRuleBO;
import cj.netos.oc.wybank.bo.TTMBO;
import cj.netos.oc.wybank.bo.WenyBankBO;
import cj.netos.oc.wybank.model.BankInfo;
import cj.netos.oc.wybank.model.ShunterRule;
import cj.netos.oc.wybank.model.TtmConfig;
import cj.netos.oc.wybank.openports.IWenyBankPorts;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.ISecuritySession;
import cj.ultimate.gson2.com.google.gson.Gson;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CjService(name = "/bank.ports")
public class WenyBankPorts implements IWenyBankPorts {
    @CjServiceRef
    IWenyBankService wenyBankService;

    @Override
    public Map<String, Object> createWenyBank(ISecuritySession securitySession, String creator, WenyBankBO wenyBankBO) throws CircuitException {
        if (wenyBankBO == null) {
            throw new CircuitException("404", "wenyBankBO 参数为空");
        }
        Object obj = wenyBankService.createWenyBank(creator, wenyBankBO);
        return new Gson().fromJson(new Gson().toJson(obj), HashMap.class);
    }

    @Override
    public List<Map<String, Object>> pageWenyBank(ISecuritySession securitySession, int limit, int offset) throws CircuitException {
        List<BankInfo> list = wenyBankService.pageWenyBank(limit, offset);
        return new Gson().fromJson(new Gson().toJson(list), ArrayList.class);
    }

    @Override
    public void stopWenyBank(ISecuritySession securitySession, String banksn) throws CircuitException {
        wenyBankService.stopWenyBank(banksn);
    }

    @Override
    public Map<String, Object> getWenyBank(ISecuritySession securitySession, String banksn) throws CircuitException {
        BankInfo bankInfo = wenyBankService.getWenyBank(banksn);
        return new Gson().fromJson(new Gson().toJson(bankInfo), HashMap.class);
    }

    @Override
    public void startWenyBank(ISecuritySession securitySession, String banksn) throws CircuitException {
        wenyBankService.startWenyBank(banksn);
    }

    @Override
    public void cancelWenyBank(ISecuritySession securitySession, String banksn) throws CircuitException {
        wenyBankService.cancelWenyBank(banksn);
    }

    @Override
    public void setShunterRules(ISecuritySession securitySession, String banksn, List<ShunterRuleBO> rules) throws CircuitException {
        wenyBankService.setShunterRules(banksn, rules);
    }

    @Override
    public void emptyShunterRules(ISecuritySession securitySession, String banksn) throws CircuitException {
        wenyBankService.emptyShunterRules(banksn);
    }

    @Override
    public void setTTMTable(ISecuritySession securitySession, String banksn, List<TTMBO> ttmTable) throws CircuitException {
        wenyBankService.setTTMTable(banksn, ttmTable);
    }

    @Override
    public void emptyTTMTable(ISecuritySession securitySession, String banksn) throws CircuitException {
        wenyBankService.emptyTTMTable(banksn);
    }

    @Override
    public List<ShunterRuleBO> getShunterRules(ISecuritySession securitySession, String banksn) throws CircuitException {
        List<ShunterRule> rules = wenyBankService.getShunterRules(banksn);
        List<ShunterRuleBO> list = new ArrayList<>();
        for (ShunterRule rule : rules) {
            ShunterRuleBO bo = new ShunterRuleBO();
            bo.setAlias(rule.getAlias());
            bo.setPerson(rule.getPerson());
            bo.setRatio(rule.getRatio());
            bo.setSubject(rule.getSubject());
            list.add(bo);
        }
        return list;
    }

    @Override
    public List<TTMBO> getTTMTable(ISecuritySession securitySession, String banksn) throws CircuitException {
        List<TtmConfig> ttmbos = wenyBankService.getTTMTable(banksn);
        List<TTMBO> list = new ArrayList<>();
        for (TtmConfig ttm : ttmbos) {
            TTMBO bo = new TTMBO();
            bo.setMaxAmount(ttm.getMaxAmount());
            bo.setMinAmount(ttm.getMinAmount());
            bo.setTtm(ttm.getTtm());
            list.add(bo);
        }
        return list;
    }
}
