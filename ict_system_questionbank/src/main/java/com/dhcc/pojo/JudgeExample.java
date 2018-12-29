package com.dhcc.pojo;

import java.util.ArrayList;
import java.util.List;

public class JudgeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JudgeExample() {
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

        public Criteria andJudgeNumberIsNull() {
            addCriterion("judge_number is null");
            return (Criteria) this;
        }

        public Criteria andJudgeNumberIsNotNull() {
            addCriterion("judge_number is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeNumberEqualTo(String value) {
            addCriterion("judge_number =", value, "judgeNumber");
            return (Criteria) this;
        }

        public Criteria andJudgeNumberNotEqualTo(String value) {
            addCriterion("judge_number <>", value, "judgeNumber");
            return (Criteria) this;
        }

        public Criteria andJudgeNumberGreaterThan(String value) {
            addCriterion("judge_number >", value, "judgeNumber");
            return (Criteria) this;
        }

        public Criteria andJudgeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("judge_number >=", value, "judgeNumber");
            return (Criteria) this;
        }

        public Criteria andJudgeNumberLessThan(String value) {
            addCriterion("judge_number <", value, "judgeNumber");
            return (Criteria) this;
        }

        public Criteria andJudgeNumberLessThanOrEqualTo(String value) {
            addCriterion("judge_number <=", value, "judgeNumber");
            return (Criteria) this;
        }

        public Criteria andJudgeNumberLike(String value) {
            addCriterion("judge_number like", value, "judgeNumber");
            return (Criteria) this;
        }

        public Criteria andJudgeNumberNotLike(String value) {
            addCriterion("judge_number not like", value, "judgeNumber");
            return (Criteria) this;
        }

        public Criteria andJudgeNumberIn(List<String> values) {
            addCriterion("judge_number in", values, "judgeNumber");
            return (Criteria) this;
        }

        public Criteria andJudgeNumberNotIn(List<String> values) {
            addCriterion("judge_number not in", values, "judgeNumber");
            return (Criteria) this;
        }

        public Criteria andJudgeNumberBetween(String value1, String value2) {
            addCriterion("judge_number between", value1, value2, "judgeNumber");
            return (Criteria) this;
        }

