package cj.netos.oc.wybank.openports;

import cj.netos.oc.wybank.model.FreeBill;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.AccessTokenIn;
import cj.studio.openport.IOpenportService;
import cj.studio.openport.ISecuritySession;
import cj.studio.openport.annotations.CjOpenport;
import cj.studio.openport.annotations.CjOpenportAppSecurity;
import cj.studio.openport.annotations.CjOpenportParameter;
import cj.studio.openport.annotations.CjOpenports;

import java.util.List;

@CjOpenports(usage = "自由资金出入账单")
public interface IFreeBillPorts extends IOpenportService {
    @CjOpenportAppSecurity
    @CjOpenport(usage = "分页账单", tokenIn = AccessTokenIn.nope)
    List<FreeBill> pageBill(ISecuritySession securitySession,
                            @CjOpenportParameter(usage = "纹银银行号", name = "wenyBankID") String wenyBankID,
                            @CjOpenportParameter(usage = "页大小", name = "limit") int limit,
                            @CjOpenportParameter(usage = "当前记录位置", name = "offset") long offset
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "获取指定月份账单", tokenIn = AccessTokenIn.nope)
    List<FreeBill> getBillOfMonth(ISecuritySession securitySession,
                                  @CjOpenportParameter(usage = "纹银银行号", name = "wenyBankID") String wenyBankID,
                                  @CjOpenportParameter(usage = "月份。（java特性，实际用份减1）", name = "month") int month
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "获取指定月份账单入账总金额", tokenIn = AccessTokenIn.nope)
    long totalInBillOfMonth(
            ISecuritySession securitySession,
            @CjOpenportParameter(usage = "纹银银行号", name = "wenyBankID") String wenyBankID,
            @CjOpenportParameter(usage = "月份。（java特性，实际用份减1）", name = "month") int month
    ) throws CircuitException;


    @CjOpenportAppSecurity
    @CjOpenport(usage = "获取指定月份账单出账总金额", tokenIn = AccessTokenIn.nope)
    long totalOutBillOfMonth(
            ISecuritySession securitySession,
            @CjOpenportParameter(usage = "纹银银行号", name = "wenyBankID") String wenyBankID,
            @CjOpenportParameter(usage = "月份。（java特性，实际用份减1）", name = "month") int month
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "获取指定年份账单入账总金额", tokenIn = AccessTokenIn.nope)
    long totalInBillOfYear(
            ISecuritySession securitySession,
            @CjOpenportParameter(usage = "纹银银行号", name = "wenyBankID") String wenyBankID,
            @CjOpenportParameter(usage = "年份。", name = "year") int year
    ) throws CircuitException;


    @CjOpenportAppSecurity
    @CjOpenport(usage = "获取指定年份账单出账总金额", tokenIn = AccessTokenIn.nope)
    long totalOutBillOfYear(
            ISecuritySession securitySession,
            @CjOpenportParameter(usage = "纹银银行号", name = "wenyBankID") String wenyBankID,
            @CjOpenportParameter(usage = "年份。", name = "year") int year
    ) throws CircuitException;
}
