package cj.netos.oc.wybank.model;

/**
 * Table: work_switch_day
 */
public class WorkSwitchDay {
    /**
     * Column: id
     */
    private String id;

    /**
     * Column: bankid
     * Remark: 银行标识
     */
    private String bankid;

    /**
     * Column: workday
     * Remark: 会计日期
     */
    private String workday;

    /**
     * Column: pre_fund
     * Remark: 前一天资金现量
     */
    private Long preFund;

    /**
     * Column: uncheck_fund
     * Remark: 当前未检查资金现量
     */
    private Long uncheckFund;

    /**
     * Column: checked_fund
     * Remark: 前一天已检查资金现量
     */
    private Long checkedFund;

    /**
     * Column: pre_freezen
     * Remark: 前一天冻结资金
     */
    private Long preFreezen;

    /**
     * Column: uncheck_freezen
     * Remark: 当天未检查冻结资金
     */
    private Long uncheckFreezen;

    /**
     * Column: checked_freezen
     * Remark: 当天已检查冻结资金
     */
    private Long checkedFreezen;

    /**
     * Column: pre_free
     * Remark: 前一天自由金
     */
    private Long preFree;

    /**
     * Column: uncheck_free
     * Remark: 当天未检查自由金
     */
    private Long uncheckFree;

    /**
     * Column: checked_free
     * Remark: 当天已检查自由金
     */
    private Long checkedFree;

    /**
     * Column: pre_absorb
     * Remark: 前一天洇金
     */
    private Long preAbsorb;

    /**
     * Column: uncheck_absorb
     * Remark: 当天未检查洇金
     */
    private Long uncheckAbsorb;

    /**
     * Column: checked_absorb
     * Remark: 当天已检查洇金
     */
    private Long checkedAbsorb;

    /**
     * Column: pre_stock
     * Remark: 前一天纹银存量
     */
    private Long preStock;

    /**
     * Column: uncheck_stock
     * Remark: 未检查现量
     */
    private Long uncheckStock;

    /**
     * Column: checked_stock
     * Remark: 当天已检查纹银现量
     */
    private Long checkedStock;

    /**
     * Column: day_switch_state
     * Remark: 日切状态: 0 正在日切 1 日切完成
     */
    private Integer daySwitchState;

    /**
     * Column: note
     * Remark: 备注
     */
    private String note;

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

    public String getWorkday() {
        return workday;
    }

    public void setWorkday(String workday) {
        this.workday = workday == null ? null : workday.trim();
    }

    public Long getPreFund() {
        return preFund;
    }

    public void setPreFund(Long preFund) {
        this.preFund = preFund;
    }

    public Long getUncheckFund() {
        return uncheckFund;
    }

    public void setUncheckFund(Long uncheckFund) {
        this.uncheckFund = uncheckFund;
    }

    public Long getCheckedFund() {
        return checkedFund;
    }

    public void setCheckedFund(Long checkedFund) {
        this.checkedFund = checkedFund;
    }

    public Long getPreFreezen() {
        return preFreezen;
    }

    public void setPreFreezen(Long preFreezen) {
        this.preFreezen = preFreezen;
    }

    public Long getUncheckFreezen() {
        return uncheckFreezen;
    }

    public void setUncheckFreezen(Long uncheckFreezen) {
        this.uncheckFreezen = uncheckFreezen;
    }

    public Long getCheckedFreezen() {
        return checkedFreezen;
    }

    public void setCheckedFreezen(Long checkedFreezen) {
        this.checkedFreezen = checkedFreezen;
    }

    public Long getPreFree() {
        return preFree;
    }

    public void setPreFree(Long preFree) {
        this.preFree = preFree;
    }

    public Long getUncheckFree() {
        return uncheckFree;
    }

    public void setUncheckFree(Long uncheckFree) {
        this.uncheckFree = uncheckFree;
    }

    public Long getCheckedFree() {
        return checkedFree;
    }

    public void setCheckedFree(Long checkedFree) {
        this.checkedFree = checkedFree;
    }

    public Long getPreAbsorb() {
        return preAbsorb;
    }

    public void setPreAbsorb(Long preAbsorb) {
        this.preAbsorb = preAbsorb;
    }

    public Long getUncheckAbsorb() {
        return uncheckAbsorb;
    }

    public void setUncheckAbsorb(Long uncheckAbsorb) {
        this.uncheckAbsorb = uncheckAbsorb;
    }

    public Long getCheckedAbsorb() {
        return checkedAbsorb;
    }

    public void setCheckedAbsorb(Long checkedAbsorb) {
        this.checkedAbsorb = checkedAbsorb;
    }

    public Long getPreStock() {
        return preStock;
    }

    public void setPreStock(Long preStock) {
        this.preStock = preStock;
    }

    public Long getUncheckStock() {
        return uncheckStock;
    }

    public void setUncheckStock(Long uncheckStock) {
        this.uncheckStock = uncheckStock;
    }

    public Long getCheckedStock() {
        return checkedStock;
    }

    public void setCheckedStock(Long checkedStock) {
        this.checkedStock = checkedStock;
    }

    public Integer getDaySwitchState() {
        return daySwitchState;
    }

    public void setDaySwitchState(Integer daySwitchState) {
        this.daySwitchState = daySwitchState;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}