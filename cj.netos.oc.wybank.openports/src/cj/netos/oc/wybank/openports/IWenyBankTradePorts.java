package cj.netos.oc.wybank.openports;

import cj.netos.oc.wybank.bo.*;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.AccessTokenIn;
import cj.studio.openport.IOpenportService;
import cj.studio.openport.ISecuritySession;
import cj.studio.openport.PKeyInRequest;
import cj.studio.openport.annotations.CjOpenport;
import cj.studio.openport.annotations.CjOpenportAppSecurity;
import cj.studio.openport.annotations.CjOpenportParameter;
import cj.studio.openport.annotations.CjOpenports;

@CjOpenports(usage = "纹银银行交易开放api")
public interface IWenyBankTradePorts extends IOpenportService {

    @CjOpenportAppSecurity
    @CjOpenport(usage = "申购交易", tokenIn = AccessTokenIn.nope, command = "post")
    PurchaseResponse purchase(ISecuritySession securitySession,
                              @CjOpenportParameter(usage = "申购单", name = "purchaseBill", in = PKeyInRequest.content) PurchaseWenyBO purchaseWenyBO
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "承兑交易", tokenIn = AccessTokenIn.nope, command = "post")
    ExchangeResponse exchange(ISecuritySession securitySession,
                              @CjOpenportParameter(usage = "承兑单", name = "exchangeBill", in = PKeyInRequest.content) ExchangeWenyBO exchangeWenyBO
    ) throws CircuitException;

    @CjOpenportAppSecurity
    @CjOpenport(usage = "转出交易（自由金余额）", tokenIn = AccessTokenIn.nope, command = "post")
    ShuntoutResponse shuntout(ISecuritySession securitySession,
                              @CjOpenportParameter(usage = "分账单。只有分账才调用提现，因此对应分账单", name = "shuntoutBill", in = PKeyInRequest.content) ShuntoutBO shuntoutBO
    ) throws CircuitException;
}
