package cj.netos.oc.wybank.extern.model;

import java.math.BigDecimal;

/**
 * Table: purchase_record
 */
public class PurchaseRecord {
    /**
     * Column: sn
     */
    private String sn;

    /**
     * Column: purchaser
     * Remark: 申购人
     */
    private String purchaser;

    /**
     * Column: person_name
     * Remark: 申购者的显示名
     */
    private String personName;

    /**
     * Column: currency
     */
    private String currency;

    /**
     * Column: amount
     * Remark: 申购金
     */
    private Long amount;

    /**
     * Column: stock
     * Remark: 申购到的纹银
     */
    private BigDecimal stock;

    /**
     * Column: price
     * Remark: 成交价格 申购时是参考价，只有申购交易进入处理时才能取到价格
     */
    private BigDecimal price;

    /**
     * Column: ttm
     * Remark: 申购时给的市盈率
     */
    private BigDecimal ttm;

    /**
     * Column: ptime
     * Remark: 申购时间
     */
    private String ptime;

    /**
     * Column: state
     * Remark: -1申购失败 0申购中 1申购成功 2承兑中 3已承兑
     */
    private Integer state;

    /**
     * Column: note
     * Remark: 备注
     */
    private String note;

    /**
     * Column: service_fee
     * Remark: 服务费
     */
    private Long serviceFee;

    /**
     * Column: principal_amount
     * Remark: 拆分：本金金额
     */
    private Long principalAmount;

    /**
     * Column: fee_ratio
     * Remark: 服务费率
     */
    private BigDecimal feeRatio;

    /**
     * Column: principal_ratio
     */
    private BigDecimal principalRatio;

    /**
     * Column: tail_amount
     * Remark: 尾金
     */
    private Long tailAmount;

    /**
     * Column: free_ratio
     * Remark: 自由金率+准备金率=费率
     */
    private BigDecimal freeRatio;

    /**
     * Column: reserve_ratio
     */
    private BigDecimal reserveRatio;

    /**
     * Column: free_amount
     * Remark: 自由金
     */
    private Long freeAmount;

    /**
     * Column: reserve_amount
     * Remark: 准备金
     */
    private Long reserveAmount;

    /**
     * Column: bankid
     */
    private String bankid;

    /**
     * Column: device
     * Remark: 设备
     */
    private String device;

    /**
     * Column: status
     * Remark: 记录返回码 
     */
    private String status;

    /**
     * Column: message
     * Remark: 交易处理返回结果
     */
    private String message;

    /**
     * Column: out_trade_sn
     * Remark: 外部系统交易订单号，在完成后由通知外部系统确认订单
     */
    private String outTradeSn;

    /**
     * Column: dtime
     * Remark: 更新时间
     */
    private String dtime;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser == null ? null : purchaser.trim();
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

    public String getPtime() {
        return ptime;
    }

    public void setPtime(String ptime) {
        this.ptime = ptime == null ? null : ptime.trim();
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

    public Long getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(Long serviceFee) {
        this.serviceFee = serviceFee;
    }

    public Long getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(Long principalAmount) {
        this.principalAmount = principalAmount;
    }

    public BigDecimal getFeeRatio() {
        return feeRatio;
    }

    public void setFeeRatio(BigDecimal feeRatio) {
        this.feeRatio = feeRatio;
    }

    public BigDecimal getPrincipalRatio() {
        return principalRatio;
    }

    public void setPrincipalRatio(BigDecimal principalRatio) {
        this.principalRatio = principalRatio;
    }

    public Long getTailAmount() {
        return tailAmount;
    }

    public void setTailAmount(Long tailAmount) {
        this.tailAmount = tailAmount;
    }

    public BigDecimal getFreeRatio() {
        return freeRatio;
    }

    public void setFreeRatio(BigDecimal freeRatio) {
        this.freeRatio = freeRatio;
    }

    public BigDecimal getReserveRatio() {
        return reserveRatio;
    }

    public void setReserveRatio(BigDecimal reserveRatio) {
        this.reserveRatio = reserveRatio;
    }

    public Long getFreeAmount() {
        return freeAmount;
    }

    public void setFreeAmount(Long freeAmount) {
        this.freeAmount = freeAmount;
    }

    public Long getReserveAmount() {
        return reserveAmount;
    }

    public void setReserveAmount(Long reserveAmount) {
        this.reserveAmount = reserveAmount;
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device == null ? null : device.trim();
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

    public String getDtime() {
        return dtime;
    }

    public void setDtime(String dtime) {
        this.dtime = dtime == null ? null : dtime.trim();
    }
}