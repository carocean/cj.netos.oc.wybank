package cj.netos.oc.wybank.model;

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
     * Remark: 申购时价格
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
     * Remark: 0申购中 1成功 2失败
     */
    private Integer state;

    /**
     * Column: note
     * Remark: 备注
     */
    private String note;

    /**
     * Column: reserve_amount
     * Remark: 拆分：准备金金额
     */
    private Long reserveAmount;

    /**
     * Column: principal_amount
     * Remark: 拆分：本金金额
     */
    private Long principalAmount;

    /**
     * Column: free_amount
     * Remark: 拆分：自由金金额
     */
    private Long freeAmount;

    /**
     * Column: reserve_ratio
     */
    private BigDecimal reserveRatio;

    /**
     * Column: principal_ratio
     */
    private BigDecimal principalRatio;

    /**
     * Column: free_ratio
     */
    private BigDecimal freeRatio;

    /**
     * Column: bankid
     */
    private String bankid;

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

    public Long getReserveAmount() {
        return reserveAmount;
    }

    public void setReserveAmount(Long reserveAmount) {
        this.reserveAmount = reserveAmount;
    }

    public Long getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(Long principalAmount) {
        this.principalAmount = principalAmount;
    }

    public Long getFreeAmount() {
        return freeAmount;
    }

    public void setFreeAmount(Long freeAmount) {
        this.freeAmount = freeAmount;
    }

    public BigDecimal getReserveRatio() {
        return reserveRatio;
    }

    public void setReserveRatio(BigDecimal reserveRatio) {
        this.reserveRatio = reserveRatio;
    }

    public BigDecimal getPrincipalRatio() {
        return principalRatio;
    }

    public void setPrincipalRatio(BigDecimal principalRatio) {
        this.principalRatio = principalRatio;
    }

    public BigDecimal getFreeRatio() {
        return freeRatio;
    }

    public void setFreeRatio(BigDecimal freeRatio) {
        this.freeRatio = freeRatio;
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }
}