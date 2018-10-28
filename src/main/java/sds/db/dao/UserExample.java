package sds.db.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andIduserIsNull() {
            addCriterion("iduser is null");
            return (Criteria) this;
        }

        public Criteria andIduserIsNotNull() {
            addCriterion("iduser is not null");
            return (Criteria) this;
        }

        public Criteria andIduserEqualTo(String value) {
            addCriterion("iduser =", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserNotEqualTo(String value) {
            addCriterion("iduser <>", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserGreaterThan(String value) {
            addCriterion("iduser >", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserGreaterThanOrEqualTo(String value) {
            addCriterion("iduser >=", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserLessThan(String value) {
            addCriterion("iduser <", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserLessThanOrEqualTo(String value) {
            addCriterion("iduser <=", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserLike(String value) {
            addCriterion("iduser like", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserNotLike(String value) {
            addCriterion("iduser not like", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserIn(List<String> values) {
            addCriterion("iduser in", values, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserNotIn(List<String> values) {
            addCriterion("iduser not in", values, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserBetween(String value1, String value2) {
            addCriterion("iduser between", value1, value2, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserNotBetween(String value1, String value2) {
            addCriterion("iduser not between", value1, value2, "iduser");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("pwd not between", value1, value2, "pwd");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andUsercolIsNull() {
            addCriterion("usercol is null");
            return (Criteria) this;
        }

        public Criteria andUsercolIsNotNull() {
            addCriterion("usercol is not null");
            return (Criteria) this;
        }

        public Criteria andUsercolEqualTo(String value) {
            addCriterion("usercol =", value, "usercol");
            return (Criteria) this;
        }

        public Criteria andUsercolNotEqualTo(String value) {
            addCriterion("usercol <>", value, "usercol");
            return (Criteria) this;
        }

        public Criteria andUsercolGreaterThan(String value) {
            addCriterion("usercol >", value, "usercol");
            return (Criteria) this;
        }

        public Criteria andUsercolGreaterThanOrEqualTo(String value) {
            addCriterion("usercol >=", value, "usercol");
            return (Criteria) this;
        }

        public Criteria andUsercolLessThan(String value) {
            addCriterion("usercol <", value, "usercol");
            return (Criteria) this;
        }

        public Criteria andUsercolLessThanOrEqualTo(String value) {
            addCriterion("usercol <=", value, "usercol");
            return (Criteria) this;
        }

        public Criteria andUsercolLike(String value) {
            addCriterion("usercol like", value, "usercol");
            return (Criteria) this;
        }

        public Criteria andUsercolNotLike(String value) {
            addCriterion("usercol not like", value, "usercol");
            return (Criteria) this;
        }

        public Criteria andUsercolIn(List<String> values) {
            addCriterion("usercol in", values, "usercol");
            return (Criteria) this;
        }

        public Criteria andUsercolNotIn(List<String> values) {
            addCriterion("usercol not in", values, "usercol");
            return (Criteria) this;
        }

        public Criteria andUsercolBetween(String value1, String value2) {
            addCriterion("usercol between", value1, value2, "usercol");
            return (Criteria) this;
        }

        public Criteria andUsercolNotBetween(String value1, String value2) {
            addCriterion("usercol not between", value1, value2, "usercol");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andMd5SrcIsNull() {
            addCriterion("md5_src is null");
            return (Criteria) this;
        }

        public Criteria andMd5SrcIsNotNull() {
            addCriterion("md5_src is not null");
            return (Criteria) this;
        }

        public Criteria andMd5SrcEqualTo(String value) {
            addCriterion("md5_src =", value, "md5Src");
            return (Criteria) this;
        }

        public Criteria andMd5SrcNotEqualTo(String value) {
            addCriterion("md5_src <>", value, "md5Src");
            return (Criteria) this;
        }

        public Criteria andMd5SrcGreaterThan(String value) {
            addCriterion("md5_src >", value, "md5Src");
            return (Criteria) this;
        }

        public Criteria andMd5SrcGreaterThanOrEqualTo(String value) {
            addCriterion("md5_src >=", value, "md5Src");
            return (Criteria) this;
        }

        public Criteria andMd5SrcLessThan(String value) {
            addCriterion("md5_src <", value, "md5Src");
            return (Criteria) this;
        }

        public Criteria andMd5SrcLessThanOrEqualTo(String value) {
            addCriterion("md5_src <=", value, "md5Src");
            return (Criteria) this;
        }

        public Criteria andMd5SrcLike(String value) {
            addCriterion("md5_src like", value, "md5Src");
            return (Criteria) this;
        }

        public Criteria andMd5SrcNotLike(String value) {
            addCriterion("md5_src not like", value, "md5Src");
            return (Criteria) this;
        }

        public Criteria andMd5SrcIn(List<String> values) {
            addCriterion("md5_src in", values, "md5Src");
            return (Criteria) this;
        }

        public Criteria andMd5SrcNotIn(List<String> values) {
            addCriterion("md5_src not in", values, "md5Src");
            return (Criteria) this;
        }

        public Criteria andMd5SrcBetween(String value1, String value2) {
            addCriterion("md5_src between", value1, value2, "md5Src");
            return (Criteria) this;
        }

        public Criteria andMd5SrcNotBetween(String value1, String value2) {
            addCriterion("md5_src not between", value1, value2, "md5Src");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
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

        public Criteria andLogintimeIsNull() {
            addCriterion("logintime is null");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNotNull() {
            addCriterion("logintime is not null");
            return (Criteria) this;
        }

        public Criteria andLogintimeEqualTo(Date value) {
            addCriterion("logintime =", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotEqualTo(Date value) {
            addCriterion("logintime <>", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThan(Date value) {
            addCriterion("logintime >", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("logintime >=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThan(Date value) {
            addCriterion("logintime <", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThanOrEqualTo(Date value) {
            addCriterion("logintime <=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeIn(List<Date> values) {
            addCriterion("logintime in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotIn(List<Date> values) {
            addCriterion("logintime not in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeBetween(Date value1, Date value2) {
            addCriterion("logintime between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotBetween(Date value1, Date value2) {
            addCriterion("logintime not between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogourlIsNull() {
            addCriterion("logourl is null");
            return (Criteria) this;
        }

        public Criteria andLogourlIsNotNull() {
            addCriterion("logourl is not null");
            return (Criteria) this;
        }

        public Criteria andLogourlEqualTo(String value) {
            addCriterion("logourl =", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlNotEqualTo(String value) {
            addCriterion("logourl <>", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlGreaterThan(String value) {
            addCriterion("logourl >", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlGreaterThanOrEqualTo(String value) {
            addCriterion("logourl >=", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlLessThan(String value) {
            addCriterion("logourl <", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlLessThanOrEqualTo(String value) {
            addCriterion("logourl <=", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlLike(String value) {
            addCriterion("logourl like", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlNotLike(String value) {
            addCriterion("logourl not like", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlIn(List<String> values) {
            addCriterion("logourl in", values, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlNotIn(List<String> values) {
            addCriterion("logourl not in", values, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlBetween(String value1, String value2) {
            addCriterion("logourl between", value1, value2, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlNotBetween(String value1, String value2) {
            addCriterion("logourl not between", value1, value2, "logourl");
            return (Criteria) this;
        }

        public Criteria andNickIsNull() {
            addCriterion("nick is null");
            return (Criteria) this;
        }

        public Criteria andNickIsNotNull() {
            addCriterion("nick is not null");
            return (Criteria) this;
        }

        public Criteria andNickEqualTo(String value) {
            addCriterion("nick =", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotEqualTo(String value) {
            addCriterion("nick <>", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickGreaterThan(String value) {
            addCriterion("nick >", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickGreaterThanOrEqualTo(String value) {
            addCriterion("nick >=", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLessThan(String value) {
            addCriterion("nick <", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLessThanOrEqualTo(String value) {
            addCriterion("nick <=", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLike(String value) {
            addCriterion("nick like", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotLike(String value) {
            addCriterion("nick not like", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickIn(List<String> values) {
            addCriterion("nick in", values, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotIn(List<String> values) {
            addCriterion("nick not in", values, "nick");
            return (Criteria) this;
        }

        public Criteria andNickBetween(String value1, String value2) {
            addCriterion("nick between", value1, value2, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotBetween(String value1, String value2) {
            addCriterion("nick not between", value1, value2, "nick");
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