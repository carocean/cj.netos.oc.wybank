package cj.netos.oc.wybank.openports;

import cj.netos.oc.wybank.model.PriceBill;
import cj.netos.oc.wybank.result.BulletinBoard;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.AccessTokenIn;
import cj.studio.openport.IOpenportService;
import cj.studio.openport.ISecuritySession;
import cj.studio.openport.annotations.CjOpenport;
import cj.studio.openport.annotations.CjOpenportAppSecurity;
import cj.studio.openport.annotations.CjOpenportParameter;
import cj.studio.openport.annotations.CjOpenports;

import java.util.List;

@CjOpenports(usage = "历史价格")
public interface IPriceBillPorts extends IOpenportService {

    @CjOpenportAppSecurity
    @CjOpenport(usage = "分页价格单，按最新排序", tokenIn = AccessTokenIn.nope)
    List<PriceBill> pagePriceBill(ISecuritySession securitySession,
                                  @CjOpenportParameter(usage = "纹银银行号", name = "wenyBankID") String wenyBankID,
                                  @CjOpenportParameter(usage = "页大小", name = "limit") int limit,
                                  @CjOpenportParameter(usage = "当前记录位置", name = "offset") long offset
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "取时间之后的价格清单", tokenIn = AccessTokenIn.nope)
    List<PriceBill> getAfterTimePriceBill(ISecuritySession securitySession,
                                          @CjOpenportParameter(usage = "纹银银行号", name = "wenyBankID") String wenyBankID,
                                          @CjOpenportParameter(usage = "创建时间", name = "ctime") String ctime
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "按月获取价格单", tokenIn = AccessTokenIn.nope)
    List<PriceBill> getPriceBillOfMonth(ISecuritySession securitySession,
                                        @CjOpenportParameter(usage = "纹银银行号", name = "wenyBankID") String wenyBankID,
                                        @CjOpenportParameter(usage = "年", name = "year") int year,
                                        @CjOpenportParameter(usage = "月份。（java特性，实际用份减1）", name = "month") int month,
                                        @CjOpenportParameter(usage = "页大小", name = "limit") int limit,
                                        @CjOpenportParameter(usage = "当前记录位置", name = "offset") long offset
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "按日获取价格单", tokenIn = AccessTokenIn.nope)
    List<PriceBill> getPriceBillOfDay(ISecuritySession securitySession,
                                      @CjOpenportParameter(usage = "纹银银行号", name = "wenyBankID") String wenyBankID,
                                      @CjOpenportParameter(usage = "年", name = "year") int year,
                                      @CjOpenportParameter(usage = "月份。（java特性，实际用份减1）", name = "month") int month,
                                      @CjOpenportParameter(usage = "日", name = "day") int day,
                                      @CjOpenportParameter(usage = "页大小", name = "limit") int limit,
                                      @CjOpenportParameter(usage = "当前记录位置", name = "offset") long offset
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "获取公告板，有昨收及今开价格。如果昨收没有则为0.001", tokenIn = AccessTokenIn.nope)
    BulletinBoard getBulletinBoard(
            ISecuritySession securitySession,
            @CjOpenportParameter(usage = "纹银银行号", name = "wenyBankID") String wenyBankID,
            @CjOpenportParameter(usage = "年", name = "year") int year,
            @CjOpenportParameter(usage = "月份。（java特性，实际用份减1）", name = "month") int month,
            @CjOpenportParameter(usage = "日", name = "day") int day
    ) throws CircuitException;
}
