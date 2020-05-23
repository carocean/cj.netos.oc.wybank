package cj.netos.oc.wybank.extern.model;

import java.math.BigDecimal;

/**
 * Table: exchange_record
 */
public class ExchangeRecord {
    /**
     * Column: sn
     */
    private String sn;

    /**
     * Column: exchanger
     * Remark: 承兑人
     */
    private String exchanger;

    /**
     * Column: person_name
     * Remark: 用户显示名
     */
    private String personName;

    /**
     * Column: currency
     */
    private String currency;

    /**
     * Column: amount
     * Remark: 得金
     */
    private Long amount;

    /**
     * Column: stock
     * Remark: 成功承兑的纹银
     */
    private BigDecimal stock;

    /**
     * Column: price
     * Remark: 成交价
     */
    private BigDecimal price;

    /**
     * Column: ttm
     * Remark: 结算市盈率
     */
    private BigDecimal ttm;

    /**
     * Column: ref_purchase
     * Remark: 关联申购单号
     */
    private String refPurchase;

    /**
     * Column: profit
     * Remark: 净赚多少钱 Amount-purchaseAmount
     */
    private Long profit;

    /**
     * Column: purchase_amount
     * Remark: 原申购金
     */
    private Long purchaseAmount;

    /**
     * Column: principal_amount
     * Remark: 原申购本金
     */
    private Long principalAmount;

    /**
     * Column: service_feeAmount
     * Remark: 原申购服务费
     */
    private Long serviceFeeamount;

    /**
     * Column: purchase_price
     * Remark: 申购的价格
     */
    private BigDecimal purchasePrice;

    /**
     * Column: dtime
     * Remark: 成交时间
     */
    private String dtime;

    /**
     * Column: ctime
     */
    private String ctime;

    /**
     * Column: state
     * Remark: -1失败 0承兑中 1完成 
     */
    private Integer state;

    /**
     * Column: note
     * Remark: 备注
     */
    private String note;

    /**
     * Column: bankid
     */
    private String bankid;

    /**
     * Column: status
     * Remark: 返回状态码
     */
    private String status;

    /**
     * Column: message
     * Remark: 返回结果
     */
    private String message;

    /**
     * Column: out_trade_sn
     * Remark: 外部系统交易订单号，在完成后由通知外部系统确认订单
     */
    private String outTradeSn;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getExchanger() {
        return exchanger;
    }

    public void setExchanger(String exchanger) {
        this.exchanger = exchanger == null ? null : exchanger.trim();
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTtm() {
        return ttm;
    }

    public void setTtm(BigDecimal ttm) {
        this.ttm = ttm;
    }

    public String getRefPurchase() {
        return refPurchase;
    }

    public void setRefPurchase(String refPurchase) {
        this.refPurchase = refPurchase == null ? null : refPurchase.trim();
    }

    public Long getProfit() {
        return profit;
    }

    public void setProfit(Long profit) {
        this.profit = profit;
    }

    public Long getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(Long purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public Long getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(Long principalAmount) {
        this.principalAmount = principalAmount;
    }

    public Long getServiceFeeamount() {
        return serviceFeeamount;
    }

    public void setServiceFeeamount(Long serviceFeeamount) {
        this.serviceFeeamount = serviceFeeamount;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getDtime() {
        return dtime;
    }

    public void setDtime(String dtime) {
        this.dtime = dtime == null ? null : dtime.trim();
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime == null ? null : ctime.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getOutTradeSn() {
        return outTradeSn;
    }

    public void setOutTradeSn(String outTradeSn) {
        this.outTradeSn = outTradeSn == null ? null : outTradeSn.trim();
    }
}