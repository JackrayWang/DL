package sds.db.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleExample() {
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

        public Criteria andIdroleIsNull() {
            addCriterion("idrole is null");
            return (Criteria) this;
        }

        public Criteria andIdroleIsNotNull() {
            addCriterion("idrole is not null");
            return (Criteria) this;
        }

        public Criteria andIdroleEqualTo(String value) {
            addCriterion("idrole =", value, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdroleNotEqualTo(String value) {
            addCriterion("idrole <>", value, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdroleGreaterThan(String value) {
            addCriterion("idrole >", value, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdroleGreaterThanOrEqualTo(String value) {
            addCriterion("idrole >=", value, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdroleLessThan(String value) {
            addCriterion("idrole <", value, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdroleLessThanOrEqualTo(String value) {
            addCriterion("idrole <=", value, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdroleLike(String value) {
            addCriterion("idrole like", value, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdroleNotLike(String value) {
            addCriterion("idrole not like", value, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdroleIn(List<String> values) {
            addCriterion("idrole in", values, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdroleNotIn(List<String> values) {
            addCriterion("idrole not in", values, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdroleBetween(String value1, String value2) {
            addCriterion("idrole between", value1, value2, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdroleNotBetween(String value1, String value2) {
            addCriterion("idrole not between", value1, value2, "idrole");
            return (Criteria) this;
        }

        public Criteria andAuthIsNull() {
            addCriterion("auth is null");
            return (Criteria) this;
        }

        public Criteria andAuthIsNotNull() {
            addCriterion("auth is not null");
            return (Criteria) this;
        }

        public Criteria andAuthEqualTo(String value) {
            addCriterion("auth =", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthNotEqualTo(String value) {
            addCriterion("auth <>", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthGreaterThan(String value) {
            addCriterion("auth >", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthGreaterThanOrEqualTo(String value) {
            addCriterion("auth >=", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthLessThan(String value) {
            addCriterion("auth <", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthLessThanOrEqualTo(String value) {
            addCriterion("auth <=", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthLike(String value) {
            addCriterion("auth like", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthNotLike(String value) {
            addCriterion("auth not like", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthIn(List<String> values) {
            addCriterion("auth in", values, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthNotIn(List<String> values) {
            addCriterion("auth not in", values, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthBetween(String value1, String value2) {
            addCriterion("auth between", value1, value2, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthNotBetween(String value1, String value2) {
            addCriterion("auth not between", value1, value2, "auth");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNull() {
            addCriterion("rolename is null");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNotNull() {
            addCriterion("rolename is not null");
            return (Criteria) this;
        }

        public Criteria andRolenameEqualTo(String value) {
            addCriterion("rolename =", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotEqualTo(String value) {
            addCriterion("rolename <>", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThan(String value) {
            addCriterion("rolename >", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThanOrEqualTo(String value) {
            addCriterion("rolename >=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThan(String value) {
            addCriterion("rolename <", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThanOrEqualTo(String value) {
            addCriterion("rolename <=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLike(String value) {
            addCriterion("rolename like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotLike(String value) {
            addCriterion("rolename not like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameIn(List<String> values) {
            addCriterion("rolename in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotIn(List<String> values) {
            addCriterion("rolename not in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameBetween(String value1, String value2) {
            addCriterion("rolename between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotBetween(String value1, String value2) {
            addCriterion("rolename not between", value1, value2, "rolename");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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