        public Criteria andJudgeNumberNotBetween(String value1, String value2) {
            addCriterion("judge_number not between", value1, value2, "judgeNumber");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeIsNull() {
            addCriterion("judge_type is null");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeIsNotNull() {
            addCriterion("judge_type is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeEqualTo(String value) {
            addCriterion("judge_type =", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeNotEqualTo(String value) {
            addCriterion("judge_type <>", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeGreaterThan(String value) {
            addCriterion("judge_type >", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("judge_type >=", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeLessThan(String value) {
            addCriterion("judge_type <", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeLessThanOrEqualTo(String value) {
            addCriterion("judge_type <=", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeLike(String value) {
            addCriterion("judge_type like", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeNotLike(String value) {
            addCriterion("judge_type not like", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeIn(List<String> values) {
            addCriterion("judge_type in", values, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeNotIn(List<String> values) {
            addCriterion("judge_type not in", values, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeBetween(String value1, String value2) {
            addCriterion("judge_type between", value1, value2, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeNotBetween(String value1, String value2) {
            addCriterion("judge_type not between", value1, value2, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleIsNull() {
            addCriterion("judge_title is null");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleIsNotNull() {
            addCriterion("judge_title is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleEqualTo(String value) {
            addCriterion("judge_title =", value, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleNotEqualTo(String value) {
            addCriterion("judge_title <>", value, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleGreaterThan(String value) {
            addCriterion("judge_title >", value, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("judge_title >=", value, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleLessThan(String value) {
            addCriterion("judge_title <", value, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleLessThanOrEqualTo(String value) {
            addCriterion("judge_title <=", value, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleLike(String value) {
            addCriterion("judge_title like", value, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleNotLike(String value) {
            addCriterion("judge_title not like", value, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleIn(List<String> values) {
            addCriterion("judge_title in", values, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleNotIn(List<String> values) {
            addCriterion("judge_title not in", values, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleBetween(String value1, String value2) {
            addCriterion("judge_title between", value1, value2, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleNotBetween(String value1, String value2) {
            addCriterion("judge_title not between", value1, value2, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeCorrectIsNull() {
            addCriterion("judge_correct is null");
            return (Criteria) this;
        }

        public Criteria andJudgeCorrectIsNotNull() {
            addCriterion("judge_correct is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeCorrectEqualTo(String value) {
            addCriterion("judge_correct =", value, "judgeCorrect");
            return (Criteria) this;
        }

        public Criteria andJudgeCorrectNotEqualTo(String value) {
            addCriterion("judge_correct <>", value, "judgeCorrect");
            return (Criteria) this;
        }

        public Criteria andJudgeCorrectGreaterThan(String value) {
            addCriterion("judge_correct >", value, "judgeCorrect");
            return (Criteria) this;
        }

        public Criteria andJudgeCorrectGreaterThanOrEqualTo(String value) {
            addCriterion("judge_correct >=", value, "judgeCorrect");
            return (Criteria) this;
        }

        public Criteria andJudgeCorrectLessThan(String value) {
            addCriterion("judge_correct <", value, "judgeCorrect");
            return (Criteria) this;
        }

        public Criteria andJudgeCorrectLessThanOrEqualTo(String value) {
            addCriterion("judge_correct <=", value, "judgeCorrect");
            return (Criteria) this;
        }

        public Criteria andJudgeCorrectLike(String value) {
            addCriterion("judge_correct like", value, "judgeCorrect");
            return (Criteria) this;
        }

        public Criteria andJudgeCorrectNotLike(String value) {
            addCriterion("judge_correct not like", value, "judgeCorrect");
            return (Criteria) this;
        }

        public Criteria andJudgeCorrectIn(List<String> values) {
            addCriterion("judge_correct in", values, "judgeCorrect");
            return (Criteria) this;
        }

        public Criteria andJudgeCorrectNotIn(List<String> values) {
            addCriterion("judge_correct not in", values, "judgeCorrect");
            return (Criteria) this;
        }

        public Criteria andJudgeCorrectBetween(String value1, String value2) {
            addCriterion("judge_correct between", value1, value2, "judgeCorrect");
            return (Criteria) this;
        }

        public Criteria andJudgeCorrectNotBetween(String value1, String value2) {
            addCriterion("judge_correct not between", value1, value2, "judgeCorrect");
            return (Criteria) this;
        }

        public Criteria andJudgeComplexityIsNull() {
            addCriterion("judge_complexity is null");
            return (Criteria) this;
        }

        public Criteria andJudgeComplexityIsNotNull() {
            addCriterion("judge_complexity is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeComplexityEqualTo(String value) {
            addCriterion("judge_complexity =", value, "judgeComplexity");
            return (Criteria) this;
        }

        public Criteria andJudgeComplexityNotEqualTo(String value) {
            addCriterion("judge_complexity <>", value, "judgeComplexity");
            return (Criteria) this;
        }

        public Criteria andJudgeComplexityGreaterThan(String value) {
            addCriterion("judge_complexity >", value, "judgeComplexity");
            return (Criteria) this;
        }

        public Criteria andJudgeComplexityGreaterThanOrEqualTo(String value) {
            addCriterion("judge_complexity >=", value, "judgeComplexity");
            return (Criteria) this;
        }

        public Criteria andJudgeComplexityLessThan(String value) {
            addCriterion("judge_complexity <", value, "judgeComplexity");
            return (Criteria) this;
        }

        public Criteria andJudgeComplexityLessThanOrEqualTo(String value) {
            addCriterion("judge_complexity <=", value, "judgeComplexity");
            return (Criteria) this;
        }

        public Criteria andJudgeComplexityLike(String value) {
            addCriterion("judge_complexity like", value, "judgeComplexity");
            return (Criteria) this;
        }

        public Criteria andJudgeComplexityNotLike(String value) {
            addCriterion("judge_complexity not like", value, "judgeComplexity");
            return (Criteria) this;
        }

        public Criteria andJudgeComplexityIn(List<String> values) {
            addCriterion("judge_complexity in", values, "judgeComplexity");
            return (Criteria) this;
        }

        public Criteria andJudgeComplexityNotIn(List<String> values) {
            addCriterion("judge_complexity not in", values, "judgeComplexity");
            return (Criteria) this;
        }

        public Criteria andJudgeComplexityBetween(String value1, String value2) {
            addCriterion("judge_complexity between", value1, value2, "judgeComplexity");
            return (Criteria) this;
        }

        public Criteria andJudgeComplexityNotBetween(String value1, String value2) {
            addCriterion("judge_complexity not between", value1, value2, "judgeComplexity");
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