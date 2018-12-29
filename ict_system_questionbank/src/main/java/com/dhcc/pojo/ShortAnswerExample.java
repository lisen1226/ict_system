package com.dhcc.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShortAnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShortAnswerExample() {
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

        public Criteria andShortAnswerNumberIsNull() {
            addCriterion("short_answer_number is null");
            return (Criteria) this;
        }

        public Criteria andShortAnswerNumberIsNotNull() {
            addCriterion("short_answer_number is not null");
            return (Criteria) this;
        }

        public Criteria andShortAnswerNumberEqualTo(String value) {
            addCriterion("short_answer_number =", value, "shortAnswerNumber");
            return (Criteria) this;
        }

        public Criteria andShortAnswerNumberNotEqualTo(String value) {
            addCriterion("short_answer_number <>", value, "shortAnswerNumber");
            return (Criteria) this;
        }

        public Criteria andShortAnswerNumberGreaterThan(String value) {
            addCriterion("short_answer_number >", value, "shortAnswerNumber");
            return (Criteria) this;
        }

        public Criteria andShortAnswerNumberGreaterThanOrEqualTo(String value) {
            addCriterion("short_answer_number >=", value, "shortAnswerNumber");
            return (Criteria) this;
        }

        public Criteria andShortAnswerNumberLessThan(String value) {
            addCriterion("short_answer_number <", value, "shortAnswerNumber");
            return (Criteria) this;
        }

        public Criteria andShortAnswerNumberLessThanOrEqualTo(String value) {
            addCriterion("short_answer_number <=", value, "shortAnswerNumber");
            return (Criteria) this;
        }

        public Criteria andShortAnswerNumberLike(String value) {
            addCriterion("short_answer_number like", value, "shortAnswerNumber");
            return (Criteria) this;
        }

        public Criteria andShortAnswerNumberNotLike(String value) {
            addCriterion("short_answer_number not like", value, "shortAnswerNumber");
            return (Criteria) this;
        }

        public Criteria andShortAnswerNumberIn(List<String> values) {
            addCriterion("short_answer_number in", values, "shortAnswerNumber");
            return (Criteria) this;
        }

        public Criteria andShortAnswerNumberNotIn(List<String> values) {
            addCriterion("short_answer_number not in", values, "shortAnswerNumber");
            return (Criteria) this;
        }

        public Criteria andShortAnswerNumberBetween(String value1, String value2) {
            addCriterion("short_answer_number between", value1, value2, "shortAnswerNumber");
            return (Criteria) this;
        }

        public Criteria andShortAnswerNumberNotBetween(String value1, String value2) {
            addCriterion("short_answer_number not between", value1, value2, "shortAnswerNumber");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTypeIsNull() {
            addCriterion("short_answer_type is null");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTypeIsNotNull() {
            addCriterion("short_answer_type is not null");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTypeEqualTo(String value) {
            addCriterion("short_answer_type =", value, "shortAnswerType");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTypeNotEqualTo(String value) {
            addCriterion("short_answer_type <>", value, "shortAnswerType");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTypeGreaterThan(String value) {
            addCriterion("short_answer_type >", value, "shortAnswerType");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("short_answer_type >=", value, "shortAnswerType");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTypeLessThan(String value) {
            addCriterion("short_answer_type <", value, "shortAnswerType");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTypeLessThanOrEqualTo(String value) {
            addCriterion("short_answer_type <=", value, "shortAnswerType");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTypeLike(String value) {
            addCriterion("short_answer_type like", value, "shortAnswerType");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTypeNotLike(String value) {
            addCriterion("short_answer_type not like", value, "shortAnswerType");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTypeIn(List<String> values) {
            addCriterion("short_answer_type in", values, "shortAnswerType");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTypeNotIn(List<String> values) {
            addCriterion("short_answer_type not in", values, "shortAnswerType");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTypeBetween(String value1, String value2) {
            addCriterion("short_answer_type between", value1, value2, "shortAnswerType");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTypeNotBetween(String value1, String value2) {
            addCriterion("short_answer_type not between", value1, value2, "shortAnswerType");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTitleIsNull() {
            addCriterion("short_answer_title is null");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTitleIsNotNull() {
            addCriterion("short_answer_title is not null");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTitleEqualTo(String value) {
            addCriterion("short_answer_title =", value, "shortAnswerTitle");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTitleNotEqualTo(String value) {
            addCriterion("short_answer_title <>", value, "shortAnswerTitle");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTitleGreaterThan(String value) {
            addCriterion("short_answer_title >", value, "shortAnswerTitle");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTitleGreaterThanOrEqualTo(String value) {
            addCriterion("short_answer_title >=", value, "shortAnswerTitle");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTitleLessThan(String value) {
            addCriterion("short_answer_title <", value, "shortAnswerTitle");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTitleLessThanOrEqualTo(String value) {
            addCriterion("short_answer_title <=", value, "shortAnswerTitle");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTitleLike(String value) {
            addCriterion("short_answer_title like", value, "shortAnswerTitle");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTitleNotLike(String value) {
            addCriterion("short_answer_title not like", value, "shortAnswerTitle");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTitleIn(List<String> values) {
            addCriterion("short_answer_title in", values, "shortAnswerTitle");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTitleNotIn(List<String> values) {
            addCriterion("short_answer_title not in", values, "shortAnswerTitle");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTitleBetween(String value1, String value2) {
            addCriterion("short_answer_title between", value1, value2, "shortAnswerTitle");
            return (Criteria) this;
        }

        public Criteria andShortAnswerTitleNotBetween(String value1, String value2) {
            addCriterion("short_answer_title not between", value1, value2, "shortAnswerTitle");
            return (Criteria) this;
        }

        public Criteria andShortAnswerCorrectIsNull() {
            addCriterion("short_answer_correct is null");
            return (Criteria) this;
        }

        public Criteria andShortAnswerCorrectIsNotNull() {
            addCriterion("short_answer_correct is not null");
            return (Criteria) this;
        }

        public Criteria andShortAnswerCorrectEqualTo(String value) {
            addCriterion("short_answer_correct =", value, "shortAnswerCorrect");
            return (Criteria) this;
        }

        public Criteria andShortAnswerCorrectNotEqualTo(String value) {
            addCriterion("short_answer_correct <>", value, "shortAnswerCorrect");
            return (Criteria) this;
        }

        public Criteria andShortAnswerCorrectGreaterThan(String value) {
            addCriterion("short_answer_correct >", value, "shortAnswerCorrect");
            return (Criteria) this;
        }

        public Criteria andShortAnswerCorrectGreaterThanOrEqualTo(String value) {
            addCriterion("short_answer_correct >=", value, "shortAnswerCorrect");
            return (Criteria) this;
        }

        public Criteria andShortAnswerCorrectLessThan(String value) {
            addCriterion("short_answer_correct <", value, "shortAnswerCorrect");
            return (Criteria) this;
        }

        public Criteria andShortAnswerCorrectLessThanOrEqualTo(String value) {
            addCriterion("short_answer_correct <=", value, "shortAnswerCorrect");
            return (Criteria) this;
        }

        public Criteria andShortAnswerCorrectLike(String value) {
            addCriterion("short_answer_correct like", value, "shortAnswerCorrect");
            return (Criteria) this;
        }

        public Criteria andShortAnswerCorrectNotLike(String value) {
            addCriterion("short_answer_correct not like", value, "shortAnswerCorrect");
            return (Criteria) this;
        }

        public Criteria andShortAnswerCorrectIn(List<String> values) {
            addCriterion("short_answer_correct in", values, "shortAnswerCorrect");
            return (Criteria) this;
        }

        public Criteria andShortAnswerCorrectNotIn(List<String> values) {
            addCriterion("short_answer_correct not in", values, "shortAnswerCorrect");
            return (Criteria) this;
        }

        public Criteria andShortAnswerCorrectBetween(String value1, String value2) {
            addCriterion("short_answer_correct between", value1, value2, "shortAnswerCorrect");
            return (Criteria) this;
        }

        public Criteria andShortAnswerCorrectNotBetween(String value1, String value2) {
            addCriterion("short_answer_correct not between", value1, value2, "shortAnswerCorrect");
            return (Criteria) this;
        }

        public Criteria andShortAnswerComplexityIsNull() {
            addCriterion("short_answer_complexity is null");
            return (Criteria) this;
        }

        public Criteria andShortAnswerComplexityIsNotNull() {
            addCriterion("short_answer_complexity is not null");
            return (Criteria) this;
        }

        public Criteria andShortAnswerComplexityEqualTo(String value) {
            addCriterion("short_answer_complexity =", value, "shortAnswerComplexity");
            return (Criteria) this;
        }

        public Criteria andShortAnswerComplexityNotEqualTo(String value) {
            addCriterion("short_answer_complexity <>", value, "shortAnswerComplexity");
            return (Criteria) this;
        }

        public Criteria andShortAnswerComplexityGreaterThan(String value) {
            addCriterion("short_answer_complexity >", value, "shortAnswerComplexity");
            return (Criteria) this;
        }

        public Criteria andShortAnswerComplexityGreaterThanOrEqualTo(String value) {
            addCriterion("short_answer_complexity >=", value, "shortAnswerComplexity");
            return (Criteria) this;
        }

        public Criteria andShortAnswerComplexityLessThan(String value) {
            addCriterion("short_answer_complexity <", value, "shortAnswerComplexity");
            return (Criteria) this;
        }

        public Criteria andShortAnswerComplexityLessThanOrEqualTo(String value) {
            addCriterion("short_answer_complexity <=", value, "shortAnswerComplexity");
            return (Criteria) this;
        }

        public Criteria andShortAnswerComplexityLike(String value) {
            addCriterion("short_answer_complexity like", value, "shortAnswerComplexity");
            return (Criteria) this;
        }

        public Criteria andShortAnswerComplexityNotLike(String value) {
            addCriterion("short_answer_complexity not like", value, "shortAnswerComplexity");
            return (Criteria) this;
        }

        public Criteria andShortAnswerComplexityIn(List<String> values) {
            addCriterion("short_answer_complexity in", values, "shortAnswerComplexity");
            return (Criteria) this;
        }

        public Criteria andShortAnswerComplexityNotIn(List<String> values) {
            addCriterion("short_answer_complexity not in", values, "shortAnswerComplexity");
            return (Criteria) this;
        }

        public Criteria andShortAnswerComplexityBetween(String value1, String value2) {
            addCriterion("short_answer_complexity between", value1, value2, "shortAnswerComplexity");
            return (Criteria) this;
        }

        public Criteria andShortAnswerComplexityNotBetween(String value1, String value2) {
            addCriterion("short_answer_complexity not between", value1, value2, "shortAnswerComplexity");
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