package cj.netos.oc.wybank.openports;

import cj.netos.oc.wybank.bo.ShunterRuleBO;
import cj.netos.oc.wybank.bo.TTMBO;
import cj.netos.oc.wybank.bo.WenyBankBO;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.AccessTokenIn;
import cj.studio.openport.IOpenportService;
import cj.studio.openport.ISecuritySession;
import cj.studio.openport.PKeyInRequest;
import cj.studio.openport.annotations.CjOpenport;
import cj.studio.openport.annotations.CjOpenportAppSecurity;
import cj.studio.openport.annotations.CjOpenportParameter;
import cj.studio.openport.annotations.CjOpenports;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CjOpenports(usage = "纹银银行")
public interface IWenyBankPorts extends IOpenportService {
    @CjOpenportAppSecurity
    @CjOpenport(usage = "创建一个纹银银行", tokenIn = AccessTokenIn.nope, command = "post")
    Map<String, Object> createWenyBank(ISecuritySession securitySession,
                                       @CjOpenportParameter(usage = "创建者", name = "creator")  String creator,
                                       @CjOpenportParameter(usage = "纹银银行配置", name = "wenyBankBO", in = PKeyInRequest.content) WenyBankBO wenyBankBO
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "分页查询", tokenIn = AccessTokenIn.nope)
    List<Map<String, Object>> pageWenyBank(ISecuritySession securitySession,
                                           @CjOpenportParameter(usage = "页大小", name = "limit") int limit,
                                           @CjOpenportParameter(usage = "偏移", name = "offset") int offset
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "获取一个银行", tokenIn = AccessTokenIn.nope)
    Map<String, Object> getWenyBank(ISecuritySession securitySession,
                                    @CjOpenportParameter(usage = "纹银银行行号", name = "banksn") String banksn
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "停止运营", tokenIn = AccessTokenIn.nope)
    void stopWenyBank(ISecuritySession securitySession,
                      @CjOpenportParameter(usage = "纹银银行行号", name = "banksn") String banksn
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "运营", tokenIn = AccessTokenIn.nope)
    void startWenyBank(ISecuritySession securitySession,
                       @CjOpenportParameter(usage = "纹银银行行号", name = "banksn") String banksn
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "注销一个纹银银行", tokenIn = AccessTokenIn.nope)
    void cancelWenyBank(ISecuritySession securitySession,
                        @CjOpenportParameter(usage = "纹银银行行号", name = "banksn") String banksn
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "设置一套分账规则", tokenIn = AccessTokenIn.nope, command = "post")
    void setShunterRules(ISecuritySession securitySession,
                         @CjOpenportParameter(usage = "纹银银行行号", name = "banksn") String banksn,
                         @CjOpenportParameter(usage = "分账规则，比率必须加起来等1", name = "rules", elementType = ShunterRuleBO.class,type = ArrayList.class,in = PKeyInRequest.content) List<ShunterRuleBO> rules
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "清空分账规则", tokenIn = AccessTokenIn.nope)
    void emptyShunterRules(ISecuritySession securitySession,
                           @CjOpenportParameter(usage = "纹银银行行号", name = "banksn") String banksn
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "获取分账规则", tokenIn = AccessTokenIn.nope)
    List<ShunterRuleBO> getShunterRules(ISecuritySession securitySession,
                           @CjOpenportParameter(usage = "纹银银行行号", name = "banksn") String banksn
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "设置一套市盈率", tokenIn = AccessTokenIn.nope, command = "post")
    void setTTMTable(ISecuritySession securitySession,
                     @CjOpenportParameter(usage = "纹银银行行号", name = "banksn") String banksn,
                     @CjOpenportParameter(usage = "分账规则，比率必须加起来等1", name = "ttmTable", elementType = TTMBO.class, in = PKeyInRequest.content) List<TTMBO> ttmTable
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "清空市盈率", tokenIn = AccessTokenIn.nope)
    void emptyTTMTable(ISecuritySession securitySession,
                       @CjOpenportParameter(usage = "纹银银行行号", name = "banksn") String banksn
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "获取市盈率配置", tokenIn = AccessTokenIn.nope)
    List<TTMBO> getTTMTable(ISecuritySession securitySession,
                       @CjOpenportParameter(usage = "纹银银行行号", name = "banksn") String banksn
    ) throws CircuitException;

}
