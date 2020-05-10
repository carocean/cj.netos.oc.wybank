package cj.netos.oc.wybank.model;

import java.math.BigDecimal;

/**
 * Table: exchange_index
 */
public class ExchangeIndex {
    /**
     * Column: id
     * Remark: 标识
     */
    private String id;

    /**
     * Column: day
     * Remark: 天，1-31
     */
    private Integer day;

    /**
     * Column: weekday
     * Remark: 在一周内第几天，1-7
     */
    private Integer weekday;

    /**
     * Column: month
     * Remark: 月，1-12
     */
    private Integer month;

    /**
     * Column: season
     * Remark: 季，1-4
     */
    private Integer season;

    /**
     * Column: yeer
     * Remark: 年
     */
    private Integer yeer;

    /**
     * Column: purch_fund
     * Remark: 发放总金额
     */
    private Long purchFund;

    /**
     * Column: reclaim_stock
     * Remark: 回收纹银总量
     */
    private BigDecimal reclaimStock;

    /**
     * Column: exchange_count
     * Remark: 承兑笔数
     */
    private Long exchangeCount;

    /**
     * Column: bankid
     */
    private String bankid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getWeekday() {
        return weekday;
    }

    public void setWeekday(Integer weekday) {
        this.weekday = weekday;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Integer getYeer() {
        return yeer;
    }

    public void setYeer(Integer yeer) {
        this.yeer = yeer;
    }

    public Long getPurchFund() {
        return purchFund;
    }

    public void setPurchFund(Long purchFund) {
        this.purchFund = purchFund;
    }

    public BigDecimal getReclaimStock() {
        return reclaimStock;
    }

    public void setReclaimStock(BigDecimal reclaimStock) {
        this.reclaimStock = reclaimStock;
    }

    public Long getExchangeCount() {
        return exchangeCount;
    }

    public void setExchangeCount(Long exchangeCount) {
        this.exchangeCount = exchangeCount;
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }
}