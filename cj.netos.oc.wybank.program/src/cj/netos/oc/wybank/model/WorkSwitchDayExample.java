package cj.netos.oc.wybank.model;

import java.util.ArrayList;
import java.util.List;

public class WorkSwitchDayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public WorkSwitchDayExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBankidIsNull() {
            addCriterion("bankid is null");
            return (Criteria) this;
        }

        public Criteria andBankidIsNotNull() {
            addCriterion("bankid is not null");
            return (Criteria) this;
        }

        public Criteria andBankidEqualTo(String value) {
            addCriterion("bankid =", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotEqualTo(String value) {
            addCriterion("bankid <>", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThan(String value) {
            addCriterion("bankid >", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThanOrEqualTo(String value) {
            addCriterion("bankid >=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThan(String value) {
            addCriterion("bankid <", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThanOrEqualTo(String value) {
            addCriterion("bankid <=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLike(String value) {
            addCriterion("bankid like", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotLike(String value) {
            addCriterion("bankid not like", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidIn(List<String> values) {
            addCriterion("bankid in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotIn(List<String> values) {
            addCriterion("bankid not in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidBetween(String value1, String value2) {
            addCriterion("bankid between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotBetween(String value1, String value2) {
            addCriterion("bankid not between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andWorkdayIsNull() {
            addCriterion("workday is null");
            return (Criteria) this;
        }

        public Criteria andWorkdayIsNotNull() {
            addCriterion("workday is not null");
            return (Criteria) this;
        }

        public Criteria andWorkdayEqualTo(String value) {
            addCriterion("workday =", value, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayNotEqualTo(String value) {
            addCriterion("workday <>", value, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayGreaterThan(String value) {
            addCriterion("workday >", value, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayGreaterThanOrEqualTo(String value) {
            addCriterion("workday >=", value, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayLessThan(String value) {
            addCriterion("workday <", value, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayLessThanOrEqualTo(String value) {
            addCriterion("workday <=", value, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayLike(String value) {
            addCriterion("workday like", value, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayNotLike(String value) {
            addCriterion("workday not like", value, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayIn(List<String> values) {
            addCriterion("workday in", values, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayNotIn(List<String> values) {
            addCriterion("workday not in", values, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayBetween(String value1, String value2) {
            addCriterion("workday between", value1, value2, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayNotBetween(String value1, String value2) {
            addCriterion("workday not between", value1, value2, "workday");
            return (Criteria) this;
        }

        public Criteria andPreFundIsNull() {
            addCriterion("pre_fund is null");
            return (Criteria) this;
        }

        public Criteria andPreFundIsNotNull() {
            addCriterion("pre_fund is not null");
            return (Criteria) this;
        }

        public Criteria andPreFundEqualTo(Long value) {
            addCriterion("pre_fund =", value, "preFund");
            return (Criteria) this;
        }

        public Criteria andPreFundNotEqualTo(Long value) {
            addCriterion("pre_fund <>", value, "preFund");
            return (Criteria) this;
        }

        public Criteria andPreFundGreaterThan(Long value) {
            addCriterion("pre_fund >", value, "preFund");
            return (Criteria) this;
        }

        public Criteria andPreFundGreaterThanOrEqualTo(Long value) {
            addCriterion("pre_fund >=", value, "preFund");
            return (Criteria) this;
        }

        public Criteria andPreFundLessThan(Long value) {
            addCriterion("pre_fund <", value, "preFund");
            return (Criteria) this;
        }

        public Criteria andPreFundLessThanOrEqualTo(Long value) {
            addCriterion("pre_fund <=", value, "preFund");
            return (Criteria) this;
        }

        public Criteria andPreFundIn(List<Long> values) {
            addCriterion("pre_fund in", values, "preFund");
            return (Criteria) this;
        }

        public Criteria andPreFundNotIn(List<Long> values) {
            addCriterion("pre_fund not in", values, "preFund");
            return (Criteria) this;
        }

        public Criteria andPreFundBetween(Long value1, Long value2) {
            addCriterion("pre_fund between", value1, value2, "preFund");
            return (Criteria) this;
        }

        public Criteria andPreFundNotBetween(Long value1, Long value2) {
            addCriterion("pre_fund not between", value1, value2, "preFund");
            return (Criteria) this;
        }

        public Criteria andUncheckFundIsNull() {
            addCriterion("uncheck_fund is null");
            return (Criteria) this;
        }

        public Criteria andUncheckFundIsNotNull() {
            addCriterion("uncheck_fund is not null");
            return (Criteria) this;
        }

        public Criteria andUncheckFundEqualTo(Long value) {
            addCriterion("uncheck_fund =", value, "uncheckFund");
            return (Criteria) this;
        }

        public Criteria andUncheckFundNotEqualTo(Long value) {
            addCriterion("uncheck_fund <>", value, "uncheckFund");
            return (Criteria) this;
        }

        public Criteria andUncheckFundGreaterThan(Long value) {
            addCriterion("uncheck_fund >", value, "uncheckFund");
            return (Criteria) this;
        }

        public Criteria andUncheckFundGreaterThanOrEqualTo(Long value) {
            addCriterion("uncheck_fund >=", value, "uncheckFund");
            return (Criteria) this;
        }

        public Criteria andUncheckFundLessThan(Long value) {
            addCriterion("uncheck_fund <", value, "uncheckFund");
            return (Criteria) this;
        }

        public Criteria andUncheckFundLessThanOrEqualTo(Long value) {
            addCriterion("uncheck_fund <=", value, "uncheckFund");
            return (Criteria) this;
        }

        public Criteria andUncheckFundIn(List<Long> values) {
            addCriterion("uncheck_fund in", values, "uncheckFund");
            return (Criteria) this;
        }

        public Criteria andUncheckFundNotIn(List<Long> values) {
            addCriterion("uncheck_fund not in", values, "uncheckFund");
            return (Criteria) this;
        }

        public Criteria andUncheckFundBetween(Long value1, Long value2) {
            addCriterion("uncheck_fund between", value1, value2, "uncheckFund");
            return (Criteria) this;
        }

        public Criteria andUncheckFundNotBetween(Long value1, Long value2) {
            addCriterion("uncheck_fund not between", value1, value2, "uncheckFund");
            return (Criteria) this;
        }

        public Criteria andCheckedFundIsNull() {
            addCriterion("checked_fund is null");
            return (Criteria) this;
        }

        public Criteria andCheckedFundIsNotNull() {
            addCriterion("checked_fund is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedFundEqualTo(Long value) {
            addCriterion("checked_fund =", value, "checkedFund");
            return (Criteria) this;
        }

        public Criteria andCheckedFundNotEqualTo(Long value) {
            addCriterion("checked_fund <>", value, "checkedFund");
            return (Criteria) this;
        }

        public Criteria andCheckedFundGreaterThan(Long value) {
            addCriterion("checked_fund >", value, "checkedFund");
            return (Criteria) this;
        }

        public Criteria andCheckedFundGreaterThanOrEqualTo(Long value) {
            addCriterion("checked_fund >=", value, "checkedFund");
            return (Criteria) this;
        }

        public Criteria andCheckedFundLessThan(Long value) {
            addCriterion("checked_fund <", value, "checkedFund");
            return (Criteria) this;
        }

        public Criteria andCheckedFundLessThanOrEqualTo(Long value) {
            addCriterion("checked_fund <=", value, "checkedFund");
            return (Criteria) this;
        }

        public Criteria andCheckedFundIn(List<Long> values) {
            addCriterion("checked_fund in", values, "checkedFund");
            return (Criteria) this;
        }

        public Criteria andCheckedFundNotIn(List<Long> values) {
            addCriterion("checked_fund not in", values, "checkedFund");
            return (Criteria) this;
        }

        public Criteria andCheckedFundBetween(Long value1, Long value2) {
            addCriterion("checked_fund between", value1, value2, "checkedFund");
            return (Criteria) this;
        }

        public Criteria andCheckedFundNotBetween(Long value1, Long value2) {
            addCriterion("checked_fund not between", value1, value2, "checkedFund");
            return (Criteria) this;
        }

        public Criteria andPreFreezenIsNull() {
            addCriterion("pre_freezen is null");
            return (Criteria) this;
        }

        public Criteria andPreFreezenIsNotNull() {
            addCriterion("pre_freezen is not null");
            return (Criteria) this;
        }

        public Criteria andPreFreezenEqualTo(Long value) {
            addCriterion("pre_freezen =", value, "preFreezen");
            return (Criteria) this;
        }

        public Criteria andPreFreezenNotEqualTo(Long value) {
            addCriterion("pre_freezen <>", value, "preFreezen");
            return (Criteria) this;
        }

        public Criteria andPreFreezenGreaterThan(Long value) {
            addCriterion("pre_freezen >", value, "preFreezen");
            return (Criteria) this;
        }

        public Criteria andPreFreezenGreaterThanOrEqualTo(Long value) {
            addCriterion("pre_freezen >=", value, "preFreezen");
            return (Criteria) this;
        }

        public Criteria andPreFreezenLessThan(Long value) {
            addCriterion("pre_freezen <", value, "preFreezen");
            return (Criteria) this;
        }

        public Criteria andPreFreezenLessThanOrEqualTo(Long value) {
            addCriterion("pre_freezen <=", value, "preFreezen");
            return (Criteria) this;
        }

        public Criteria andPreFreezenIn(List<Long> values) {
            addCriterion("pre_freezen in", values, "preFreezen");
            return (Criteria) this;
        }

        public Criteria andPreFreezenNotIn(List<Long> values) {
            addCriterion("pre_freezen not in", values, "preFreezen");
            return (Criteria) this;
        }

        public Criteria andPreFreezenBetween(Long value1, Long value2) {
            addCriterion("pre_freezen between", value1, value2, "preFreezen");
            return (Criteria) this;
        }

        public Criteria andPreFreezenNotBetween(Long value1, Long value2) {
            addCriterion("pre_freezen not between", value1, value2, "preFreezen");
            return (Criteria) this;
        }

        public Criteria andUncheckFreezenIsNull() {
            addCriterion("uncheck_freezen is null");
            return (Criteria) this;
        }

        public Criteria andUncheckFreezenIsNotNull() {
            addCriterion("uncheck_freezen is not null");
            return (Criteria) this;
        }

        public Criteria andUncheckFreezenEqualTo(Long value) {
            addCriterion("uncheck_freezen =", value, "uncheckFreezen");
            return (Criteria) this;
        }

        public Criteria andUncheckFreezenNotEqualTo(Long value) {
            addCriterion("uncheck_freezen <>", value, "uncheckFreezen");
            return (Criteria) this;
        }

        public Criteria andUncheckFreezenGreaterThan(Long value) {
            addCriterion("uncheck_freezen >", value, "uncheckFreezen");
            return (Criteria) this;
        }

        public Criteria andUncheckFreezenGreaterThanOrEqualTo(Long value) {
            addCriterion("uncheck_freezen >=", value, "uncheckFreezen");
            return (Criteria) this;
        }

        public Criteria andUncheckFreezenLessThan(Long value) {
            addCriterion("uncheck_freezen <", value, "uncheckFreezen");
            return (Criteria) this;
        }

        public Criteria andUncheckFreezenLessThanOrEqualTo(Long value) {
            addCriterion("uncheck_freezen <=", value, "uncheckFreezen");
            return (Criteria) this;
        }

        public Criteria andUncheckFreezenIn(List<Long> values) {
            addCriterion("uncheck_freezen in", values, "uncheckFreezen");
            return (Criteria) this;
        }

        public Criteria andUncheckFreezenNotIn(List<Long> values) {
            addCriterion("uncheck_freezen not in", values, "uncheckFreezen");
            return (Criteria) this;
        }

        public Criteria andUncheckFreezenBetween(Long value1, Long value2) {
            addCriterion("uncheck_freezen between", value1, value2, "uncheckFreezen");
            return (Criteria) this;
        }

        public Criteria andUncheckFreezenNotBetween(Long value1, Long value2) {
            addCriterion("uncheck_freezen not between", value1, value2, "uncheckFreezen");
            return (Criteria) this;
        }

        public Criteria andCheckedFreezenIsNull() {
            addCriterion("checked_freezen is null");
            return (Criteria) this;
        }

        public Criteria andCheckedFreezenIsNotNull() {
            addCriterion("checked_freezen is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedFreezenEqualTo(Long value) {
            addCriterion("checked_freezen =", value, "checkedFreezen");
            return (Criteria) this;
        }

        public Criteria andCheckedFreezenNotEqualTo(Long value) {
            addCriterion("checked_freezen <>", value, "checkedFreezen");
            return (Criteria) this;
        }

        public Criteria andCheckedFreezenGreaterThan(Long value) {
            addCriterion("checked_freezen >", value, "checkedFreezen");
            return (Criteria) this;
        }

        public Criteria andCheckedFreezenGreaterThanOrEqualTo(Long value) {
            addCriterion("checked_freezen >=", value, "checkedFreezen");
            return (Criteria) this;
        }

        public Criteria andCheckedFreezenLessThan(Long value) {
            addCriterion("checked_freezen <", value, "checkedFreezen");
            return (Criteria) this;
        }

        public Criteria andCheckedFreezenLessThanOrEqualTo(Long value) {
            addCriterion("checked_freezen <=", value, "checkedFreezen");
            return (Criteria) this;
        }

        public Criteria andCheckedFreezenIn(List<Long> values) {
            addCriterion("checked_freezen in", values, "checkedFreezen");
            return (Criteria) this;
        }

        public Criteria andCheckedFreezenNotIn(List<Long> values) {
            addCriterion("checked_freezen not in", values, "checkedFreezen");
            return (Criteria) this;
        }

        public Criteria andCheckedFreezenBetween(Long value1, Long value2) {
            addCriterion("checked_freezen between", value1, value2, "checkedFreezen");
            return (Criteria) this;
        }

        public Criteria andCheckedFreezenNotBetween(Long value1, Long value2) {
            addCriterion("checked_freezen not between", value1, value2, "checkedFreezen");
            return (Criteria) this;
        }

        public Criteria andPreFreeIsNull() {
            addCriterion("pre_free is null");
            return (Criteria) this;
        }

        public Criteria andPreFreeIsNotNull() {
            addCriterion("pre_free is not null");
            return (Criteria) this;
        }

        public Criteria andPreFreeEqualTo(Long value) {
            addCriterion("pre_free =", value, "preFree");
            return (Criteria) this;
        }

        public Criteria andPreFreeNotEqualTo(Long value) {
            addCriterion("pre_free <>", value, "preFree");
            return (Criteria) this;
        }

        public Criteria andPreFreeGreaterThan(Long value) {
            addCriterion("pre_free >", value, "preFree");
            return (Criteria) this;
        }

        public Criteria andPreFreeGreaterThanOrEqualTo(Long value) {
            addCriterion("pre_free >=", value, "preFree");
            return (Criteria) this;
        }

        public Criteria andPreFreeLessThan(Long value) {
            addCriterion("pre_free <", value, "preFree");
            return (Criteria) this;
        }

        public Criteria andPreFreeLessThanOrEqualTo(Long value) {
            addCriterion("pre_free <=", value, "preFree");
            return (Criteria) this;
        }

        public Criteria andPreFreeIn(List<Long> values) {
            addCriterion("pre_free in", values, "preFree");
            return (Criteria) this;
        }

        public Criteria andPreFreeNotIn(List<Long> values) {
            addCriterion("pre_free not in", values, "preFree");
            return (Criteria) this;
        }

        public Criteria andPreFreeBetween(Long value1, Long value2) {
            addCriterion("pre_free between", value1, value2, "preFree");
            return (Criteria) this;
        }

        public Criteria andPreFreeNotBetween(Long value1, Long value2) {
            addCriterion("pre_free not between", value1, value2, "preFree");
            return (Criteria) this;
        }

        public Criteria andUncheckFreeIsNull() {
            addCriterion("uncheck_free is null");
            return (Criteria) this;
        }

        public Criteria andUncheckFreeIsNotNull() {
            addCriterion("uncheck_free is not null");
            return (Criteria) this;
        }

        public Criteria andUncheckFreeEqualTo(Long value) {
            addCriterion("uncheck_free =", value, "uncheckFree");
            return (Criteria) this;
        }

        public Criteria andUncheckFreeNotEqualTo(Long value) {
            addCriterion("uncheck_free <>", value, "uncheckFree");
            return (Criteria) this;
        }

        public Criteria andUncheckFreeGreaterThan(Long value) {
            addCriterion("uncheck_free >", value, "uncheckFree");
            return (Criteria) this;
        }

        public Criteria andUncheckFreeGreaterThanOrEqualTo(Long value) {
            addCriterion("uncheck_free >=", value, "uncheckFree");
            return (Criteria) this;
        }

        public Criteria andUncheckFreeLessThan(Long value) {
            addCriterion("uncheck_free <", value, "uncheckFree");
            return (Criteria) this;
        }

        public Criteria andUncheckFreeLessThanOrEqualTo(Long value) {
            addCriterion("uncheck_free <=", value, "uncheckFree");
            return (Criteria) this;
        }

        public Criteria andUncheckFreeIn(List<Long> values) {
            addCriterion("uncheck_free in", values, "uncheckFree");
            return (Criteria) this;
        }

        public Criteria andUncheckFreeNotIn(List<Long> values) {
            addCriterion("uncheck_free not in", values, "uncheckFree");
            return (Criteria) this;
        }

        public Criteria andUncheckFreeBetween(Long value1, Long value2) {
            addCriterion("uncheck_free between", value1, value2, "uncheckFree");
            return (Criteria) this;
        }

        public Criteria andUncheckFreeNotBetween(Long value1, Long value2) {
            addCriterion("uncheck_free not between", value1, value2, "uncheckFree");
            return (Criteria) this;
        }

        public Criteria andCheckedFreeIsNull() {
            addCriterion("checked_free is null");
            return (Criteria) this;
        }

        public Criteria andCheckedFreeIsNotNull() {
            addCriterion("checked_free is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedFreeEqualTo(Long value) {
            addCriterion("checked_free =", value, "checkedFree");
            return (Criteria) this;
        }

        public Criteria andCheckedFreeNotEqualTo(Long value) {
            addCriterion("checked_free <>", value, "checkedFree");
            return (Criteria) this;
        }

        public Criteria andCheckedFreeGreaterThan(Long value) {
            addCriterion("checked_free >", value, "checkedFree");
            return (Criteria) this;
        }

        public Criteria andCheckedFreeGreaterThanOrEqualTo(Long value) {
            addCriterion("checked_free >=", value, "checkedFree");
            return (Criteria) this;
        }

        public Criteria andCheckedFreeLessThan(Long value) {
            addCriterion("checked_free <", value, "checkedFree");
            return (Criteria) this;
        }

        public Criteria andCheckedFreeLessThanOrEqualTo(Long value) {
            addCriterion("checked_free <=", value, "checkedFree");
            return (Criteria) this;
        }

        public Criteria andCheckedFreeIn(List<Long> values) {
            addCriterion("checked_free in", values, "checkedFree");
            return (Criteria) this;
        }

        public Criteria andCheckedFreeNotIn(List<Long> values) {
            addCriterion("checked_free not in", values, "checkedFree");
            return (Criteria) this;
        }

        public Criteria andCheckedFreeBetween(Long value1, Long value2) {
            addCriterion("checked_free between", value1, value2, "checkedFree");
            return (Criteria) this;
        }

        public Criteria andCheckedFreeNotBetween(Long value1, Long value2) {
            addCriterion("checked_free not between", value1, value2, "checkedFree");
            return (Criteria) this;
        }

        public Criteria andPreAbsorbIsNull() {
            addCriterion("pre_absorb is null");
            return (Criteria) this;
        }

        public Criteria andPreAbsorbIsNotNull() {
            addCriterion("pre_absorb is not null");
            return (Criteria) this;
        }

        public Criteria andPreAbsorbEqualTo(Long value) {
            addCriterion("pre_absorb =", value, "preAbsorb");
            return (Criteria) this;
        }

        public Criteria andPreAbsorbNotEqualTo(Long value) {
            addCriterion("pre_absorb <>", value, "preAbsorb");
            return (Criteria) this;
        }

        public Criteria andPreAbsorbGreaterThan(Long value) {
            addCriterion("pre_absorb >", value, "preAbsorb");
            return (Criteria) this;
        }

        public Criteria andPreAbsorbGreaterThanOrEqualTo(Long value) {
            addCriterion("pre_absorb >=", value, "preAbsorb");
            return (Criteria) this;
        }

        public Criteria andPreAbsorbLessThan(Long value) {
            addCriterion("pre_absorb <", value, "preAbsorb");
            return (Criteria) this;
        }

        public Criteria andPreAbsorbLessThanOrEqualTo(Long value) {
            addCriterion("pre_absorb <=", value, "preAbsorb");
            return (Criteria) this;
        }

        public Criteria andPreAbsorbIn(List<Long> values) {
            addCriterion("pre_absorb in", values, "preAbsorb");
            return (Criteria) this;
        }

        public Criteria andPreAbsorbNotIn(List<Long> values) {
            addCriterion("pre_absorb not in", values, "preAbsorb");
            return (Criteria) this;
        }

        public Criteria andPreAbsorbBetween(Long value1, Long value2) {
            addCriterion("pre_absorb between", value1, value2, "preAbsorb");
            return (Criteria) this;
        }

        public Criteria andPreAbsorbNotBetween(Long value1, Long value2) {
            addCriterion("pre_absorb not between", value1, value2, "preAbsorb");
            return (Criteria) this;
        }

        public Criteria andUncheckAbsorbIsNull() {
            addCriterion("uncheck_absorb is null");
            return (Criteria) this;
        }

        public Criteria andUncheckAbsorbIsNotNull() {
            addCriterion("uncheck_absorb is not null");
            return (Criteria) this;
        }

        public Criteria andUncheckAbsorbEqualTo(Long value) {
            addCriterion("uncheck_absorb =", value, "uncheckAbsorb");
            return (Criteria) this;
        }

        public Criteria andUncheckAbsorbNotEqualTo(Long value) {
            addCriterion("uncheck_absorb <>", value, "uncheckAbsorb");
            return (Criteria) this;
        }

        public Criteria andUncheckAbsorbGreaterThan(Long value) {
            addCriterion("uncheck_absorb >", value, "uncheckAbsorb");
            return (Criteria) this;
        }

        public Criteria andUncheckAbsorbGreaterThanOrEqualTo(Long value) {
            addCriterion("uncheck_absorb >=", value, "uncheckAbsorb");
            return (Criteria) this;
        }

        public Criteria andUncheckAbsorbLessThan(Long value) {
            addCriterion("uncheck_absorb <", value, "uncheckAbsorb");
            return (Criteria) this;
        }

        public Criteria andUncheckAbsorbLessThanOrEqualTo(Long value) {
            addCriterion("uncheck_absorb <=", value, "uncheckAbsorb");
            return (Criteria) this;
        }

        public Criteria andUncheckAbsorbIn(List<Long> values) {
            addCriterion("uncheck_absorb in", values, "uncheckAbsorb");
            return (Criteria) this;
        }

        public Criteria andUncheckAbsorbNotIn(List<Long> values) {
            addCriterion("uncheck_absorb not in", values, "uncheckAbsorb");
            return (Criteria) this;
        }

        public Criteria andUncheckAbsorbBetween(Long value1, Long value2) {
            addCriterion("uncheck_absorb between", value1, value2, "uncheckAbsorb");
            return (Criteria) this;
        }

        public Criteria andUncheckAbsorbNotBetween(Long value1, Long value2) {
            addCriterion("uncheck_absorb not between", value1, value2, "uncheckAbsorb");
            return (Criteria) this;
        }

        public Criteria andCheckedAbsorbIsNull() {
            addCriterion("checked_absorb is null");
            return (Criteria) this;
        }

        public Criteria andCheckedAbsorbIsNotNull() {
            addCriterion("checked_absorb is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedAbsorbEqualTo(Long value) {
            addCriterion("checked_absorb =", value, "checkedAbsorb");
            return (Criteria) this;
        }

        public Criteria andCheckedAbsorbNotEqualTo(Long value) {
            addCriterion("checked_absorb <>", value, "checkedAbsorb");
            return (Criteria) this;
        }

        public Criteria andCheckedAbsorbGreaterThan(Long value) {
            addCriterion("checked_absorb >", value, "checkedAbsorb");
            return (Criteria) this;
        }

        public Criteria andCheckedAbsorbGreaterThanOrEqualTo(Long value) {
            addCriterion("checked_absorb >=", value, "checkedAbsorb");
            return (Criteria) this;
        }

        public Criteria andCheckedAbsorbLessThan(Long value) {
            addCriterion("checked_absorb <", value, "checkedAbsorb");
            return (Criteria) this;
        }

        public Criteria andCheckedAbsorbLessThanOrEqualTo(Long value) {
            addCriterion("checked_absorb <=", value, "checkedAbsorb");
            return (Criteria) this;
        }

        public Criteria andCheckedAbsorbIn(List<Long> values) {
            addCriterion("checked_absorb in", values, "checkedAbsorb");
            return (Criteria) this;
        }

        public Criteria andCheckedAbsorbNotIn(List<Long> values) {
            addCriterion("checked_absorb not in", values, "checkedAbsorb");
            return (Criteria) this;
        }

        public Criteria andCheckedAbsorbBetween(Long value1, Long value2) {
            addCriterion("checked_absorb between", value1, value2, "checkedAbsorb");
            return (Criteria) this;
        }

        public Criteria andCheckedAbsorbNotBetween(Long value1, Long value2) {
            addCriterion("checked_absorb not between", value1, value2, "checkedAbsorb");
            return (Criteria) this;
        }

        public Criteria andPreStockIsNull() {
            addCriterion("pre_stock is null");
            return (Criteria) this;
        }

        public Criteria andPreStockIsNotNull() {
            addCriterion("pre_stock is not null");
            return (Criteria) this;
        }

        public Criteria andPreStockEqualTo(Long value) {
            addCriterion("pre_stock =", value, "preStock");
            return (Criteria) this;
        }

        public Criteria andPreStockNotEqualTo(Long value) {
            addCriterion("pre_stock <>", value, "preStock");
            return (Criteria) this;
        }

        public Criteria andPreStockGreaterThan(Long value) {
            addCriterion("pre_stock >", value, "preStock");
            return (Criteria) this;
        }

        public Criteria andPreStockGreaterThanOrEqualTo(Long value) {
            addCriterion("pre_stock >=", value, "preStock");
            return (Criteria) this;
        }

        public Criteria andPreStockLessThan(Long value) {
            addCriterion("pre_stock <", value, "preStock");
            return (Criteria) this;
        }

        public Criteria andPreStockLessThanOrEqualTo(Long value) {
            addCriterion("pre_stock <=", value, "preStock");
            return (Criteria) this;
        }

        public Criteria andPreStockIn(List<Long> values) {
            addCriterion("pre_stock in", values, "preStock");
            return (Criteria) this;
        }

        public Criteria andPreStockNotIn(List<Long> values) {
            addCriterion("pre_stock not in", values, "preStock");
            return (Criteria) this;
        }

        public Criteria andPreStockBetween(Long value1, Long value2) {
            addCriterion("pre_stock between", value1, value2, "preStock");
            return (Criteria) this;
        }

        public Criteria andPreStockNotBetween(Long value1, Long value2) {
            addCriterion("pre_stock not between", value1, value2, "preStock");
            return (Criteria) this;
        }

        public Criteria andUncheckStockIsNull() {
            addCriterion("uncheck_stock is null");
            return (Criteria) this;
        }

        public Criteria andUncheckStockIsNotNull() {
            addCriterion("uncheck_stock is not null");
            return (Criteria) this;
        }

        public Criteria andUncheckStockEqualTo(Long value) {
            addCriterion("uncheck_stock =", value, "uncheckStock");
            return (Criteria) this;
        }

        public Criteria andUncheckStockNotEqualTo(Long value) {
            addCriterion("uncheck_stock <>", value, "uncheckStock");
            return (Criteria) this;
        }

        public Criteria andUncheckStockGreaterThan(Long value) {
            addCriterion("uncheck_stock >", value, "uncheckStock");
            return (Criteria) this;
        }

        public Criteria andUncheckStockGreaterThanOrEqualTo(Long value) {
            addCriterion("uncheck_stock >=", value, "uncheckStock");
            return (Criteria) this;
        }

        public Criteria andUncheckStockLessThan(Long value) {
            addCriterion("uncheck_stock <", value, "uncheckStock");
            return (Criteria) this;
        }

        public Criteria andUncheckStockLessThanOrEqualTo(Long value) {
            addCriterion("uncheck_stock <=", value, "uncheckStock");
            return (Criteria) this;
        }

        public Criteria andUncheckStockIn(List<Long> values) {
            addCriterion("uncheck_stock in", values, "uncheckStock");
            return (Criteria) this;
        }

        public Criteria andUncheckStockNotIn(List<Long> values) {
            addCriterion("uncheck_stock not in", values, "uncheckStock");
            return (Criteria) this;
        }

        public Criteria andUncheckStockBetween(Long value1, Long value2) {
            addCriterion("uncheck_stock between", value1, value2, "uncheckStock");
            return (Criteria) this;
        }

        public Criteria andUncheckStockNotBetween(Long value1, Long value2) {
            addCriterion("uncheck_stock not between", value1, value2, "uncheckStock");
            return (Criteria) this;
        }

        public Criteria andCheckedStockIsNull() {
            addCriterion("checked_stock is null");
            return (Criteria) this;
        }

        public Criteria andCheckedStockIsNotNull() {
            addCriterion("checked_stock is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedStockEqualTo(Long value) {
            addCriterion("checked_stock =", value, "checkedStock");
            return (Criteria) this;
        }

        public Criteria andCheckedStockNotEqualTo(Long value) {
            addCriterion("checked_stock <>", value, "checkedStock");
            return (Criteria) this;
        }

        public Criteria andCheckedStockGreaterThan(Long value) {
            addCriterion("checked_stock >", value, "checkedStock");
            return (Criteria) this;
        }

        public Criteria andCheckedStockGreaterThanOrEqualTo(Long value) {
            addCriterion("checked_stock >=", value, "checkedStock");
            return (Criteria) this;
        }

        public Criteria andCheckedStockLessThan(Long value) {
            addCriterion("checked_stock <", value, "checkedStock");
            return (Criteria) this;
        }

        public Criteria andCheckedStockLessThanOrEqualTo(Long value) {
            addCriterion("checked_stock <=", value, "checkedStock");
            return (Criteria) this;
        }

        public Criteria andCheckedStockIn(List<Long> values) {
            addCriterion("checked_stock in", values, "checkedStock");
            return (Criteria) this;
        }

        public Criteria andCheckedStockNotIn(List<Long> values) {
            addCriterion("checked_stock not in", values, "checkedStock");
            return (Criteria) this;
        }

        public Criteria andCheckedStockBetween(Long value1, Long value2) {
            addCriterion("checked_stock between", value1, value2, "checkedStock");
            return (Criteria) this;
        }

        public Criteria andCheckedStockNotBetween(Long value1, Long value2) {
            addCriterion("checked_stock not between", value1, value2, "checkedStock");
            return (Criteria) this;
        }

        public Criteria andDaySwitchStateIsNull() {
            addCriterion("day_switch_state is null");
            return (Criteria) this;
        }

        public Criteria andDaySwitchStateIsNotNull() {
            addCriterion("day_switch_state is not null");
            return (Criteria) this;
        }

        public Criteria andDaySwitchStateEqualTo(Integer value) {
            addCriterion("day_switch_state =", value, "daySwitchState");
            return (Criteria) this;
        }

        public Criteria andDaySwitchStateNotEqualTo(Integer value) {
            addCriterion("day_switch_state <>", value, "daySwitchState");
            return (Criteria) this;
        }

        public Criteria andDaySwitchStateGreaterThan(Integer value) {
            addCriterion("day_switch_state >", value, "daySwitchState");
            return (Criteria) this;
        }

        public Criteria andDaySwitchStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_switch_state >=", value, "daySwitchState");
            return (Criteria) this;
        }

        public Criteria andDaySwitchStateLessThan(Integer value) {
            addCriterion("day_switch_state <", value, "daySwitchState");
            return (Criteria) this;
        }

        public Criteria andDaySwitchStateLessThanOrEqualTo(Integer value) {
            addCriterion("day_switch_state <=", value, "daySwitchState");
            return (Criteria) this;
        }

        public Criteria andDaySwitchStateIn(List<Integer> values) {
            addCriterion("day_switch_state in", values, "daySwitchState");
            return (Criteria) this;
        }

        public Criteria andDaySwitchStateNotIn(List<Integer> values) {
            addCriterion("day_switch_state not in", values, "daySwitchState");
            return (Criteria) this;
        }

        public Criteria andDaySwitchStateBetween(Integer value1, Integer value2) {
            addCriterion("day_switch_state between", value1, value2, "daySwitchState");
            return (Criteria) this;
        }

        public Criteria andDaySwitchStateNotBetween(Integer value1, Integer value2) {
            addCriterion("day_switch_state not between", value1, value2, "daySwitchState");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}