package cj.netos.oc.wybank.model;

/**
 * Table: shunter_index
 */
public class ShunterIndex {
    /**
     * Column: id
     */
    private String id;

    /**
     * Column: day
     * Remark: 纹银存量
     */
    private Integer day;

    /**
     * Column: weekday
     */
    private Integer weekday;

    /**
     * Column: month
     */
    private Integer month;

    /**
     * Column: season
     */
    private Integer season;

    /**
     * Column: yeer
     */
    private Integer yeer;

    /**
     * Column: amount
     * Remark: 分账总金额
     */
    private Long amount;

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

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }
}