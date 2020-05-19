package cj.netos.oc.wybank.openports;

import cj.netos.oc.wybank.model.*;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.AccessTokenIn;
import cj.studio.openport.IOpenportService;
import cj.studio.openport.ISecuritySession;
import cj.studio.openport.annotations.CjOpenport;
import cj.studio.openport.annotations.CjOpenportAppSecurity;
import cj.studio.openport.annotations.CjOpenportParameter;
import cj.studio.openport.annotations.CjOpenports;

import java.util.List;
import java.util.Map;

@CjOpenports(usage = "余额类服务")
public interface IBucketPorts extends IOpenportService {
    @CjOpenportAppSecurity
    @CjOpenport(usage = "当前价格",tokenIn = AccessTokenIn.nope)
    PriceBucket getPriceBucket(ISecuritySession securitySession,
                               @CjOpenportParameter(usage = "纹银银行号", name = "wenyBankID") String wenyBankID
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "分页各银行当前价格",tokenIn = AccessTokenIn.nope)
    List<PriceBucket> pagePriceBucket(ISecuritySession securitySession,
                                      @CjOpenportParameter(usage = "页大小", name = "limit") int limit,
                                      @CjOpenportParameter(usage = "当前记录位置", name = "offset") long offset
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "当前资金余额",tokenIn = AccessTokenIn.nope)
    FundBucket getFundBucket(ISecuritySession securitySession,
                             @CjOpenportParameter(usage = "纹银银行号", name = "wenyBankID") String wenyBankID
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "分页各银行资金余额",tokenIn = AccessTokenIn.nope)
    List<FundBucket> pageFundBucket(ISecuritySession securitySession,
                                    @CjOpenportParameter(usage = "页大小", name = "limit") int limit,
                                    @CjOpenportParameter(usage = "当前记录位置", name = "offset") long offset
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "当前冻结资金余额",tokenIn = AccessTokenIn.nope)
    FreezenBucket getFreezenBucket(ISecuritySession securitySession,
                                   @CjOpenportParameter(usage = "纹银银行号", name = "wenyBankID") String wenyBankID
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "分页各银行冻结资金余额",tokenIn = AccessTokenIn.nope)
    List<FreezenBucket> pageFreezenBucket(ISecuritySession securitySession,
                                          @CjOpenportParameter(usage = "页大小", name = "limit") int limit,
                                          @CjOpenportParameter(usage = "当前记录位置", name = "offset") long offset
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "当前自由资金余额",tokenIn = AccessTokenIn.nope)
    FreeBucket getFreeBucket(ISecuritySession securitySession,
                             @CjOpenportParameter(usage = "纹银银行号", name = "wenyBankID") String wenyBankID
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "分页各银行自由资金余额",tokenIn = AccessTokenIn.nope)
    List<FreeBucket> pageFreeBucket(ISecuritySession securitySession,
                                    @CjOpenportParameter(usage = "页大小", name = "limit") int limit,
                                    @CjOpenportParameter(usage = "当前记录位置", name = "offset") long offset
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "当前纹银存量余额",tokenIn = AccessTokenIn.nope)
    StockBucket getStockBucket(ISecuritySession securitySession,
                               @CjOpenportParameter(usage = "纹银银行号", name = "wenyBankID") String wenyBankID
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "分页各银行纹银存量余额",tokenIn = AccessTokenIn.nope)
    List<StockBucket> pageStockBucket(ISecuritySession securitySession,
                                      @CjOpenportParameter(usage = "页大小", name = "limit") int limit,
                                      @CjOpenportParameter(usage = "当前记录位置", name = "offset") long offset
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "获取一个纹银银行的所有余额类，除了分账类余额",tokenIn = AccessTokenIn.nope)
    Map<String, Object> getAllBucketOfBank(
            ISecuritySession securitySession,
            @CjOpenportParameter(usage = "纹银银行号", name = "wenyBankID") String wenyBankID
    ) throws CircuitException;
}
