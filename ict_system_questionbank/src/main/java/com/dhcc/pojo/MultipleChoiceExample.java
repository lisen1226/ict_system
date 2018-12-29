package com.dhcc.pojo;

import java.util.ArrayList;
import java.util.List;

public class MultipleChoiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MultipleChoiceExample() {
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

        public Criteria andMultipleChoiceNumberIsNull() {
            addCriterion("Multiple_choice_number is null");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceNumberIsNotNull() {
            addCriterion("Multiple_choice_number is not null");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceNumberEqualTo(String value) {
            addCriterion("Multiple_choice_number =", value, "multipleChoiceNumber");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceNumberNotEqualTo(String value) {
            addCriterion("Multiple_choice_number <>", value, "multipleChoiceNumber");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceNumberGreaterThan(String value) {
            addCriterion("Multiple_choice_number >", value, "multipleChoiceNumber");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Multiple_choice_number >=", value, "multipleChoiceNumber");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceNumberLessThan(String value) {
            addCriterion("Multiple_choice_number <", value, "multipleChoiceNumber");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceNumberLessThanOrEqualTo(String value) {
            addCriterion("Multiple_choice_number <=", value, "multipleChoiceNumber");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceNumberLike(String value) {
            addCriterion("Multiple_choice_number like", value, "multipleChoiceNumber");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceNumberNotLike(String value) {
            addCriterion("Multiple_choice_number not like", value, "multipleChoiceNumber");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceNumberIn(List<String> values) {
            addCriterion("Multiple_choice_number in", values, "multipleChoiceNumber");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceNumberNotIn(List<String> values) {
            addCriterion("Multiple_choice_number not in", values, "multipleChoiceNumber");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceNumberBetween(String value1, String value2) {
            addCriterion("Multiple_choice_number between", value1, value2, "multipleChoiceNumber");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceNumberNotBetween(String value1, String value2) {
            addCriterion("Multiple_choice_number not between", value1, value2, "multipleChoiceNumber");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTypeIsNull() {
            addCriterion("Multiple_choice_type is null");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTypeIsNotNull() {
            addCriterion("Multiple_choice_type is not null");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTypeEqualTo(String value) {
            addCriterion("Multiple_choice_type =", value, "multipleChoiceType");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTypeNotEqualTo(String value) {
            addCriterion("Multiple_choice_type <>", value, "multipleChoiceType");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTypeGreaterThan(String value) {
            addCriterion("Multiple_choice_type >", value, "multipleChoiceType");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Multiple_choice_type >=", value, "multipleChoiceType");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTypeLessThan(String value) {
            addCriterion("Multiple_choice_type <", value, "multipleChoiceType");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTypeLessThanOrEqualTo(String value) {
            addCriterion("Multiple_choice_type <=", value, "multipleChoiceType");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTypeLike(String value) {
            addCriterion("Multiple_choice_type like", value, "multipleChoiceType");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTypeNotLike(String value) {
            addCriterion("Multiple_choice_type not like", value, "multipleChoiceType");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTypeIn(List<String> values) {
            addCriterion("Multiple_choice_type in", values, "multipleChoiceType");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTypeNotIn(List<String> values) {
            addCriterion("Multiple_choice_type not in", values, "multipleChoiceType");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTypeBetween(String value1, String value2) {
            addCriterion("Multiple_choice_type between", value1, value2, "multipleChoiceType");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTypeNotBetween(String value1, String value2) {
            addCriterion("Multiple_choice_type not between", value1, value2, "multipleChoiceType");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTitleIsNull() {
            addCriterion("Multiple_choice_title is null");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTitleIsNotNull() {
            addCriterion("Multiple_choice_title is not null");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTitleEqualTo(String value) {
            addCriterion("Multiple_choice_title =", value, "multipleChoiceTitle");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTitleNotEqualTo(String value) {
            addCriterion("Multiple_choice_title <>", value, "multipleChoiceTitle");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTitleGreaterThan(String value) {
            addCriterion("Multiple_choice_title >", value, "multipleChoiceTitle");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Multiple_choice_title >=", value, "multipleChoiceTitle");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTitleLessThan(String value) {
            addCriterion("Multiple_choice_title <", value, "multipleChoiceTitle");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTitleLessThanOrEqualTo(String value) {
            addCriterion("Multiple_choice_title <=", value, "multipleChoiceTitle");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTitleLike(String value) {
            addCriterion("Multiple_choice_title like", value, "multipleChoiceTitle");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTitleNotLike(String value) {
            addCriterion("Multiple_choice_title not like", value, "multipleChoiceTitle");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTitleIn(List<String> values) {
            addCriterion("Multiple_choice_title in", values, "multipleChoiceTitle");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTitleNotIn(List<String> values) {
            addCriterion("Multiple_choice_title not in", values, "multipleChoiceTitle");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTitleBetween(String value1, String value2) {
            addCriterion("Multiple_choice_title between", value1, value2, "multipleChoiceTitle");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceTitleNotBetween(String value1, String value2) {
            addCriterion("Multiple_choice_title not between", value1, value2, "multipleChoiceTitle");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer1IsNull() {
            addCriterion("Multiple_choice_answer1 is null");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer1IsNotNull() {
            addCriterion("Multiple_choice_answer1 is not null");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer1EqualTo(String value) {
            addCriterion("Multiple_choice_answer1 =", value, "multipleChoiceAnswer1");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer1NotEqualTo(String value) {
            addCriterion("Multiple_choice_answer1 <>", value, "multipleChoiceAnswer1");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer1GreaterThan(String value) {
            addCriterion("Multiple_choice_answer1 >", value, "multipleChoiceAnswer1");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer1GreaterThanOrEqualTo(String value) {
            addCriterion("Multiple_choice_answer1 >=", value, "multipleChoiceAnswer1");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer1LessThan(String value) {
            addCriterion("Multiple_choice_answer1 <", value, "multipleChoiceAnswer1");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer1LessThanOrEqualTo(String value) {
            addCriterion("Multiple_choice_answer1 <=", value, "multipleChoiceAnswer1");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer1Like(String value) {
            addCriterion("Multiple_choice_answer1 like", value, "multipleChoiceAnswer1");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer1NotLike(String value) {
            addCriterion("Multiple_choice_answer1 not like", value, "multipleChoiceAnswer1");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer1In(List<String> values) {
            addCriterion("Multiple_choice_answer1 in", values, "multipleChoiceAnswer1");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer1NotIn(List<String> values) {
            addCriterion("Multiple_choice_answer1 not in", values, "multipleChoiceAnswer1");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer1Between(String value1, String value2) {
            addCriterion("Multiple_choice_answer1 between", value1, value2, "multipleChoiceAnswer1");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer1NotBetween(String value1, String value2) {
            addCriterion("Multiple_choice_answer1 not between", value1, value2, "multipleChoiceAnswer1");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer2IsNull() {
            addCriterion("Multiple_choice_answer2 is null");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer2IsNotNull() {
            addCriterion("Multiple_choice_answer2 is not null");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer2EqualTo(String value) {
            addCriterion("Multiple_choice_answer2 =", value, "multipleChoiceAnswer2");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer2NotEqualTo(String value) {
            addCriterion("Multiple_choice_answer2 <>", value, "multipleChoiceAnswer2");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer2GreaterThan(String value) {
            addCriterion("Multiple_choice_answer2 >", value, "multipleChoiceAnswer2");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer2GreaterThanOrEqualTo(String value) {
            addCriterion("Multiple_choice_answer2 >=", value, "multipleChoiceAnswer2");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer2LessThan(String value) {
            addCriterion("Multiple_choice_answer2 <", value, "multipleChoiceAnswer2");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer2LessThanOrEqualTo(String value) {
            addCriterion("Multiple_choice_answer2 <=", value, "multipleChoiceAnswer2");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer2Like(String value) {
            addCriterion("Multiple_choice_answer2 like", value, "multipleChoiceAnswer2");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer2NotLike(String value) {
            addCriterion("Multiple_choice_answer2 not like", value, "multipleChoiceAnswer2");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer2In(List<String> values) {
            addCriterion("Multiple_choice_answer2 in", values, "multipleChoiceAnswer2");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer2NotIn(List<String> values) {
            addCriterion("Multiple_choice_answer2 not in", values, "multipleChoiceAnswer2");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer2Between(String value1, String value2) {
            addCriterion("Multiple_choice_answer2 between", value1, value2, "multipleChoiceAnswer2");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer2NotBetween(String value1, String value2) {
            addCriterion("Multiple_choice_answer2 not between", value1, value2, "multipleChoiceAnswer2");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer3IsNull() {
            addCriterion("Multiple_choice_answer3 is null");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer3IsNotNull() {
            addCriterion("Multiple_choice_answer3 is not null");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer3EqualTo(String value) {
            addCriterion("Multiple_choice_answer3 =", value, "multipleChoiceAnswer3");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer3NotEqualTo(String value) {
            addCriterion("Multiple_choice_answer3 <>", value, "multipleChoiceAnswer3");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer3GreaterThan(String value) {
            addCriterion("Multiple_choice_answer3 >", value, "multipleChoiceAnswer3");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer3GreaterThanOrEqualTo(String value) {
            addCriterion("Multiple_choice_answer3 >=", value, "multipleChoiceAnswer3");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer3LessThan(String value) {
            addCriterion("Multiple_choice_answer3 <", value, "multipleChoiceAnswer3");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer3LessThanOrEqualTo(String value) {
            addCriterion("Multiple_choice_answer3 <=", value, "multipleChoiceAnswer3");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer3Like(String value) {
            addCriterion("Multiple_choice_answer3 like", value, "multipleChoiceAnswer3");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer3NotLike(String value) {
            addCriterion("Multiple_choice_answer3 not like", value, "multipleChoiceAnswer3");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer3In(List<String> values) {
            addCriterion("Multiple_choice_answer3 in", values, "multipleChoiceAnswer3");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer3NotIn(List<String> values) {
            addCriterion("Multiple_choice_answer3 not in", values, "multipleChoiceAnswer3");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer3Between(String value1, String value2) {
            addCriterion("Multiple_choice_answer3 between", value1, value2, "multipleChoiceAnswer3");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer3NotBetween(String value1, String value2) {
            addCriterion("Multiple_choice_answer3 not between", value1, value2, "multipleChoiceAnswer3");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer4IsNull() {
            addCriterion("Multiple_choice_answer4 is null");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer4IsNotNull() {
            addCriterion("Multiple_choice_answer4 is not null");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer4EqualTo(String value) {
            addCriterion("Multiple_choice_answer4 =", value, "multipleChoiceAnswer4");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer4NotEqualTo(String value) {
            addCriterion("Multiple_choice_answer4 <>", value, "multipleChoiceAnswer4");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer4GreaterThan(String value) {
            addCriterion("Multiple_choice_answer4 >", value, "multipleChoiceAnswer4");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer4GreaterThanOrEqualTo(String value) {
            addCriterion("Multiple_choice_answer4 >=", value, "multipleChoiceAnswer4");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer4LessThan(String value) {
            addCriterion("Multiple_choice_answer4 <", value, "multipleChoiceAnswer4");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer4LessThanOrEqualTo(String value) {
            addCriterion("Multiple_choice_answer4 <=", value, "multipleChoiceAnswer4");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer4Like(String value) {
            addCriterion("Multiple_choice_answer4 like", value, "multipleChoiceAnswer4");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer4NotLike(String value) {
            addCriterion("Multiple_choice_answer4 not like", value, "multipleChoiceAnswer4");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer4In(List<String> values) {
            addCriterion("Multiple_choice_answer4 in", values, "multipleChoiceAnswer4");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer4NotIn(List<String> values) {
            addCriterion("Multiple_choice_answer4 not in", values, "multipleChoiceAnswer4");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer4Between(String value1, String value2) {
            addCriterion("Multiple_choice_answer4 between", value1, value2, "multipleChoiceAnswer4");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer4NotBetween(String value1, String value2) {
            addCriterion("Multiple_choice_answer4 not between", value1, value2, "multipleChoiceAnswer4");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer5IsNull() {
            addCriterion("Multiple_choice_answer5 is null");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer5IsNotNull() {
            addCriterion("Multiple_choice_answer5 is not null");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer5EqualTo(String value) {
            addCriterion("Multiple_choice_answer5 =", value, "multipleChoiceAnswer5");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer5NotEqualTo(String value) {
            addCriterion("Multiple_choice_answer5 <>", value, "multipleChoiceAnswer5");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer5GreaterThan(String value) {
            addCriterion("Multiple_choice_answer5 >", value, "multipleChoiceAnswer5");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer5GreaterThanOrEqualTo(String value) {
            addCriterion("Multiple_choice_answer5 >=", value, "multipleChoiceAnswer5");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer5LessThan(String value) {
            addCriterion("Multiple_choice_answer5 <", value, "multipleChoiceAnswer5");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer5LessThanOrEqualTo(String value) {
            addCriterion("Multiple_choice_answer5 <=", value, "multipleChoiceAnswer5");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer5Like(String value) {
            addCriterion("Multiple_choice_answer5 like", value, "multipleChoiceAnswer5");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer5NotLike(String value) {
            addCriterion("Multiple_choice_answer5 not like", value, "multipleChoiceAnswer5");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer5In(List<String> values) {
            addCriterion("Multiple_choice_answer5 in", values, "multipleChoiceAnswer5");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer5NotIn(List<String> values) {
            addCriterion("Multiple_choice_answer5 not in", values, "multipleChoiceAnswer5");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer5Between(String value1, String value2) {
            addCriterion("Multiple_choice_answer5 between", value1, value2, "multipleChoiceAnswer5");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceAnswer5NotBetween(String value1, String value2) {
            addCriterion("Multiple_choice_answer5 not between", value1, value2, "multipleChoiceAnswer5");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceCorrectIsNull() {
            addCriterion("Multiple_choice_correct is null");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceCorrectIsNotNull() {
            addCriterion("Multiple_choice_correct is not null");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceCorrectEqualTo(String value) {
            addCriterion("Multiple_choice_correct =", value, "multipleChoiceCorrect");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceCorrectNotEqualTo(String value) {
            addCriterion("Multiple_choice_correct <>", value, "multipleChoiceCorrect");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceCorrectGreaterThan(String value) {
            addCriterion("Multiple_choice_correct >", value, "multipleChoiceCorrect");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceCorrectGreaterThanOrEqualTo(String value) {
            addCriterion("Multiple_choice_correct >=", value, "multipleChoiceCorrect");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceCorrectLessThan(String value) {
            addCriterion("Multiple_choice_correct <", value, "multipleChoiceCorrect");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceCorrectLessThanOrEqualTo(String value) {
            addCriterion("Multiple_choice_correct <=", value, "multipleChoiceCorrect");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceCorrectLike(String value) {
            addCriterion("Multiple_choice_correct like", value, "multipleChoiceCorrect");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceCorrectNotLike(String value) {
            addCriterion("Multiple_choice_correct not like", value, "multipleChoiceCorrect");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceCorrectIn(List<String> values) {
            addCriterion("Multiple_choice_correct in", values, "multipleChoiceCorrect");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceCorrectNotIn(List<String> values) {
            addCriterion("Multiple_choice_correct not in", values, "multipleChoiceCorrect");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceCorrectBetween(String value1, String value2) {
            addCriterion("Multiple_choice_correct between", value1, value2, "multipleChoiceCorrect");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceCorrectNotBetween(String value1, String value2) {
            addCriterion("Multiple_choice_correct not between", value1, value2, "multipleChoiceCorrect");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceComplexityIsNull() {
            addCriterion("Multiple_choice_complexity is null");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceComplexityIsNotNull() {
            addCriterion("Multiple_choice_complexity is not null");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceComplexityEqualTo(String value) {
            addCriterion("Multiple_choice_complexity =", value, "multipleChoiceComplexity");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceComplexityNotEqualTo(String value) {
            addCriterion("Multiple_choice_complexity <>", value, "multipleChoiceComplexity");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceComplexityGreaterThan(String value) {
            addCriterion("Multiple_choice_complexity >", value, "multipleChoiceComplexity");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceComplexityGreaterThanOrEqualTo(String value) {
            addCriterion("Multiple_choice_complexity >=", value, "multipleChoiceComplexity");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceComplexityLessThan(String value) {
            addCriterion("Multiple_choice_complexity <", value, "multipleChoiceComplexity");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceComplexityLessThanOrEqualTo(String value) {
            addCriterion("Multiple_choice_complexity <=", value, "multipleChoiceComplexity");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceComplexityLike(String value) {
            addCriterion("Multiple_choice_complexity like", value, "multipleChoiceComplexity");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceComplexityNotLike(String value) {
            addCriterion("Multiple_choice_complexity not like", value, "multipleChoiceComplexity");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceComplexityIn(List<String> values) {
            addCriterion("Multiple_choice_complexity in", values, "multipleChoiceComplexity");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceComplexityNotIn(List<String> values) {
            addCriterion("Multiple_choice_complexity not in", values, "multipleChoiceComplexity");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceComplexityBetween(String value1, String value2) {
            addCriterion("Multiple_choice_complexity between", value1, value2, "multipleChoiceComplexity");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceComplexityNotBetween(String value1, String value2) {
            addCriterion("Multiple_choice_complexity not between", value1, value2, "multipleChoiceComplexity");
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