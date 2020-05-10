package cj.netos.oc.wybank.model;

import java.math.BigDecimal;

/**
 * Table: ttm_config
 */
public class TtmConfig {
    /**
     * Column: id
     */
    private String id;

    /**
     * Column: bankid
     */
    private String bankid;

    /**
     * Column: ttm
     * Remark: 市盈率
     */
    private BigDecimal ttm;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }

    public BigDecimal getTtm() {
        return ttm;
    }

    public void setTtm(BigDecimal ttm) {
        this.ttm = ttm;
    }
}