package cj.netos.oc.wybank.openports;

import cj.netos.oc.wybank.bo.PurchaseWenyBO;
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
    @CjOpenport(usage = "申购交易",tokenIn = AccessTokenIn.nope,command = "post")
    void purchase(ISecuritySession securitySession,
                  @CjOpenportParameter(usage = "申购单", name = "purchaseBill",in = PKeyInRequest.content) PurchaseWenyBO purchaseWenyBO
    ) throws CircuitException;


}
