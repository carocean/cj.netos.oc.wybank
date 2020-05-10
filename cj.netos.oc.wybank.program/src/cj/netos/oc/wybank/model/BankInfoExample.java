package cj.netos.oc.wybank.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public BankInfoExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("`owner` is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("`owner` is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("`owner` =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("`owner` <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("`owner` >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("`owner` >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("`owner` <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("`owner` <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("`owner` like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("`owner` not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("`owner` in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("`owner` not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("`owner` between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("`owner` not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNull() {
            addCriterion("property is null");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNotNull() {
            addCriterion("property is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyEqualTo(Integer value) {
            addCriterion("property =", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotEqualTo(Integer value) {
            addCriterion("property <>", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThan(Integer value) {
            addCriterion("property >", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThanOrEqualTo(Integer value) {
            addCriterion("property >=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThan(Integer value) {
            addCriterion("property <", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThanOrEqualTo(Integer value) {
            addCriterion("property <=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyIn(List<Integer> values) {
            addCriterion("property in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotIn(List<Integer> values) {
            addCriterion("property not in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyBetween(Integer value1, Integer value2) {
            addCriterion("property between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotBetween(Integer value1, Integer value2) {
            addCriterion("property not between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(String value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(String value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(String value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(String value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(String value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLike(String value) {
            addCriterion("ctime like", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotLike(String value) {
            addCriterion("ctime not like", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<String> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<String> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(String value1, String value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(String value1, String value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("`location` is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("`location` is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("`location` =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("`location` <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("`location` >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("`location` >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("`location` <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("`location` <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("`location` like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("`location` not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("`location` in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("`location` not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("`location` between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("`location` not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`state` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("`state` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("`state` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("`state` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("`state` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("`state` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("`state` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("`state` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("`state` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("`state` not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioIsNull() {
            addCriterion("principal_ratio is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioIsNotNull() {
            addCriterion("principal_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioEqualTo(BigDecimal value) {
            addCriterion("principal_ratio =", value, "principalRatio");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioNotEqualTo(BigDecimal value) {
            addCriterion("principal_ratio <>", value, "principalRatio");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioGreaterThan(BigDecimal value) {
            addCriterion("principal_ratio >", value, "principalRatio");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("principal_ratio >=", value, "principalRatio");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioLessThan(BigDecimal value) {
            addCriterion("principal_ratio <", value, "principalRatio");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("principal_ratio <=", value, "principalRatio");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioIn(List<BigDecimal> values) {
            addCriterion("principal_ratio in", values, "principalRatio");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioNotIn(List<BigDecimal> values) {
            addCriterion("principal_ratio not in", values, "principalRatio");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("principal_ratio between", value1, value2, "principalRatio");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("principal_ratio not between", value1, value2, "principalRatio");
            return (Criteria) this;
        }

        public Criteria andReserveRatioIsNull() {
            addCriterion("reserve_ratio is null");
            return (Criteria) this;
        }

        public Criteria andReserveRatioIsNotNull() {
            addCriterion("reserve_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andReserveRatioEqualTo(BigDecimal value) {
            addCriterion("reserve_ratio =", value, "reserveRatio");
            return (Criteria) this;
        }

        public Criteria andReserveRatioNotEqualTo(BigDecimal value) {
            addCriterion("reserve_ratio <>", value, "reserveRatio");
            return (Criteria) this;
        }

        public Criteria andReserveRatioGreaterThan(BigDecimal value) {
            addCriterion("reserve_ratio >", value, "reserveRatio");
            return (Criteria) this;
        }

        public Criteria andReserveRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reserve_ratio >=", value, "reserveRatio");
            return (Criteria) this;
        }

        public Criteria andReserveRatioLessThan(BigDecimal value) {
            addCriterion("reserve_ratio <", value, "reserveRatio");
            return (Criteria) this;
        }

        public Criteria andReserveRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reserve_ratio <=", value, "reserveRatio");
            return (Criteria) this;
        }

        public Criteria andReserveRatioIn(List<BigDecimal> values) {
            addCriterion("reserve_ratio in", values, "reserveRatio");
            return (Criteria) this;
        }

        public Criteria andReserveRatioNotIn(List<BigDecimal> values) {
            addCriterion("reserve_ratio not in", values, "reserveRatio");
            return (Criteria) this;
        }

        public Criteria andReserveRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reserve_ratio between", value1, value2, "reserveRatio");
            return (Criteria) this;
        }

        public Criteria andReserveRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reserve_ratio not between", value1, value2, "reserveRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioIsNull() {
            addCriterion("free_ratio is null");
            return (Criteria) this;
        }

        public Criteria andFreeRatioIsNotNull() {
            addCriterion("free_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andFreeRatioEqualTo(BigDecimal value) {
            addCriterion("free_ratio =", value, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioNotEqualTo(BigDecimal value) {
            addCriterion("free_ratio <>", value, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioGreaterThan(BigDecimal value) {
            addCriterion("free_ratio >", value, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("free_ratio >=", value, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioLessThan(BigDecimal value) {
            addCriterion("free_ratio <", value, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("free_ratio <=", value, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioIn(List<BigDecimal> values) {
            addCriterion("free_ratio in", values, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioNotIn(List<BigDecimal> values) {
            addCriterion("free_ratio not in", values, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("free_ratio between", value1, value2, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("free_ratio not between", value1, value2, "freeRatio");
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