package cj.netos.oc.wybank.model;

/**
 * Table: free_bucket
 */
public class FreeBucket {
    /**
     * Column: id
     */
    private String id;

    /**
     * Column: bankid
     */
    private String bankid;

    /**
     * Column: amount
     * Remark: 自由金余额
     */
    private Long amount;

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

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}