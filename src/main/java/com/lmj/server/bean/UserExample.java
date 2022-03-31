package com.lmj.server.bean;

import java.math.BigDecimal;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPassIsNull() {
            addCriterion("pass is null");
            return (Criteria) this;
        }

        public Criteria andPassIsNotNull() {
            addCriterion("pass is not null");
            return (Criteria) this;
        }

        public Criteria andPassEqualTo(String value) {
            addCriterion("pass =", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotEqualTo(String value) {
            addCriterion("pass <>", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThan(String value) {
            addCriterion("pass >", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThanOrEqualTo(String value) {
            addCriterion("pass >=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThan(String value) {
            addCriterion("pass <", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThanOrEqualTo(String value) {
            addCriterion("pass <=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLike(String value) {
            addCriterion("pass like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotLike(String value) {
            addCriterion("pass not like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassIn(List<String> values) {
            addCriterion("pass in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotIn(List<String> values) {
            addCriterion("pass not in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassBetween(String value1, String value2) {
            addCriterion("pass between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotBetween(String value1, String value2) {
            addCriterion("pass not between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNull() {
            addCriterion("passwd is null");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNotNull() {
            addCriterion("passwd is not null");
            return (Criteria) this;
        }

        public Criteria andPasswdEqualTo(String value) {
            addCriterion("passwd =", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotEqualTo(String value) {
            addCriterion("passwd <>", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThan(String value) {
            addCriterion("passwd >", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("passwd >=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThan(String value) {
            addCriterion("passwd <", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThanOrEqualTo(String value) {
            addCriterion("passwd <=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLike(String value) {
            addCriterion("passwd like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotLike(String value) {
            addCriterion("passwd not like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdIn(List<String> values) {
            addCriterion("passwd in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotIn(List<String> values) {
            addCriterion("passwd not in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdBetween(String value1, String value2) {
            addCriterion("passwd between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotBetween(String value1, String value2) {
            addCriterion("passwd not between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andTIsNull() {
            addCriterion("t is null");
            return (Criteria) this;
        }

        public Criteria andTIsNotNull() {
            addCriterion("t is not null");
            return (Criteria) this;
        }

        public Criteria andTEqualTo(Integer value) {
            addCriterion("t =", value, "t");
            return (Criteria) this;
        }

        public Criteria andTNotEqualTo(Integer value) {
            addCriterion("t <>", value, "t");
            return (Criteria) this;
        }

        public Criteria andTGreaterThan(Integer value) {
            addCriterion("t >", value, "t");
            return (Criteria) this;
        }

        public Criteria andTGreaterThanOrEqualTo(Integer value) {
            addCriterion("t >=", value, "t");
            return (Criteria) this;
        }

        public Criteria andTLessThan(Integer value) {
            addCriterion("t <", value, "t");
            return (Criteria) this;
        }

        public Criteria andTLessThanOrEqualTo(Integer value) {
            addCriterion("t <=", value, "t");
            return (Criteria) this;
        }

        public Criteria andTIn(List<Integer> values) {
            addCriterion("t in", values, "t");
            return (Criteria) this;
        }

        public Criteria andTNotIn(List<Integer> values) {
            addCriterion("t not in", values, "t");
            return (Criteria) this;
        }

        public Criteria andTBetween(Integer value1, Integer value2) {
            addCriterion("t between", value1, value2, "t");
            return (Criteria) this;
        }

        public Criteria andTNotBetween(Integer value1, Integer value2) {
            addCriterion("t not between", value1, value2, "t");
            return (Criteria) this;
        }

        public Criteria andUIsNull() {
            addCriterion("u is null");
            return (Criteria) this;
        }

        public Criteria andUIsNotNull() {
            addCriterion("u is not null");
            return (Criteria) this;
        }

        public Criteria andUEqualTo(Long value) {
            addCriterion("u =", value, "u");
            return (Criteria) this;
        }

        public Criteria andUNotEqualTo(Long value) {
            addCriterion("u <>", value, "u");
            return (Criteria) this;
        }

        public Criteria andUGreaterThan(Long value) {
            addCriterion("u >", value, "u");
            return (Criteria) this;
        }

        public Criteria andUGreaterThanOrEqualTo(Long value) {
            addCriterion("u >=", value, "u");
            return (Criteria) this;
        }

        public Criteria andULessThan(Long value) {
            addCriterion("u <", value, "u");
            return (Criteria) this;
        }

        public Criteria andULessThanOrEqualTo(Long value) {
            addCriterion("u <=", value, "u");
            return (Criteria) this;
        }

        public Criteria andUIn(List<Long> values) {
            addCriterion("u in", values, "u");
            return (Criteria) this;
        }

        public Criteria andUNotIn(List<Long> values) {
            addCriterion("u not in", values, "u");
            return (Criteria) this;
        }

        public Criteria andUBetween(Long value1, Long value2) {
            addCriterion("u between", value1, value2, "u");
            return (Criteria) this;
        }

        public Criteria andUNotBetween(Long value1, Long value2) {
            addCriterion("u not between", value1, value2, "u");
            return (Criteria) this;
        }

        public Criteria andDIsNull() {
            addCriterion("d is null");
            return (Criteria) this;
        }

        public Criteria andDIsNotNull() {
            addCriterion("d is not null");
            return (Criteria) this;
        }

        public Criteria andDEqualTo(Long value) {
            addCriterion("d =", value, "d");
            return (Criteria) this;
        }

        public Criteria andDNotEqualTo(Long value) {
            addCriterion("d <>", value, "d");
            return (Criteria) this;
        }

        public Criteria andDGreaterThan(Long value) {
            addCriterion("d >", value, "d");
            return (Criteria) this;
        }

        public Criteria andDGreaterThanOrEqualTo(Long value) {
            addCriterion("d >=", value, "d");
            return (Criteria) this;
        }

        public Criteria andDLessThan(Long value) {
            addCriterion("d <", value, "d");
            return (Criteria) this;
        }

        public Criteria andDLessThanOrEqualTo(Long value) {
            addCriterion("d <=", value, "d");
            return (Criteria) this;
        }

        public Criteria andDIn(List<Long> values) {
            addCriterion("d in", values, "d");
            return (Criteria) this;
        }

        public Criteria andDNotIn(List<Long> values) {
            addCriterion("d not in", values, "d");
            return (Criteria) this;
        }

        public Criteria andDBetween(Long value1, Long value2) {
            addCriterion("d between", value1, value2, "d");
            return (Criteria) this;
        }

        public Criteria andDNotBetween(Long value1, Long value2) {
            addCriterion("d not between", value1, value2, "d");
            return (Criteria) this;
        }

        public Criteria andPlanIsNull() {
            addCriterion("plan is null");
            return (Criteria) this;
        }

        public Criteria andPlanIsNotNull() {
            addCriterion("plan is not null");
            return (Criteria) this;
        }

        public Criteria andPlanEqualTo(String value) {
            addCriterion("plan =", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanNotEqualTo(String value) {
            addCriterion("plan <>", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanGreaterThan(String value) {
            addCriterion("plan >", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanGreaterThanOrEqualTo(String value) {
            addCriterion("plan >=", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanLessThan(String value) {
            addCriterion("plan <", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanLessThanOrEqualTo(String value) {
            addCriterion("plan <=", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanLike(String value) {
            addCriterion("plan like", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanNotLike(String value) {
            addCriterion("plan not like", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanIn(List<String> values) {
            addCriterion("plan in", values, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanNotIn(List<String> values) {
            addCriterion("plan not in", values, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanBetween(String value1, String value2) {
            addCriterion("plan between", value1, value2, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanNotBetween(String value1, String value2) {
            addCriterion("plan not between", value1, value2, "plan");
            return (Criteria) this;
        }

        public Criteria andTransferEnableIsNull() {
            addCriterion("transfer_enable is null");
            return (Criteria) this;
        }

        public Criteria andTransferEnableIsNotNull() {
            addCriterion("transfer_enable is not null");
            return (Criteria) this;
        }

        public Criteria andTransferEnableEqualTo(Long value) {
            addCriterion("transfer_enable =", value, "transferEnable");
            return (Criteria) this;
        }

        public Criteria andTransferEnableNotEqualTo(Long value) {
            addCriterion("transfer_enable <>", value, "transferEnable");
            return (Criteria) this;
        }

        public Criteria andTransferEnableGreaterThan(Long value) {
            addCriterion("transfer_enable >", value, "transferEnable");
            return (Criteria) this;
        }

        public Criteria andTransferEnableGreaterThanOrEqualTo(Long value) {
            addCriterion("transfer_enable >=", value, "transferEnable");
            return (Criteria) this;
        }

        public Criteria andTransferEnableLessThan(Long value) {
            addCriterion("transfer_enable <", value, "transferEnable");
            return (Criteria) this;
        }

        public Criteria andTransferEnableLessThanOrEqualTo(Long value) {
            addCriterion("transfer_enable <=", value, "transferEnable");
            return (Criteria) this;
        }

        public Criteria andTransferEnableIn(List<Long> values) {
            addCriterion("transfer_enable in", values, "transferEnable");
            return (Criteria) this;
        }

        public Criteria andTransferEnableNotIn(List<Long> values) {
            addCriterion("transfer_enable not in", values, "transferEnable");
            return (Criteria) this;
        }

        public Criteria andTransferEnableBetween(Long value1, Long value2) {
            addCriterion("transfer_enable between", value1, value2, "transferEnable");
            return (Criteria) this;
        }

        public Criteria andTransferEnableNotBetween(Long value1, Long value2) {
            addCriterion("transfer_enable not between", value1, value2, "transferEnable");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(Integer value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(Integer value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(Integer value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(Integer value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(Integer value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<Integer> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<Integer> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(Integer value1, Integer value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(Integer value1, Integer value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andSwitchIsNull() {
            addCriterion("switch is null");
            return (Criteria) this;
        }

        public Criteria andSwitchIsNotNull() {
            addCriterion("switch is not null");
            return (Criteria) this;
        }

        public Criteria andSwitchEqualTo(Byte value) {
            addCriterion("switch =", value, "switch");
            return (Criteria) this;
        }

        public Criteria andSwitchNotEqualTo(Byte value) {
            addCriterion("switch <>", value, "switch");
            return (Criteria) this;
        }

        public Criteria andSwitchGreaterThan(Byte value) {
            addCriterion("switch >", value, "switch");
            return (Criteria) this;
        }

        public Criteria andSwitchGreaterThanOrEqualTo(Byte value) {
            addCriterion("switch >=", value, "switch");
            return (Criteria) this;
        }

        public Criteria andSwitchLessThan(Byte value) {
            addCriterion("switch <", value, "switch");
            return (Criteria) this;
        }

        public Criteria andSwitchLessThanOrEqualTo(Byte value) {
            addCriterion("switch <=", value, "switch");
            return (Criteria) this;
        }

        public Criteria andSwitchIn(List<Byte> values) {
            addCriterion("switch in", values, "switch");
            return (Criteria) this;
        }

        public Criteria andSwitchNotIn(List<Byte> values) {
            addCriterion("switch not in", values, "switch");
            return (Criteria) this;
        }

        public Criteria andSwitchBetween(Byte value1, Byte value2) {
            addCriterion("switch between", value1, value2, "switch");
            return (Criteria) this;
        }

        public Criteria andSwitchNotBetween(Byte value1, Byte value2) {
            addCriterion("switch not between", value1, value2, "switch");
            return (Criteria) this;
        }

        public Criteria andEnableIsNull() {
            addCriterion("enable is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("enable is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(Byte value) {
            addCriterion("enable =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(Byte value) {
            addCriterion("enable <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(Byte value) {
            addCriterion("enable >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(Byte value) {
            addCriterion("enable >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(Byte value) {
            addCriterion("enable <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(Byte value) {
            addCriterion("enable <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<Byte> values) {
            addCriterion("enable in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<Byte> values) {
            addCriterion("enable not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(Byte value1, Byte value2) {
            addCriterion("enable between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(Byte value1, Byte value2) {
            addCriterion("enable not between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andLastGetGiftTimeIsNull() {
            addCriterion("last_get_gift_time is null");
            return (Criteria) this;
        }

        public Criteria andLastGetGiftTimeIsNotNull() {
            addCriterion("last_get_gift_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastGetGiftTimeEqualTo(Integer value) {
            addCriterion("last_get_gift_time =", value, "lastGetGiftTime");
            return (Criteria) this;
        }

        public Criteria andLastGetGiftTimeNotEqualTo(Integer value) {
            addCriterion("last_get_gift_time <>", value, "lastGetGiftTime");
            return (Criteria) this;
        }

        public Criteria andLastGetGiftTimeGreaterThan(Integer value) {
            addCriterion("last_get_gift_time >", value, "lastGetGiftTime");
            return (Criteria) this;
        }

        public Criteria andLastGetGiftTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_get_gift_time >=", value, "lastGetGiftTime");
            return (Criteria) this;
        }

        public Criteria andLastGetGiftTimeLessThan(Integer value) {
            addCriterion("last_get_gift_time <", value, "lastGetGiftTime");
            return (Criteria) this;
        }

        public Criteria andLastGetGiftTimeLessThanOrEqualTo(Integer value) {
            addCriterion("last_get_gift_time <=", value, "lastGetGiftTime");
            return (Criteria) this;
        }

        public Criteria andLastGetGiftTimeIn(List<Integer> values) {
            addCriterion("last_get_gift_time in", values, "lastGetGiftTime");
            return (Criteria) this;
        }

        public Criteria andLastGetGiftTimeNotIn(List<Integer> values) {
            addCriterion("last_get_gift_time not in", values, "lastGetGiftTime");
            return (Criteria) this;
        }

        public Criteria andLastGetGiftTimeBetween(Integer value1, Integer value2) {
            addCriterion("last_get_gift_time between", value1, value2, "lastGetGiftTime");
            return (Criteria) this;
        }

        public Criteria andLastGetGiftTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("last_get_gift_time not between", value1, value2, "lastGetGiftTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckInTimeIsNull() {
            addCriterion("last_check_in_time is null");
            return (Criteria) this;
        }

        public Criteria andLastCheckInTimeIsNotNull() {
            addCriterion("last_check_in_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastCheckInTimeEqualTo(Integer value) {
            addCriterion("last_check_in_time =", value, "lastCheckInTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckInTimeNotEqualTo(Integer value) {
            addCriterion("last_check_in_time <>", value, "lastCheckInTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckInTimeGreaterThan(Integer value) {
            addCriterion("last_check_in_time >", value, "lastCheckInTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckInTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_check_in_time >=", value, "lastCheckInTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckInTimeLessThan(Integer value) {
            addCriterion("last_check_in_time <", value, "lastCheckInTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckInTimeLessThanOrEqualTo(Integer value) {
            addCriterion("last_check_in_time <=", value, "lastCheckInTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckInTimeIn(List<Integer> values) {
            addCriterion("last_check_in_time in", values, "lastCheckInTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckInTimeNotIn(List<Integer> values) {
            addCriterion("last_check_in_time not in", values, "lastCheckInTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckInTimeBetween(Integer value1, Integer value2) {
            addCriterion("last_check_in_time between", value1, value2, "lastCheckInTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckInTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("last_check_in_time not between", value1, value2, "lastCheckInTime");
            return (Criteria) this;
        }

        public Criteria andLastRestPassTimeIsNull() {
            addCriterion("last_rest_pass_time is null");
            return (Criteria) this;
        }

        public Criteria andLastRestPassTimeIsNotNull() {
            addCriterion("last_rest_pass_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastRestPassTimeEqualTo(Integer value) {
            addCriterion("last_rest_pass_time =", value, "lastRestPassTime");
            return (Criteria) this;
        }

        public Criteria andLastRestPassTimeNotEqualTo(Integer value) {
            addCriterion("last_rest_pass_time <>", value, "lastRestPassTime");
            return (Criteria) this;
        }

        public Criteria andLastRestPassTimeGreaterThan(Integer value) {
            addCriterion("last_rest_pass_time >", value, "lastRestPassTime");
            return (Criteria) this;
        }

        public Criteria andLastRestPassTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_rest_pass_time >=", value, "lastRestPassTime");
            return (Criteria) this;
        }

        public Criteria andLastRestPassTimeLessThan(Integer value) {
            addCriterion("last_rest_pass_time <", value, "lastRestPassTime");
            return (Criteria) this;
        }

        public Criteria andLastRestPassTimeLessThanOrEqualTo(Integer value) {
            addCriterion("last_rest_pass_time <=", value, "lastRestPassTime");
            return (Criteria) this;
        }

        public Criteria andLastRestPassTimeIn(List<Integer> values) {
            addCriterion("last_rest_pass_time in", values, "lastRestPassTime");
            return (Criteria) this;
        }

        public Criteria andLastRestPassTimeNotIn(List<Integer> values) {
            addCriterion("last_rest_pass_time not in", values, "lastRestPassTime");
            return (Criteria) this;
        }

        public Criteria andLastRestPassTimeBetween(Integer value1, Integer value2) {
            addCriterion("last_rest_pass_time between", value1, value2, "lastRestPassTime");
            return (Criteria) this;
        }

        public Criteria andLastRestPassTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("last_rest_pass_time not between", value1, value2, "lastRestPassTime");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNull() {
            addCriterion("reg_date is null");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNotNull() {
            addCriterion("reg_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegDateEqualTo(Date value) {
            addCriterion("reg_date =", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotEqualTo(Date value) {
            addCriterion("reg_date <>", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThan(Date value) {
            addCriterion("reg_date >", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThanOrEqualTo(Date value) {
            addCriterion("reg_date >=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThan(Date value) {
            addCriterion("reg_date <", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThanOrEqualTo(Date value) {
            addCriterion("reg_date <=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateIn(List<Date> values) {
            addCriterion("reg_date in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotIn(List<Date> values) {
            addCriterion("reg_date not in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateBetween(Date value1, Date value2) {
            addCriterion("reg_date between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotBetween(Date value1, Date value2) {
            addCriterion("reg_date not between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andInviteNumIsNull() {
            addCriterion("invite_num is null");
            return (Criteria) this;
        }

        public Criteria andInviteNumIsNotNull() {
            addCriterion("invite_num is not null");
            return (Criteria) this;
        }

        public Criteria andInviteNumEqualTo(Integer value) {
            addCriterion("invite_num =", value, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumNotEqualTo(Integer value) {
            addCriterion("invite_num <>", value, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumGreaterThan(Integer value) {
            addCriterion("invite_num >", value, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("invite_num >=", value, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumLessThan(Integer value) {
            addCriterion("invite_num <", value, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumLessThanOrEqualTo(Integer value) {
            addCriterion("invite_num <=", value, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumIn(List<Integer> values) {
            addCriterion("invite_num in", values, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumNotIn(List<Integer> values) {
            addCriterion("invite_num not in", values, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumBetween(Integer value1, Integer value2) {
            addCriterion("invite_num between", value1, value2, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumNotBetween(Integer value1, Integer value2) {
            addCriterion("invite_num not between", value1, value2, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andRefByIsNull() {
            addCriterion("ref_by is null");
            return (Criteria) this;
        }

        public Criteria andRefByIsNotNull() {
            addCriterion("ref_by is not null");
            return (Criteria) this;
        }

        public Criteria andRefByEqualTo(Integer value) {
            addCriterion("ref_by =", value, "refBy");
            return (Criteria) this;
        }

        public Criteria andRefByNotEqualTo(Integer value) {
            addCriterion("ref_by <>", value, "refBy");
            return (Criteria) this;
        }

        public Criteria andRefByGreaterThan(Integer value) {
            addCriterion("ref_by >", value, "refBy");
            return (Criteria) this;
        }

        public Criteria andRefByGreaterThanOrEqualTo(Integer value) {
            addCriterion("ref_by >=", value, "refBy");
            return (Criteria) this;
        }

        public Criteria andRefByLessThan(Integer value) {
            addCriterion("ref_by <", value, "refBy");
            return (Criteria) this;
        }

        public Criteria andRefByLessThanOrEqualTo(Integer value) {
            addCriterion("ref_by <=", value, "refBy");
            return (Criteria) this;
        }

        public Criteria andRefByIn(List<Integer> values) {
            addCriterion("ref_by in", values, "refBy");
            return (Criteria) this;
        }

        public Criteria andRefByNotIn(List<Integer> values) {
            addCriterion("ref_by not in", values, "refBy");
            return (Criteria) this;
        }

        public Criteria andRefByBetween(Integer value1, Integer value2) {
            addCriterion("ref_by between", value1, value2, "refBy");
            return (Criteria) this;
        }

        public Criteria andRefByNotBetween(Integer value1, Integer value2) {
            addCriterion("ref_by not between", value1, value2, "refBy");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNull() {
            addCriterion("expire_time is null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNotNull() {
            addCriterion("expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualTo(Integer value) {
            addCriterion("expire_time =", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualTo(Integer value) {
            addCriterion("expire_time <>", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThan(Integer value) {
            addCriterion("expire_time >", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("expire_time >=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThan(Integer value) {
            addCriterion("expire_time <", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualTo(Integer value) {
            addCriterion("expire_time <=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIn(List<Integer> values) {
            addCriterion("expire_time in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotIn(List<Integer> values) {
            addCriterion("expire_time not in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeBetween(Integer value1, Integer value2) {
            addCriterion("expire_time between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("expire_time not between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andMethodIsNull() {
            addCriterion("method is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("method is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(String value) {
            addCriterion("method =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(String value) {
            addCriterion("method <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(String value) {
            addCriterion("method >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(String value) {
            addCriterion("method >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(String value) {
            addCriterion("method <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(String value) {
            addCriterion("method <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLike(String value) {
            addCriterion("method like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotLike(String value) {
            addCriterion("method not like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<String> values) {
            addCriterion("method in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<String> values) {
            addCriterion("method not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(String value1, String value2) {
            addCriterion("method between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(String value1, String value2) {
            addCriterion("method not between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifyIsNull() {
            addCriterion("is_email_verify is null");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifyIsNotNull() {
            addCriterion("is_email_verify is not null");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifyEqualTo(Byte value) {
            addCriterion("is_email_verify =", value, "isEmailVerify");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifyNotEqualTo(Byte value) {
            addCriterion("is_email_verify <>", value, "isEmailVerify");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifyGreaterThan(Byte value) {
            addCriterion("is_email_verify >", value, "isEmailVerify");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifyGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_email_verify >=", value, "isEmailVerify");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifyLessThan(Byte value) {
            addCriterion("is_email_verify <", value, "isEmailVerify");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifyLessThanOrEqualTo(Byte value) {
            addCriterion("is_email_verify <=", value, "isEmailVerify");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifyIn(List<Byte> values) {
            addCriterion("is_email_verify in", values, "isEmailVerify");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifyNotIn(List<Byte> values) {
            addCriterion("is_email_verify not in", values, "isEmailVerify");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifyBetween(Byte value1, Byte value2) {
            addCriterion("is_email_verify between", value1, value2, "isEmailVerify");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifyNotBetween(Byte value1, Byte value2) {
            addCriterion("is_email_verify not between", value1, value2, "isEmailVerify");
            return (Criteria) this;
        }

        public Criteria andRegIpIsNull() {
            addCriterion("reg_ip is null");
            return (Criteria) this;
        }

        public Criteria andRegIpIsNotNull() {
            addCriterion("reg_ip is not null");
            return (Criteria) this;
        }

        public Criteria andRegIpEqualTo(String value) {
            addCriterion("reg_ip =", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotEqualTo(String value) {
            addCriterion("reg_ip <>", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpGreaterThan(String value) {
            addCriterion("reg_ip >", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpGreaterThanOrEqualTo(String value) {
            addCriterion("reg_ip >=", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLessThan(String value) {
            addCriterion("reg_ip <", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLessThanOrEqualTo(String value) {
            addCriterion("reg_ip <=", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLike(String value) {
            addCriterion("reg_ip like", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotLike(String value) {
            addCriterion("reg_ip not like", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpIn(List<String> values) {
            addCriterion("reg_ip in", values, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotIn(List<String> values) {
            addCriterion("reg_ip not in", values, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpBetween(String value1, String value2) {
            addCriterion("reg_ip between", value1, value2, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotBetween(String value1, String value2) {
            addCriterion("reg_ip not between", value1, value2, "regIp");
            return (Criteria) this;
        }

        public Criteria andNodeSpeedlimitIsNull() {
            addCriterion("node_speedlimit is null");
            return (Criteria) this;
        }

        public Criteria andNodeSpeedlimitIsNotNull() {
            addCriterion("node_speedlimit is not null");
            return (Criteria) this;
        }

        public Criteria andNodeSpeedlimitEqualTo(BigDecimal value) {
            addCriterion("node_speedlimit =", value, "nodeSpeedlimit");
            return (Criteria) this;
        }

        public Criteria andNodeSpeedlimitNotEqualTo(BigDecimal value) {
            addCriterion("node_speedlimit <>", value, "nodeSpeedlimit");
            return (Criteria) this;
        }

        public Criteria andNodeSpeedlimitGreaterThan(BigDecimal value) {
            addCriterion("node_speedlimit >", value, "nodeSpeedlimit");
            return (Criteria) this;
        }

        public Criteria andNodeSpeedlimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("node_speedlimit >=", value, "nodeSpeedlimit");
            return (Criteria) this;
        }

        public Criteria andNodeSpeedlimitLessThan(BigDecimal value) {
            addCriterion("node_speedlimit <", value, "nodeSpeedlimit");
            return (Criteria) this;
        }

        public Criteria andNodeSpeedlimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("node_speedlimit <=", value, "nodeSpeedlimit");
            return (Criteria) this;
        }

        public Criteria andNodeSpeedlimitIn(List<BigDecimal> values) {
            addCriterion("node_speedlimit in", values, "nodeSpeedlimit");
            return (Criteria) this;
        }

        public Criteria andNodeSpeedlimitNotIn(List<BigDecimal> values) {
            addCriterion("node_speedlimit not in", values, "nodeSpeedlimit");
            return (Criteria) this;
        }

        public Criteria andNodeSpeedlimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("node_speedlimit between", value1, value2, "nodeSpeedlimit");
            return (Criteria) this;
        }

        public Criteria andNodeSpeedlimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("node_speedlimit not between", value1, value2, "nodeSpeedlimit");
            return (Criteria) this;
        }

        public Criteria andNodeConnectorIsNull() {
            addCriterion("node_connector is null");
            return (Criteria) this;
        }

        public Criteria andNodeConnectorIsNotNull() {
            addCriterion("node_connector is not null");
            return (Criteria) this;
        }

        public Criteria andNodeConnectorEqualTo(Integer value) {
            addCriterion("node_connector =", value, "nodeConnector");
            return (Criteria) this;
        }

        public Criteria andNodeConnectorNotEqualTo(Integer value) {
            addCriterion("node_connector <>", value, "nodeConnector");
            return (Criteria) this;
        }

        public Criteria andNodeConnectorGreaterThan(Integer value) {
            addCriterion("node_connector >", value, "nodeConnector");
            return (Criteria) this;
        }

        public Criteria andNodeConnectorGreaterThanOrEqualTo(Integer value) {
            addCriterion("node_connector >=", value, "nodeConnector");
            return (Criteria) this;
        }

        public Criteria andNodeConnectorLessThan(Integer value) {
            addCriterion("node_connector <", value, "nodeConnector");
            return (Criteria) this;
        }

        public Criteria andNodeConnectorLessThanOrEqualTo(Integer value) {
            addCriterion("node_connector <=", value, "nodeConnector");
            return (Criteria) this;
        }

        public Criteria andNodeConnectorIn(List<Integer> values) {
            addCriterion("node_connector in", values, "nodeConnector");
            return (Criteria) this;
        }

        public Criteria andNodeConnectorNotIn(List<Integer> values) {
            addCriterion("node_connector not in", values, "nodeConnector");
            return (Criteria) this;
        }

        public Criteria andNodeConnectorBetween(Integer value1, Integer value2) {
            addCriterion("node_connector between", value1, value2, "nodeConnector");
            return (Criteria) this;
        }

        public Criteria andNodeConnectorNotBetween(Integer value1, Integer value2) {
            addCriterion("node_connector not between", value1, value2, "nodeConnector");
            return (Criteria) this;
        }

        public Criteria andIsAdminIsNull() {
            addCriterion("is_admin is null");
            return (Criteria) this;
        }

        public Criteria andIsAdminIsNotNull() {
            addCriterion("is_admin is not null");
            return (Criteria) this;
        }

        public Criteria andIsAdminEqualTo(Integer value) {
            addCriterion("is_admin =", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotEqualTo(Integer value) {
            addCriterion("is_admin <>", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminGreaterThan(Integer value) {
            addCriterion("is_admin >", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_admin >=", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLessThan(Integer value) {
            addCriterion("is_admin <", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLessThanOrEqualTo(Integer value) {
            addCriterion("is_admin <=", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminIn(List<Integer> values) {
            addCriterion("is_admin in", values, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotIn(List<Integer> values) {
            addCriterion("is_admin not in", values, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminBetween(Integer value1, Integer value2) {
            addCriterion("is_admin between", value1, value2, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotBetween(Integer value1, Integer value2) {
            addCriterion("is_admin not between", value1, value2, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andImTypeIsNull() {
            addCriterion("im_type is null");
            return (Criteria) this;
        }

        public Criteria andImTypeIsNotNull() {
            addCriterion("im_type is not null");
            return (Criteria) this;
        }

        public Criteria andImTypeEqualTo(Integer value) {
            addCriterion("im_type =", value, "imType");
            return (Criteria) this;
        }

        public Criteria andImTypeNotEqualTo(Integer value) {
            addCriterion("im_type <>", value, "imType");
            return (Criteria) this;
        }

        public Criteria andImTypeGreaterThan(Integer value) {
            addCriterion("im_type >", value, "imType");
            return (Criteria) this;
        }

        public Criteria andImTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("im_type >=", value, "imType");
            return (Criteria) this;
        }

        public Criteria andImTypeLessThan(Integer value) {
            addCriterion("im_type <", value, "imType");
            return (Criteria) this;
        }

        public Criteria andImTypeLessThanOrEqualTo(Integer value) {
            addCriterion("im_type <=", value, "imType");
            return (Criteria) this;
        }

        public Criteria andImTypeIn(List<Integer> values) {
            addCriterion("im_type in", values, "imType");
            return (Criteria) this;
        }

        public Criteria andImTypeNotIn(List<Integer> values) {
            addCriterion("im_type not in", values, "imType");
            return (Criteria) this;
        }

        public Criteria andImTypeBetween(Integer value1, Integer value2) {
            addCriterion("im_type between", value1, value2, "imType");
            return (Criteria) this;
        }

        public Criteria andImTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("im_type not between", value1, value2, "imType");
            return (Criteria) this;
        }

        public Criteria andLastDayTIsNull() {
            addCriterion("last_day_t is null");
            return (Criteria) this;
        }

        public Criteria andLastDayTIsNotNull() {
            addCriterion("last_day_t is not null");
            return (Criteria) this;
        }

        public Criteria andLastDayTEqualTo(Long value) {
            addCriterion("last_day_t =", value, "lastDayT");
            return (Criteria) this;
        }

        public Criteria andLastDayTNotEqualTo(Long value) {
            addCriterion("last_day_t <>", value, "lastDayT");
            return (Criteria) this;
        }

        public Criteria andLastDayTGreaterThan(Long value) {
            addCriterion("last_day_t >", value, "lastDayT");
            return (Criteria) this;
        }

        public Criteria andLastDayTGreaterThanOrEqualTo(Long value) {
            addCriterion("last_day_t >=", value, "lastDayT");
            return (Criteria) this;
        }

        public Criteria andLastDayTLessThan(Long value) {
            addCriterion("last_day_t <", value, "lastDayT");
            return (Criteria) this;
        }

        public Criteria andLastDayTLessThanOrEqualTo(Long value) {
            addCriterion("last_day_t <=", value, "lastDayT");
            return (Criteria) this;
        }

        public Criteria andLastDayTIn(List<Long> values) {
            addCriterion("last_day_t in", values, "lastDayT");
            return (Criteria) this;
        }

        public Criteria andLastDayTNotIn(List<Long> values) {
            addCriterion("last_day_t not in", values, "lastDayT");
            return (Criteria) this;
        }

        public Criteria andLastDayTBetween(Long value1, Long value2) {
            addCriterion("last_day_t between", value1, value2, "lastDayT");
            return (Criteria) this;
        }

        public Criteria andLastDayTNotBetween(Long value1, Long value2) {
            addCriterion("last_day_t not between", value1, value2, "lastDayT");
            return (Criteria) this;
        }

        public Criteria andSenddailymailIsNull() {
            addCriterion("sendDailyMail is null");
            return (Criteria) this;
        }

        public Criteria andSenddailymailIsNotNull() {
            addCriterion("sendDailyMail is not null");
            return (Criteria) this;
        }

        public Criteria andSenddailymailEqualTo(Integer value) {
            addCriterion("sendDailyMail =", value, "senddailymail");
            return (Criteria) this;
        }

        public Criteria andSenddailymailNotEqualTo(Integer value) {
            addCriterion("sendDailyMail <>", value, "senddailymail");
            return (Criteria) this;
        }

        public Criteria andSenddailymailGreaterThan(Integer value) {
            addCriterion("sendDailyMail >", value, "senddailymail");
            return (Criteria) this;
        }

        public Criteria andSenddailymailGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendDailyMail >=", value, "senddailymail");
            return (Criteria) this;
        }

        public Criteria andSenddailymailLessThan(Integer value) {
            addCriterion("sendDailyMail <", value, "senddailymail");
            return (Criteria) this;
        }

        public Criteria andSenddailymailLessThanOrEqualTo(Integer value) {
            addCriterion("sendDailyMail <=", value, "senddailymail");
            return (Criteria) this;
        }

        public Criteria andSenddailymailIn(List<Integer> values) {
            addCriterion("sendDailyMail in", values, "senddailymail");
            return (Criteria) this;
        }

        public Criteria andSenddailymailNotIn(List<Integer> values) {
            addCriterion("sendDailyMail not in", values, "senddailymail");
            return (Criteria) this;
        }

        public Criteria andSenddailymailBetween(Integer value1, Integer value2) {
            addCriterion("sendDailyMail between", value1, value2, "senddailymail");
            return (Criteria) this;
        }

        public Criteria andSenddailymailNotBetween(Integer value1, Integer value2) {
            addCriterion("sendDailyMail not between", value1, value2, "senddailymail");
            return (Criteria) this;
        }

        public Criteria andClassIsNull() {
            addCriterion("class is null");
            return (Criteria) this;
        }

        public Criteria andClassIsNotNull() {
            addCriterion("class is not null");
            return (Criteria) this;
        }

        public Criteria andClassEqualTo(Integer value) {
            addCriterion("class =", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassNotEqualTo(Integer value) {
            addCriterion("class <>", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassGreaterThan(Integer value) {
            addCriterion("class >", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("class >=", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassLessThan(Integer value) {
            addCriterion("class <", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassLessThanOrEqualTo(Integer value) {
            addCriterion("class <=", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassIn(List<Integer> values) {
            addCriterion("class in", values, "class");
            return (Criteria) this;
        }

        public Criteria andClassNotIn(List<Integer> values) {
            addCriterion("class not in", values, "class");
            return (Criteria) this;
        }

        public Criteria andClassBetween(Integer value1, Integer value2) {
            addCriterion("class between", value1, value2, "class");
            return (Criteria) this;
        }

        public Criteria andClassNotBetween(Integer value1, Integer value2) {
            addCriterion("class not between", value1, value2, "class");
            return (Criteria) this;
        }

        public Criteria andClassExpireIsNull() {
            addCriterion("class_expire is null");
            return (Criteria) this;
        }

        public Criteria andClassExpireIsNotNull() {
            addCriterion("class_expire is not null");
            return (Criteria) this;
        }

        public Criteria andClassExpireEqualTo(Date value) {
            addCriterion("class_expire =", value, "classExpire");
            return (Criteria) this;
        }

        public Criteria andClassExpireNotEqualTo(Date value) {
            addCriterion("class_expire <>", value, "classExpire");
            return (Criteria) this;
        }

        public Criteria andClassExpireGreaterThan(Date value) {
            addCriterion("class_expire >", value, "classExpire");
            return (Criteria) this;
        }

        public Criteria andClassExpireGreaterThanOrEqualTo(Date value) {
            addCriterion("class_expire >=", value, "classExpire");
            return (Criteria) this;
        }

        public Criteria andClassExpireLessThan(Date value) {
            addCriterion("class_expire <", value, "classExpire");
            return (Criteria) this;
        }

        public Criteria andClassExpireLessThanOrEqualTo(Date value) {
            addCriterion("class_expire <=", value, "classExpire");
            return (Criteria) this;
        }

        public Criteria andClassExpireIn(List<Date> values) {
            addCriterion("class_expire in", values, "classExpire");
            return (Criteria) this;
        }

        public Criteria andClassExpireNotIn(List<Date> values) {
            addCriterion("class_expire not in", values, "classExpire");
            return (Criteria) this;
        }

        public Criteria andClassExpireBetween(Date value1, Date value2) {
            addCriterion("class_expire between", value1, value2, "classExpire");
            return (Criteria) this;
        }

        public Criteria andClassExpireNotBetween(Date value1, Date value2) {
            addCriterion("class_expire not between", value1, value2, "classExpire");
            return (Criteria) this;
        }

        public Criteria andExpireInIsNull() {
            addCriterion("expire_in is null");
            return (Criteria) this;
        }

        public Criteria andExpireInIsNotNull() {
            addCriterion("expire_in is not null");
            return (Criteria) this;
        }

        public Criteria andExpireInEqualTo(Date value) {
            addCriterion("expire_in =", value, "expireIn");
            return (Criteria) this;
        }

        public Criteria andExpireInNotEqualTo(Date value) {
            addCriterion("expire_in <>", value, "expireIn");
            return (Criteria) this;
        }

        public Criteria andExpireInGreaterThan(Date value) {
            addCriterion("expire_in >", value, "expireIn");
            return (Criteria) this;
        }

        public Criteria andExpireInGreaterThanOrEqualTo(Date value) {
            addCriterion("expire_in >=", value, "expireIn");
            return (Criteria) this;
        }

        public Criteria andExpireInLessThan(Date value) {
            addCriterion("expire_in <", value, "expireIn");
            return (Criteria) this;
        }

        public Criteria andExpireInLessThanOrEqualTo(Date value) {
            addCriterion("expire_in <=", value, "expireIn");
            return (Criteria) this;
        }

        public Criteria andExpireInIn(List<Date> values) {
            addCriterion("expire_in in", values, "expireIn");
            return (Criteria) this;
        }

        public Criteria andExpireInNotIn(List<Date> values) {
            addCriterion("expire_in not in", values, "expireIn");
            return (Criteria) this;
        }

        public Criteria andExpireInBetween(Date value1, Date value2) {
            addCriterion("expire_in between", value1, value2, "expireIn");
            return (Criteria) this;
        }

        public Criteria andExpireInNotBetween(Date value1, Date value2) {
            addCriterion("expire_in not between", value1, value2, "expireIn");
            return (Criteria) this;
        }

        public Criteria andGaEnableIsNull() {
            addCriterion("ga_enable is null");
            return (Criteria) this;
        }

        public Criteria andGaEnableIsNotNull() {
            addCriterion("ga_enable is not null");
            return (Criteria) this;
        }

        public Criteria andGaEnableEqualTo(Integer value) {
            addCriterion("ga_enable =", value, "gaEnable");
            return (Criteria) this;
        }

        public Criteria andGaEnableNotEqualTo(Integer value) {
            addCriterion("ga_enable <>", value, "gaEnable");
            return (Criteria) this;
        }

        public Criteria andGaEnableGreaterThan(Integer value) {
            addCriterion("ga_enable >", value, "gaEnable");
            return (Criteria) this;
        }

        public Criteria andGaEnableGreaterThanOrEqualTo(Integer value) {
            addCriterion("ga_enable >=", value, "gaEnable");
            return (Criteria) this;
        }

        public Criteria andGaEnableLessThan(Integer value) {
            addCriterion("ga_enable <", value, "gaEnable");
            return (Criteria) this;
        }

        public Criteria andGaEnableLessThanOrEqualTo(Integer value) {
            addCriterion("ga_enable <=", value, "gaEnable");
            return (Criteria) this;
        }

        public Criteria andGaEnableIn(List<Integer> values) {
            addCriterion("ga_enable in", values, "gaEnable");
            return (Criteria) this;
        }

        public Criteria andGaEnableNotIn(List<Integer> values) {
            addCriterion("ga_enable not in", values, "gaEnable");
            return (Criteria) this;
        }

        public Criteria andGaEnableBetween(Integer value1, Integer value2) {
            addCriterion("ga_enable between", value1, value2, "gaEnable");
            return (Criteria) this;
        }

        public Criteria andGaEnableNotBetween(Integer value1, Integer value2) {
            addCriterion("ga_enable not between", value1, value2, "gaEnable");
            return (Criteria) this;
        }

        public Criteria andNodeGroupIsNull() {
            addCriterion("node_group is null");
            return (Criteria) this;
        }

        public Criteria andNodeGroupIsNotNull() {
            addCriterion("node_group is not null");
            return (Criteria) this;
        }

        public Criteria andNodeGroupEqualTo(Integer value) {
            addCriterion("node_group =", value, "nodeGroup");
            return (Criteria) this;
        }

        public Criteria andNodeGroupNotEqualTo(Integer value) {
            addCriterion("node_group <>", value, "nodeGroup");
            return (Criteria) this;
        }

        public Criteria andNodeGroupGreaterThan(Integer value) {
            addCriterion("node_group >", value, "nodeGroup");
            return (Criteria) this;
        }

        public Criteria andNodeGroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("node_group >=", value, "nodeGroup");
            return (Criteria) this;
        }

        public Criteria andNodeGroupLessThan(Integer value) {
            addCriterion("node_group <", value, "nodeGroup");
            return (Criteria) this;
        }

        public Criteria andNodeGroupLessThanOrEqualTo(Integer value) {
            addCriterion("node_group <=", value, "nodeGroup");
            return (Criteria) this;
        }

        public Criteria andNodeGroupIn(List<Integer> values) {
            addCriterion("node_group in", values, "nodeGroup");
            return (Criteria) this;
        }

        public Criteria andNodeGroupNotIn(List<Integer> values) {
            addCriterion("node_group not in", values, "nodeGroup");
            return (Criteria) this;
        }

        public Criteria andNodeGroupBetween(Integer value1, Integer value2) {
            addCriterion("node_group between", value1, value2, "nodeGroup");
            return (Criteria) this;
        }

        public Criteria andNodeGroupNotBetween(Integer value1, Integer value2) {
            addCriterion("node_group not between", value1, value2, "nodeGroup");
            return (Criteria) this;
        }

        public Criteria andAutoResetDayIsNull() {
            addCriterion("auto_reset_day is null");
            return (Criteria) this;
        }

        public Criteria andAutoResetDayIsNotNull() {
            addCriterion("auto_reset_day is not null");
            return (Criteria) this;
        }

        public Criteria andAutoResetDayEqualTo(Integer value) {
            addCriterion("auto_reset_day =", value, "autoResetDay");
            return (Criteria) this;
        }

        public Criteria andAutoResetDayNotEqualTo(Integer value) {
            addCriterion("auto_reset_day <>", value, "autoResetDay");
            return (Criteria) this;
        }

        public Criteria andAutoResetDayGreaterThan(Integer value) {
            addCriterion("auto_reset_day >", value, "autoResetDay");
            return (Criteria) this;
        }

        public Criteria andAutoResetDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("auto_reset_day >=", value, "autoResetDay");
            return (Criteria) this;
        }

        public Criteria andAutoResetDayLessThan(Integer value) {
            addCriterion("auto_reset_day <", value, "autoResetDay");
            return (Criteria) this;
        }

        public Criteria andAutoResetDayLessThanOrEqualTo(Integer value) {
            addCriterion("auto_reset_day <=", value, "autoResetDay");
            return (Criteria) this;
        }

        public Criteria andAutoResetDayIn(List<Integer> values) {
            addCriterion("auto_reset_day in", values, "autoResetDay");
            return (Criteria) this;
        }

        public Criteria andAutoResetDayNotIn(List<Integer> values) {
            addCriterion("auto_reset_day not in", values, "autoResetDay");
            return (Criteria) this;
        }

        public Criteria andAutoResetDayBetween(Integer value1, Integer value2) {
            addCriterion("auto_reset_day between", value1, value2, "autoResetDay");
            return (Criteria) this;
        }

        public Criteria andAutoResetDayNotBetween(Integer value1, Integer value2) {
            addCriterion("auto_reset_day not between", value1, value2, "autoResetDay");
            return (Criteria) this;
        }

        public Criteria andAutoResetBandwidthIsNull() {
            addCriterion("auto_reset_bandwidth is null");
            return (Criteria) this;
        }

        public Criteria andAutoResetBandwidthIsNotNull() {
            addCriterion("auto_reset_bandwidth is not null");
            return (Criteria) this;
        }

        public Criteria andAutoResetBandwidthEqualTo(BigDecimal value) {
            addCriterion("auto_reset_bandwidth =", value, "autoResetBandwidth");
            return (Criteria) this;
        }

        public Criteria andAutoResetBandwidthNotEqualTo(BigDecimal value) {
            addCriterion("auto_reset_bandwidth <>", value, "autoResetBandwidth");
            return (Criteria) this;
        }

        public Criteria andAutoResetBandwidthGreaterThan(BigDecimal value) {
            addCriterion("auto_reset_bandwidth >", value, "autoResetBandwidth");
            return (Criteria) this;
        }

        public Criteria andAutoResetBandwidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("auto_reset_bandwidth >=", value, "autoResetBandwidth");
            return (Criteria) this;
        }

        public Criteria andAutoResetBandwidthLessThan(BigDecimal value) {
            addCriterion("auto_reset_bandwidth <", value, "autoResetBandwidth");
            return (Criteria) this;
        }

        public Criteria andAutoResetBandwidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("auto_reset_bandwidth <=", value, "autoResetBandwidth");
            return (Criteria) this;
        }

        public Criteria andAutoResetBandwidthIn(List<BigDecimal> values) {
            addCriterion("auto_reset_bandwidth in", values, "autoResetBandwidth");
            return (Criteria) this;
        }

        public Criteria andAutoResetBandwidthNotIn(List<BigDecimal> values) {
            addCriterion("auto_reset_bandwidth not in", values, "autoResetBandwidth");
            return (Criteria) this;
        }

        public Criteria andAutoResetBandwidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auto_reset_bandwidth between", value1, value2, "autoResetBandwidth");
            return (Criteria) this;
        }

        public Criteria andAutoResetBandwidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auto_reset_bandwidth not between", value1, value2, "autoResetBandwidth");
            return (Criteria) this;
        }

        public Criteria andProtocolIsNull() {
            addCriterion("protocol is null");
            return (Criteria) this;
        }

        public Criteria andProtocolIsNotNull() {
            addCriterion("protocol is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolEqualTo(String value) {
            addCriterion("protocol =", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotEqualTo(String value) {
            addCriterion("protocol <>", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolGreaterThan(String value) {
            addCriterion("protocol >", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolGreaterThanOrEqualTo(String value) {
            addCriterion("protocol >=", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLessThan(String value) {
            addCriterion("protocol <", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLessThanOrEqualTo(String value) {
            addCriterion("protocol <=", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLike(String value) {
            addCriterion("protocol like", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotLike(String value) {
            addCriterion("protocol not like", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolIn(List<String> values) {
            addCriterion("protocol in", values, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotIn(List<String> values) {
            addCriterion("protocol not in", values, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolBetween(String value1, String value2) {
            addCriterion("protocol between", value1, value2, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotBetween(String value1, String value2) {
            addCriterion("protocol not between", value1, value2, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolParamIsNull() {
            addCriterion("protocol_param is null");
            return (Criteria) this;
        }

        public Criteria andProtocolParamIsNotNull() {
            addCriterion("protocol_param is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolParamEqualTo(String value) {
            addCriterion("protocol_param =", value, "protocolParam");
            return (Criteria) this;
        }

        public Criteria andProtocolParamNotEqualTo(String value) {
            addCriterion("protocol_param <>", value, "protocolParam");
            return (Criteria) this;
        }

        public Criteria andProtocolParamGreaterThan(String value) {
            addCriterion("protocol_param >", value, "protocolParam");
            return (Criteria) this;
        }

        public Criteria andProtocolParamGreaterThanOrEqualTo(String value) {
            addCriterion("protocol_param >=", value, "protocolParam");
            return (Criteria) this;
        }

        public Criteria andProtocolParamLessThan(String value) {
            addCriterion("protocol_param <", value, "protocolParam");
            return (Criteria) this;
        }

        public Criteria andProtocolParamLessThanOrEqualTo(String value) {
            addCriterion("protocol_param <=", value, "protocolParam");
            return (Criteria) this;
        }

        public Criteria andProtocolParamLike(String value) {
            addCriterion("protocol_param like", value, "protocolParam");
            return (Criteria) this;
        }

        public Criteria andProtocolParamNotLike(String value) {
            addCriterion("protocol_param not like", value, "protocolParam");
            return (Criteria) this;
        }

        public Criteria andProtocolParamIn(List<String> values) {
            addCriterion("protocol_param in", values, "protocolParam");
            return (Criteria) this;
        }

        public Criteria andProtocolParamNotIn(List<String> values) {
            addCriterion("protocol_param not in", values, "protocolParam");
            return (Criteria) this;
        }

        public Criteria andProtocolParamBetween(String value1, String value2) {
            addCriterion("protocol_param between", value1, value2, "protocolParam");
            return (Criteria) this;
        }

        public Criteria andProtocolParamNotBetween(String value1, String value2) {
            addCriterion("protocol_param not between", value1, value2, "protocolParam");
            return (Criteria) this;
        }

        public Criteria andObfsIsNull() {
            addCriterion("obfs is null");
            return (Criteria) this;
        }

        public Criteria andObfsIsNotNull() {
            addCriterion("obfs is not null");
            return (Criteria) this;
        }

        public Criteria andObfsEqualTo(String value) {
            addCriterion("obfs =", value, "obfs");
            return (Criteria) this;
        }

        public Criteria andObfsNotEqualTo(String value) {
            addCriterion("obfs <>", value, "obfs");
            return (Criteria) this;
        }

        public Criteria andObfsGreaterThan(String value) {
            addCriterion("obfs >", value, "obfs");
            return (Criteria) this;
        }

        public Criteria andObfsGreaterThanOrEqualTo(String value) {
            addCriterion("obfs >=", value, "obfs");
            return (Criteria) this;
        }

        public Criteria andObfsLessThan(String value) {
            addCriterion("obfs <", value, "obfs");
            return (Criteria) this;
        }

        public Criteria andObfsLessThanOrEqualTo(String value) {
            addCriterion("obfs <=", value, "obfs");
            return (Criteria) this;
        }

        public Criteria andObfsLike(String value) {
            addCriterion("obfs like", value, "obfs");
            return (Criteria) this;
        }

        public Criteria andObfsNotLike(String value) {
            addCriterion("obfs not like", value, "obfs");
            return (Criteria) this;
        }

        public Criteria andObfsIn(List<String> values) {
            addCriterion("obfs in", values, "obfs");
            return (Criteria) this;
        }

        public Criteria andObfsNotIn(List<String> values) {
            addCriterion("obfs not in", values, "obfs");
            return (Criteria) this;
        }

        public Criteria andObfsBetween(String value1, String value2) {
            addCriterion("obfs between", value1, value2, "obfs");
            return (Criteria) this;
        }

        public Criteria andObfsNotBetween(String value1, String value2) {
            addCriterion("obfs not between", value1, value2, "obfs");
            return (Criteria) this;
        }

        public Criteria andObfsParamIsNull() {
            addCriterion("obfs_param is null");
            return (Criteria) this;
        }

        public Criteria andObfsParamIsNotNull() {
            addCriterion("obfs_param is not null");
            return (Criteria) this;
        }

        public Criteria andObfsParamEqualTo(String value) {
            addCriterion("obfs_param =", value, "obfsParam");
            return (Criteria) this;
        }

        public Criteria andObfsParamNotEqualTo(String value) {
            addCriterion("obfs_param <>", value, "obfsParam");
            return (Criteria) this;
        }

        public Criteria andObfsParamGreaterThan(String value) {
            addCriterion("obfs_param >", value, "obfsParam");
            return (Criteria) this;
        }

        public Criteria andObfsParamGreaterThanOrEqualTo(String value) {
            addCriterion("obfs_param >=", value, "obfsParam");
            return (Criteria) this;
        }

        public Criteria andObfsParamLessThan(String value) {
            addCriterion("obfs_param <", value, "obfsParam");
            return (Criteria) this;
        }

        public Criteria andObfsParamLessThanOrEqualTo(String value) {
            addCriterion("obfs_param <=", value, "obfsParam");
            return (Criteria) this;
        }

        public Criteria andObfsParamLike(String value) {
            addCriterion("obfs_param like", value, "obfsParam");
            return (Criteria) this;
        }

        public Criteria andObfsParamNotLike(String value) {
            addCriterion("obfs_param not like", value, "obfsParam");
            return (Criteria) this;
        }

        public Criteria andObfsParamIn(List<String> values) {
            addCriterion("obfs_param in", values, "obfsParam");
            return (Criteria) this;
        }

        public Criteria andObfsParamNotIn(List<String> values) {
            addCriterion("obfs_param not in", values, "obfsParam");
            return (Criteria) this;
        }

        public Criteria andObfsParamBetween(String value1, String value2) {
            addCriterion("obfs_param between", value1, value2, "obfsParam");
            return (Criteria) this;
        }

        public Criteria andObfsParamNotBetween(String value1, String value2) {
            addCriterion("obfs_param not between", value1, value2, "obfsParam");
            return (Criteria) this;
        }

        public Criteria andIsHideIsNull() {
            addCriterion("is_hide is null");
            return (Criteria) this;
        }

        public Criteria andIsHideIsNotNull() {
            addCriterion("is_hide is not null");
            return (Criteria) this;
        }

        public Criteria andIsHideEqualTo(Integer value) {
            addCriterion("is_hide =", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotEqualTo(Integer value) {
            addCriterion("is_hide <>", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideGreaterThan(Integer value) {
            addCriterion("is_hide >", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_hide >=", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideLessThan(Integer value) {
            addCriterion("is_hide <", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideLessThanOrEqualTo(Integer value) {
            addCriterion("is_hide <=", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideIn(List<Integer> values) {
            addCriterion("is_hide in", values, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotIn(List<Integer> values) {
            addCriterion("is_hide not in", values, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideBetween(Integer value1, Integer value2) {
            addCriterion("is_hide between", value1, value2, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotBetween(Integer value1, Integer value2) {
            addCriterion("is_hide not between", value1, value2, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsMultiUserIsNull() {
            addCriterion("is_multi_user is null");
            return (Criteria) this;
        }

        public Criteria andIsMultiUserIsNotNull() {
            addCriterion("is_multi_user is not null");
            return (Criteria) this;
        }

        public Criteria andIsMultiUserEqualTo(Integer value) {
            addCriterion("is_multi_user =", value, "isMultiUser");
            return (Criteria) this;
        }

        public Criteria andIsMultiUserNotEqualTo(Integer value) {
            addCriterion("is_multi_user <>", value, "isMultiUser");
            return (Criteria) this;
        }

        public Criteria andIsMultiUserGreaterThan(Integer value) {
            addCriterion("is_multi_user >", value, "isMultiUser");
            return (Criteria) this;
        }

        public Criteria andIsMultiUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_multi_user >=", value, "isMultiUser");
            return (Criteria) this;
        }

        public Criteria andIsMultiUserLessThan(Integer value) {
            addCriterion("is_multi_user <", value, "isMultiUser");
            return (Criteria) this;
        }

        public Criteria andIsMultiUserLessThanOrEqualTo(Integer value) {
            addCriterion("is_multi_user <=", value, "isMultiUser");
            return (Criteria) this;
        }

        public Criteria andIsMultiUserIn(List<Integer> values) {
            addCriterion("is_multi_user in", values, "isMultiUser");
            return (Criteria) this;
        }

        public Criteria andIsMultiUserNotIn(List<Integer> values) {
            addCriterion("is_multi_user not in", values, "isMultiUser");
            return (Criteria) this;
        }

        public Criteria andIsMultiUserBetween(Integer value1, Integer value2) {
            addCriterion("is_multi_user between", value1, value2, "isMultiUser");
            return (Criteria) this;
        }

        public Criteria andIsMultiUserNotBetween(Integer value1, Integer value2) {
            addCriterion("is_multi_user not between", value1, value2, "isMultiUser");
            return (Criteria) this;
        }

        public Criteria andTelegramIdIsNull() {
            addCriterion("telegram_id is null");
            return (Criteria) this;
        }

        public Criteria andTelegramIdIsNotNull() {
            addCriterion("telegram_id is not null");
            return (Criteria) this;
        }

        public Criteria andTelegramIdEqualTo(Long value) {
            addCriterion("telegram_id =", value, "telegramId");
            return (Criteria) this;
        }

        public Criteria andTelegramIdNotEqualTo(Long value) {
            addCriterion("telegram_id <>", value, "telegramId");
            return (Criteria) this;
        }

        public Criteria andTelegramIdGreaterThan(Long value) {
            addCriterion("telegram_id >", value, "telegramId");
            return (Criteria) this;
        }

        public Criteria andTelegramIdGreaterThanOrEqualTo(Long value) {
            addCriterion("telegram_id >=", value, "telegramId");
            return (Criteria) this;
        }

        public Criteria andTelegramIdLessThan(Long value) {
            addCriterion("telegram_id <", value, "telegramId");
            return (Criteria) this;
        }

        public Criteria andTelegramIdLessThanOrEqualTo(Long value) {
            addCriterion("telegram_id <=", value, "telegramId");
            return (Criteria) this;
        }

        public Criteria andTelegramIdIn(List<Long> values) {
            addCriterion("telegram_id in", values, "telegramId");
            return (Criteria) this;
        }

        public Criteria andTelegramIdNotIn(List<Long> values) {
            addCriterion("telegram_id not in", values, "telegramId");
            return (Criteria) this;
        }

        public Criteria andTelegramIdBetween(Long value1, Long value2) {
            addCriterion("telegram_id between", value1, value2, "telegramId");
            return (Criteria) this;
        }

        public Criteria andTelegramIdNotBetween(Long value1, Long value2) {
            addCriterion("telegram_id not between", value1, value2, "telegramId");
            return (Criteria) this;
        }

        public Criteria andDiscordIsNull() {
            addCriterion("discord is null");
            return (Criteria) this;
        }

        public Criteria andDiscordIsNotNull() {
            addCriterion("discord is not null");
            return (Criteria) this;
        }

        public Criteria andDiscordEqualTo(Long value) {
            addCriterion("discord =", value, "discord");
            return (Criteria) this;
        }

        public Criteria andDiscordNotEqualTo(Long value) {
            addCriterion("discord <>", value, "discord");
            return (Criteria) this;
        }

        public Criteria andDiscordGreaterThan(Long value) {
            addCriterion("discord >", value, "discord");
            return (Criteria) this;
        }

        public Criteria andDiscordGreaterThanOrEqualTo(Long value) {
            addCriterion("discord >=", value, "discord");
            return (Criteria) this;
        }

        public Criteria andDiscordLessThan(Long value) {
            addCriterion("discord <", value, "discord");
            return (Criteria) this;
        }

        public Criteria andDiscordLessThanOrEqualTo(Long value) {
            addCriterion("discord <=", value, "discord");
            return (Criteria) this;
        }

        public Criteria andDiscordIn(List<Long> values) {
            addCriterion("discord in", values, "discord");
            return (Criteria) this;
        }

        public Criteria andDiscordNotIn(List<Long> values) {
            addCriterion("discord not in", values, "discord");
            return (Criteria) this;
        }

        public Criteria andDiscordBetween(Long value1, Long value2) {
            addCriterion("discord between", value1, value2, "discord");
            return (Criteria) this;
        }

        public Criteria andDiscordNotBetween(Long value1, Long value2) {
            addCriterion("discord not between", value1, value2, "discord");
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