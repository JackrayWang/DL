package sds.db.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoleitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleitemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

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

        public Criteria andIdroleitemIsNull() {
            addCriterion("idroleitem is null");
            return (Criteria) this;
        }

        public Criteria andIdroleitemIsNotNull() {
            addCriterion("idroleitem is not null");
            return (Criteria) this;
        }

        public Criteria andIdroleitemEqualTo(String value) {
            addCriterion("idroleitem =", value, "idroleitem");
            return (Criteria) this;
        }

        public Criteria andIdroleitemNotEqualTo(String value) {
            addCriterion("idroleitem <>", value, "idroleitem");
            return (Criteria) this;
        }

        public Criteria andIdroleitemGreaterThan(String value) {
            addCriterion("idroleitem >", value, "idroleitem");
            return (Criteria) this;
        }

        public Criteria andIdroleitemGreaterThanOrEqualTo(String value) {
            addCriterion("idroleitem >=", value, "idroleitem");
            return (Criteria) this;
        }

        public Criteria andIdroleitemLessThan(String value) {
            addCriterion("idroleitem <", value, "idroleitem");
            return (Criteria) this;
        }

        public Criteria andIdroleitemLessThanOrEqualTo(String value) {
            addCriterion("idroleitem <=", value, "idroleitem");
            return (Criteria) this;
        }

        public Criteria andIdroleitemLike(String value) {
            addCriterion("idroleitem like", value, "idroleitem");
            return (Criteria) this;
        }

        public Criteria andIdroleitemNotLike(String value) {
            addCriterion("idroleitem not like", value, "idroleitem");
            return (Criteria) this;
        }

        public Criteria andIdroleitemIn(List<String> values) {
            addCriterion("idroleitem in", values, "idroleitem");
            return (Criteria) this;
        }

        public Criteria andIdroleitemNotIn(List<String> values) {
            addCriterion("idroleitem not in", values, "idroleitem");
            return (Criteria) this;
        }

        public Criteria andIdroleitemBetween(String value1, String value2) {
            addCriterion("idroleitem between", value1, value2, "idroleitem");
            return (Criteria) this;
        }

        public Criteria andIdroleitemNotBetween(String value1, String value2) {
            addCriterion("idroleitem not between", value1, value2, "idroleitem");
            return (Criteria) this;
        }

        public Criteria andUrlnameIsNull() {
            addCriterion("urlname is null");
            return (Criteria) this;
        }

        public Criteria andUrlnameIsNotNull() {
            addCriterion("urlname is not null");
            return (Criteria) this;
        }

        public Criteria andUrlnameEqualTo(String value) {
            addCriterion("urlname =", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameNotEqualTo(String value) {
            addCriterion("urlname <>", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameGreaterThan(String value) {
            addCriterion("urlname >", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameGreaterThanOrEqualTo(String value) {
            addCriterion("urlname >=", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameLessThan(String value) {
            addCriterion("urlname <", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameLessThanOrEqualTo(String value) {
            addCriterion("urlname <=", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameLike(String value) {
            addCriterion("urlname like", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameNotLike(String value) {
            addCriterion("urlname not like", value, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameIn(List<String> values) {
            addCriterion("urlname in", values, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameNotIn(List<String> values) {
            addCriterion("urlname not in", values, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameBetween(String value1, String value2) {
            addCriterion("urlname between", value1, value2, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlnameNotBetween(String value1, String value2) {
            addCriterion("urlname not between", value1, value2, "urlname");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andTsIsNull() {
            addCriterion("ts is null");
            return (Criteria) this;
        }

        public Criteria andTsIsNotNull() {
            addCriterion("ts is not null");
            return (Criteria) this;
        }

        public Criteria andTsEqualTo(Date value) {
            addCriterion("ts =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(Date value) {
            addCriterion("ts <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(Date value) {
            addCriterion("ts >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(Date value) {
            addCriterion("ts >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(Date value) {
            addCriterion("ts <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(Date value) {
            addCriterion("ts <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<Date> values) {
            addCriterion("ts in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<Date> values) {
            addCriterion("ts not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(Date value1, Date value2) {
            addCriterion("ts between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(Date value1, Date value2) {
            addCriterion("ts not between", value1, value2, "ts");
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