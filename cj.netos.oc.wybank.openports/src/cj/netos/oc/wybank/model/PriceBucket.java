package cj.netos.oc.wybank.model;

import java.math.BigDecimal;

/**
 * Table: price_bucket
 */
public class PriceBucket {
    /**
     * Column: id
     */
    private String id;

    /**
     * Column: bankid
     */
    private String bankid;

    /**
     * Column: price
     */
    private BigDecimal price;

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}