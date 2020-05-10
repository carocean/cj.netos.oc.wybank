package cj.netos.oc.wybank.model;

import java.math.BigDecimal;

/**
 * Table: exchange_ledger
 */
public class ExchangeLedger {
    /**
     * Column: sn
     */
    private String sn;

    /**
     * Column: title
     * Remark: 显示名，一般是人名
     */
    private String title;

    /**
     * Column: participant
     * Remark: 参与者：申购人或承兑人或分账目标
     */
    private String participant;

    /**
     * Column: bankid
     */
    private String bankid;

    /**
     * Column: amount
     * Remark: 承兑的发生额
     */
    private Long amount;

    /**
     * Column: refsn
     * Remark: 关联承兑单号
     */
    private String refsn;

    /**
     * Column: ctime
     */
    private String ctime;

    /**
     * Column: note
     */
    private String note;

    /**
     * Column: workday
     * Remark: 会计日期
     */
    private String workday;

    /**
     * Column: purch_fund
     * Remark: 发放总金额
     */
    private Long purchFund;

    /**
     * Column: reclaim_stock
     * Remark: 回收总银量
     */
    private BigDecimal reclaimStock;

    /**
     * Column: exchange_count
     * Remark: 承兑总笔数
     */
    private Long exchangeCount;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getParticipant() {
        return participant;
    }

    public void setParticipant(String participant) {
        this.participant = participant == null ? null : participant.trim();
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getRefsn() {
        return refsn;
    }

    public void setRefsn(String refsn) {
        this.refsn = refsn == null ? null : refsn.trim();
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime == null ? null : ctime.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getWorkday() {
        return workday;
    }

    public void setWorkday(String workday) {
        this.workday = workday == null ? null : workday.trim();
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
}