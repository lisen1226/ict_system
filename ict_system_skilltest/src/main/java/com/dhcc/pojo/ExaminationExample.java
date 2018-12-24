package com.dhcc.pojo;

import java.util.ArrayList;
import java.util.List;

public class ExaminationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExaminationExample() {
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

        public Criteria andExaminationNumberIsNull() {
            addCriterion("examination_number is null");
            return (Criteria) this;
        }

        public Criteria andExaminationNumberIsNotNull() {
            addCriterion("examination_number is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationNumberEqualTo(String value) {
            addCriterion("examination_number =", value, "examinationNumber");
            return (Criteria) this;
        }

        public Criteria andExaminationNumberNotEqualTo(String value) {
            addCriterion("examination_number <>", value, "examinationNumber");
            return (Criteria) this;
        }

        public Criteria andExaminationNumberGreaterThan(String value) {
            addCriterion("examination_number >", value, "examinationNumber");
            return (Criteria) this;
        }

        public Criteria andExaminationNumberGreaterThanOrEqualTo(String value) {
            addCriterion("examination_number >=", value, "examinationNumber");
            return (Criteria) this;
        }

        public Criteria andExaminationNumberLessThan(String value) {
            addCriterion("examination_number <", value, "examinationNumber");
            return (Criteria) this;
        }

        public Criteria andExaminationNumberLessThanOrEqualTo(String value) {
            addCriterion("examination_number <=", value, "examinationNumber");
            return (Criteria) this;
        }

        public Criteria andExaminationNumberLike(String value) {
            addCriterion("examination_number like", value, "examinationNumber");
            return (Criteria) this;
        }

        public Criteria andExaminationNumberNotLike(String value) {
            addCriterion("examination_number not like", value, "examinationNumber");
            return (Criteria) this;
        }

        public Criteria andExaminationNumberIn(List<String> values) {
            addCriterion("examination_number in", values, "examinationNumber");
            return (Criteria) this;
        }

        public Criteria andExaminationNumberNotIn(List<String> values) {
            addCriterion("examination_number not in", values, "examinationNumber");
            return (Criteria) this;
        }

        public Criteria andExaminationNumberBetween(String value1, String value2) {
            addCriterion("examination_number between", value1, value2, "examinationNumber");
            return (Criteria) this;
        }

        public Criteria andExaminationNumberNotBetween(String value1, String value2) {
            addCriterion("examination_number not between", value1, value2, "examinationNumber");
            return (Criteria) this;
        }

        public Criteria andExaminationGenreIsNull() {
            addCriterion("examination_genre is null");
            return (Criteria) this;
        }

        public Criteria andExaminationGenreIsNotNull() {
            addCriterion("examination_genre is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationGenreEqualTo(String value) {
            addCriterion("examination_genre =", value, "examinationGenre");
            return (Criteria) this;
        }

        public Criteria andExaminationGenreNotEqualTo(String value) {
            addCriterion("examination_genre <>", value, "examinationGenre");
            return (Criteria) this;
        }

        public Criteria andExaminationGenreGreaterThan(String value) {
            addCriterion("examination_genre >", value, "examinationGenre");
            return (Criteria) this;
        }

        public Criteria andExaminationGenreGreaterThanOrEqualTo(String value) {
            addCriterion("examination_genre >=", value, "examinationGenre");
            return (Criteria) this;
        }

        public Criteria andExaminationGenreLessThan(String value) {
            addCriterion("examination_genre <", value, "examinationGenre");
            return (Criteria) this;
        }

        public Criteria andExaminationGenreLessThanOrEqualTo(String value) {
            addCriterion("examination_genre <=", value, "examinationGenre");
            return (Criteria) this;
        }

        public Criteria andExaminationGenreLike(String value) {
            addCriterion("examination_genre like", value, "examinationGenre");
            return (Criteria) this;
        }

        public Criteria andExaminationGenreNotLike(String value) {
            addCriterion("examination_genre not like", value, "examinationGenre");
            return (Criteria) this;
        }

        public Criteria andExaminationGenreIn(List<String> values) {
            addCriterion("examination_genre in", values, "examinationGenre");
            return (Criteria) this;
        }

        public Criteria andExaminationGenreNotIn(List<String> values) {
            addCriterion("examination_genre not in", values, "examinationGenre");
            return (Criteria) this;
        }

        public Criteria andExaminationGenreBetween(String value1, String value2) {
            addCriterion("examination_genre between", value1, value2, "examinationGenre");
            return (Criteria) this;
        }

        public Criteria andExaminationGenreNotBetween(String value1, String value2) {
            addCriterion("examination_genre not between", value1, value2, "examinationGenre");
            return (Criteria) this;
        }

        public Criteria andExaminationTitleIsNull() {
            addCriterion("examination_title is null");
            return (Criteria) this;
        }

        public Criteria andExaminationTitleIsNotNull() {
            addCriterion("examination_title is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationTitleEqualTo(String value) {
            addCriterion("examination_title =", value, "examinationTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationTitleNotEqualTo(String value) {
            addCriterion("examination_title <>", value, "examinationTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationTitleGreaterThan(String value) {
            addCriterion("examination_title >", value, "examinationTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationTitleGreaterThanOrEqualTo(String value) {
            addCriterion("examination_title >=", value, "examinationTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationTitleLessThan(String value) {
            addCriterion("examination_title <", value, "examinationTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationTitleLessThanOrEqualTo(String value) {
            addCriterion("examination_title <=", value, "examinationTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationTitleLike(String value) {
            addCriterion("examination_title like", value, "examinationTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationTitleNotLike(String value) {
            addCriterion("examination_title not like", value, "examinationTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationTitleIn(List<String> values) {
            addCriterion("examination_title in", values, "examinationTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationTitleNotIn(List<String> values) {
            addCriterion("examination_title not in", values, "examinationTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationTitleBetween(String value1, String value2) {
            addCriterion("examination_title between", value1, value2, "examinationTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationTitleNotBetween(String value1, String value2) {
            addCriterion("examination_title not between", value1, value2, "examinationTitle");
            return (Criteria) this;
        }

        public Criteria andExaminationRightIsNull() {
            addCriterion("examination_right is null");
            return (Criteria) this;
        }

        public Criteria andExaminationRightIsNotNull() {
            addCriterion("examination_right is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationRightEqualTo(String value) {
            addCriterion("examination_right =", value, "examinationRight");
            return (Criteria) this;
        }

        public Criteria andExaminationRightNotEqualTo(String value) {
            addCriterion("examination_right <>", value, "examinationRight");
            return (Criteria) this;
        }

        public Criteria andExaminationRightGreaterThan(String value) {
            addCriterion("examination_right >", value, "examinationRight");
            return (Criteria) this;
        }

        public Criteria andExaminationRightGreaterThanOrEqualTo(String value) {
            addCriterion("examination_right >=", value, "examinationRight");
            return (Criteria) this;
        }

        public Criteria andExaminationRightLessThan(String value) {
            addCriterion("examination_right <", value, "examinationRight");
            return (Criteria) this;
        }

        public Criteria andExaminationRightLessThanOrEqualTo(String value) {
            addCriterion("examination_right <=", value, "examinationRight");
            return (Criteria) this;
        }

        public Criteria andExaminationRightLike(String value) {
            addCriterion("examination_right like", value, "examinationRight");
            return (Criteria) this;
        }

        public Criteria andExaminationRightNotLike(String value) {
            addCriterion("examination_right not like", value, "examinationRight");
            return (Criteria) this;
        }

        public Criteria andExaminationRightIn(List<String> values) {
            addCriterion("examination_right in", values, "examinationRight");
            return (Criteria) this;
        }

        public Criteria andExaminationRightNotIn(List<String> values) {
            addCriterion("examination_right not in", values, "examinationRight");
            return (Criteria) this;
        }

        public Criteria andExaminationRightBetween(String value1, String value2) {
            addCriterion("examination_right between", value1, value2, "examinationRight");
            return (Criteria) this;
        }

        public Criteria andExaminationRightNotBetween(String value1, String value2) {
            addCriterion("examination_right not between", value1, value2, "examinationRight");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong1IsNull() {
            addCriterion("examination_wrong1 is null");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong1IsNotNull() {
            addCriterion("examination_wrong1 is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong1EqualTo(String value) {
            addCriterion("examination_wrong1 =", value, "examinationWrong1");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong1NotEqualTo(String value) {
            addCriterion("examination_wrong1 <>", value, "examinationWrong1");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong1GreaterThan(String value) {
            addCriterion("examination_wrong1 >", value, "examinationWrong1");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong1GreaterThanOrEqualTo(String value) {
            addCriterion("examination_wrong1 >=", value, "examinationWrong1");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong1LessThan(String value) {
            addCriterion("examination_wrong1 <", value, "examinationWrong1");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong1LessThanOrEqualTo(String value) {
            addCriterion("examination_wrong1 <=", value, "examinationWrong1");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong1Like(String value) {
            addCriterion("examination_wrong1 like", value, "examinationWrong1");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong1NotLike(String value) {
            addCriterion("examination_wrong1 not like", value, "examinationWrong1");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong1In(List<String> values) {
            addCriterion("examination_wrong1 in", values, "examinationWrong1");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong1NotIn(List<String> values) {
            addCriterion("examination_wrong1 not in", values, "examinationWrong1");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong1Between(String value1, String value2) {
            addCriterion("examination_wrong1 between", value1, value2, "examinationWrong1");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong1NotBetween(String value1, String value2) {
            addCriterion("examination_wrong1 not between", value1, value2, "examinationWrong1");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong2IsNull() {
            addCriterion("examination_wrong2 is null");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong2IsNotNull() {
            addCriterion("examination_wrong2 is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong2EqualTo(String value) {
            addCriterion("examination_wrong2 =", value, "examinationWrong2");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong2NotEqualTo(String value) {
            addCriterion("examination_wrong2 <>", value, "examinationWrong2");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong2GreaterThan(String value) {
            addCriterion("examination_wrong2 >", value, "examinationWrong2");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong2GreaterThanOrEqualTo(String value) {
            addCriterion("examination_wrong2 >=", value, "examinationWrong2");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong2LessThan(String value) {
            addCriterion("examination_wrong2 <", value, "examinationWrong2");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong2LessThanOrEqualTo(String value) {
            addCriterion("examination_wrong2 <=", value, "examinationWrong2");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong2Like(String value) {
            addCriterion("examination_wrong2 like", value, "examinationWrong2");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong2NotLike(String value) {
            addCriterion("examination_wrong2 not like", value, "examinationWrong2");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong2In(List<String> values) {
            addCriterion("examination_wrong2 in", values, "examinationWrong2");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong2NotIn(List<String> values) {
            addCriterion("examination_wrong2 not in", values, "examinationWrong2");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong2Between(String value1, String value2) {
            addCriterion("examination_wrong2 between", value1, value2, "examinationWrong2");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong2NotBetween(String value1, String value2) {
            addCriterion("examination_wrong2 not between", value1, value2, "examinationWrong2");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong3IsNull() {
            addCriterion("examination_wrong3 is null");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong3IsNotNull() {
            addCriterion("examination_wrong3 is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong3EqualTo(String value) {
            addCriterion("examination_wrong3 =", value, "examinationWrong3");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong3NotEqualTo(String value) {
            addCriterion("examination_wrong3 <>", value, "examinationWrong3");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong3GreaterThan(String value) {
            addCriterion("examination_wrong3 >", value, "examinationWrong3");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong3GreaterThanOrEqualTo(String value) {
            addCriterion("examination_wrong3 >=", value, "examinationWrong3");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong3LessThan(String value) {
            addCriterion("examination_wrong3 <", value, "examinationWrong3");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong3LessThanOrEqualTo(String value) {
            addCriterion("examination_wrong3 <=", value, "examinationWrong3");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong3Like(String value) {
            addCriterion("examination_wrong3 like", value, "examinationWrong3");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong3NotLike(String value) {
            addCriterion("examination_wrong3 not like", value, "examinationWrong3");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong3In(List<String> values) {
            addCriterion("examination_wrong3 in", values, "examinationWrong3");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong3NotIn(List<String> values) {
            addCriterion("examination_wrong3 not in", values, "examinationWrong3");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong3Between(String value1, String value2) {
            addCriterion("examination_wrong3 between", value1, value2, "examinationWrong3");
            return (Criteria) this;
        }

        public Criteria andExaminationWrong3NotBetween(String value1, String value2) {
            addCriterion("examination_wrong3 not between", value1, value2, "examinationWrong3");
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