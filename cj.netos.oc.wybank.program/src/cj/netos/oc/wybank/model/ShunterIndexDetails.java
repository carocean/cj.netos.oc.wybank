package cj.netos.oc.wybank.model;

import java.math.BigDecimal;

/**
 * Table: shunter_index_details
 */
public class ShunterIndexDetails {
    /**
     * Column: id
     * Remark: 标识
     */
    private String id;

    /**
     * Column: ruleid
     * Remark: 分账规则标识
     */
    private String ruleid;

    /**
     * Column: amount
     * Remark: 分账金额
     */
    private Long amount;

    /**
     * Column: ratio
     * Remark: 分账比率，，见shunter_rule表
     */
    private BigDecimal ratio;

    /**
     * Column: subject
     * Remark: 分账主题，见shunter_rule表
     */
    private String subject;

    /**
     * Column: person
     * Remark: 分给谁，，见shunter_rule表
     */
    private String person;

    /**
     * Column: shunter_index
     * Remark: 关联分账指标表
     */
    private String shunterIndex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRuleid() {
        return ruleid;
    }

    public void setRuleid(String ruleid) {
        this.ruleid = ruleid == null ? null : ruleid.trim();
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public BigDecimal getRatio() {
        return ratio;
    }

    public void setRatio(BigDecimal ratio) {
        this.ratio = ratio;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }

    public String getShunterIndex() {
        return shunterIndex;
    }

    public void setShunterIndex(String shunterIndex) {
        this.shunterIndex = shunterIndex == null ? null : shunterIndex.trim();
    }
}