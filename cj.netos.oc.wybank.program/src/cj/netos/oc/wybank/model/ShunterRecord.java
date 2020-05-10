package cj.netos.oc.wybank.model;

/**
 * Table: shunter_record
 */
public class ShunterRecord {
    /**
     * Column: sn
     */
    private String sn;

    /**
     * Column: amount
     * Remark: 分账的网络洇金金额。一般是每次一次性分完网络洇金
     */
    private String amount;

    /**
     * Column: note
     */
    private String note;

    /**
     * Column: state
     * Remark: 0分账中 1分账完成 2分账失败
     */
    private String state;

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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }
}