package com.dhcc.pojo;

import java.util.ArrayList;
import java.util.List;

public class HistoryexamsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HistoryexamsExample() {
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

        public Criteria andTesttimeIsNull() {
            addCriterion("testTime is null");
            return (Criteria) this;
        }

        public Criteria andTesttimeIsNotNull() {
            addCriterion("testTime is not null");
            return (Criteria) this;
        }

        public Criteria andTesttimeEqualTo(String value) {
            addCriterion("testTime =", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeNotEqualTo(String value) {
            addCriterion("testTime <>", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeGreaterThan(String value) {
            addCriterion("testTime >", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeGreaterThanOrEqualTo(String value) {
            addCriterion("testTime >=", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeLessThan(String value) {
            addCriterion("testTime <", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeLessThanOrEqualTo(String value) {
            addCriterion("testTime <=", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeLike(String value) {
            addCriterion("testTime like", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeNotLike(String value) {
            addCriterion("testTime not like", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeIn(List<String> values) {
            addCriterion("testTime in", values, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeNotIn(List<String> values) {
            addCriterion("testTime not in", values, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeBetween(String value1, String value2) {
            addCriterion("testTime between", value1, value2, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeNotBetween(String value1, String value2) {
            addCriterion("testTime not between", value1, value2, "testtime");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andAccuracyIsNull() {
            addCriterion("accuracy is null");
            return (Criteria) this;
        }

        public Criteria andAccuracyIsNotNull() {
            addCriterion("accuracy is not null");
            return (Criteria) this;
        }

        public Criteria andAccuracyEqualTo(String value) {
            addCriterion("accuracy =", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyNotEqualTo(String value) {
            addCriterion("accuracy <>", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyGreaterThan(String value) {
            addCriterion("accuracy >", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyGreaterThanOrEqualTo(String value) {
            addCriterion("accuracy >=", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyLessThan(String value) {
            addCriterion("accuracy <", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyLessThanOrEqualTo(String value) {
            addCriterion("accuracy <=", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyLike(String value) {
            addCriterion("accuracy like", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyNotLike(String value) {
            addCriterion("accuracy not like", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyIn(List<String> values) {
            addCriterion("accuracy in", values, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyNotIn(List<String> values) {
            addCriterion("accuracy not in", values, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyBetween(String value1, String value2) {
            addCriterion("accuracy between", value1, value2, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyNotBetween(String value1, String value2) {
            addCriterion("accuracy not between", value1, value2, "accuracy");
            return (Criteria) this;
        }

        public Criteria andTesttypeIsNull() {
            addCriterion("testType is null");
            return (Criteria) this;
        }

        public Criteria andTesttypeIsNotNull() {
            addCriterion("testType is not null");
            return (Criteria) this;
        }

        public Criteria andTesttypeEqualTo(String value) {
            addCriterion("testType =", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeNotEqualTo(String value) {
            addCriterion("testType <>", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeGreaterThan(String value) {
            addCriterion("testType >", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeGreaterThanOrEqualTo(String value) {
            addCriterion("testType >=", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeLessThan(String value) {
            addCriterion("testType <", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeLessThanOrEqualTo(String value) {
            addCriterion("testType <=", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeLike(String value) {
            addCriterion("testType like", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeNotLike(String value) {
            addCriterion("testType not like", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeIn(List<String> values) {
            addCriterion("testType in", values, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeNotIn(List<String> values) {
            addCriterion("testType not in", values, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeBetween(String value1, String value2) {
            addCriterion("testType between", value1, value2, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeNotBetween(String value1, String value2) {
            addCriterion("testType not between", value1, value2, "testtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeIsNull() {
            addCriterion("examType is null");
            return (Criteria) this;
        }

        public Criteria andExamtypeIsNotNull() {
            addCriterion("examType is not null");
            return (Criteria) this;
        }

        public Criteria andExamtypeEqualTo(String value) {
            addCriterion("examType =", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeNotEqualTo(String value) {
            addCriterion("examType <>", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeGreaterThan(String value) {
            addCriterion("examType >", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeGreaterThanOrEqualTo(String value) {
            addCriterion("examType >=", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeLessThan(String value) {
            addCriterion("examType <", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeLessThanOrEqualTo(String value) {
            addCriterion("examType <=", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeLike(String value) {
            addCriterion("examType like", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeNotLike(String value) {
            addCriterion("examType not like", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeIn(List<String> values) {
            addCriterion("examType in", values, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeNotIn(List<String> values) {
            addCriterion("examType not in", values, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeBetween(String value1, String value2) {
            addCriterion("examType between", value1, value2, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeNotBetween(String value1, String value2) {
            addCriterion("examType not between", value1, value2, "examtype");
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