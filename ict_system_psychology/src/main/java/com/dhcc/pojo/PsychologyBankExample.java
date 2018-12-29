package com.dhcc.pojo;

import java.util.ArrayList;
import java.util.List;

public class PsychologyBankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PsychologyBankExample() {
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

        public Criteria andNum1IsNull() {
            addCriterion("num1 is null");
            return (Criteria) this;
        }

        public Criteria andNum1IsNotNull() {
            addCriterion("num1 is not null");
            return (Criteria) this;
        }

        public Criteria andNum1EqualTo(String value) {
            addCriterion("num1 =", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1NotEqualTo(String value) {
            addCriterion("num1 <>", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1GreaterThan(String value) {
            addCriterion("num1 >", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1GreaterThanOrEqualTo(String value) {
            addCriterion("num1 >=", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1LessThan(String value) {
            addCriterion("num1 <", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1LessThanOrEqualTo(String value) {
            addCriterion("num1 <=", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1Like(String value) {
            addCriterion("num1 like", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1NotLike(String value) {
            addCriterion("num1 not like", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1In(List<String> values) {
            addCriterion("num1 in", values, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1NotIn(List<String> values) {
            addCriterion("num1 not in", values, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1Between(String value1, String value2) {
            addCriterion("num1 between", value1, value2, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1NotBetween(String value1, String value2) {
            addCriterion("num1 not between", value1, value2, "num1");
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

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andAnswer1IsNull() {
            addCriterion("answer1 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer1IsNotNull() {
            addCriterion("answer1 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer1EqualTo(String value) {
            addCriterion("answer1 =", value, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1NotEqualTo(String value) {
            addCriterion("answer1 <>", value, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1GreaterThan(String value) {
            addCriterion("answer1 >", value, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1GreaterThanOrEqualTo(String value) {
            addCriterion("answer1 >=", value, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1LessThan(String value) {
            addCriterion("answer1 <", value, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1LessThanOrEqualTo(String value) {
            addCriterion("answer1 <=", value, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1Like(String value) {
            addCriterion("answer1 like", value, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1NotLike(String value) {
            addCriterion("answer1 not like", value, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1In(List<String> values) {
            addCriterion("answer1 in", values, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1NotIn(List<String> values) {
            addCriterion("answer1 not in", values, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1Between(String value1, String value2) {
            addCriterion("answer1 between", value1, value2, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1NotBetween(String value1, String value2) {
            addCriterion("answer1 not between", value1, value2, "answer1");
            return (Criteria) this;
        }

        public Criteria andScore1IsNull() {
            addCriterion("score1 is null");
            return (Criteria) this;
        }

        public Criteria andScore1IsNotNull() {
            addCriterion("score1 is not null");
            return (Criteria) this;
        }

        public Criteria andScore1EqualTo(String value) {
            addCriterion("score1 =", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotEqualTo(String value) {
            addCriterion("score1 <>", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1GreaterThan(String value) {
            addCriterion("score1 >", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1GreaterThanOrEqualTo(String value) {
            addCriterion("score1 >=", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1LessThan(String value) {
            addCriterion("score1 <", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1LessThanOrEqualTo(String value) {
            addCriterion("score1 <=", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1Like(String value) {
            addCriterion("score1 like", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotLike(String value) {
            addCriterion("score1 not like", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1In(List<String> values) {
            addCriterion("score1 in", values, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotIn(List<String> values) {
            addCriterion("score1 not in", values, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1Between(String value1, String value2) {
            addCriterion("score1 between", value1, value2, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotBetween(String value1, String value2) {
            addCriterion("score1 not between", value1, value2, "score1");
            return (Criteria) this;
        }

        public Criteria andAnswer2IsNull() {
            addCriterion("answer2 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer2IsNotNull() {
            addCriterion("answer2 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer2EqualTo(String value) {
            addCriterion("answer2 =", value, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2NotEqualTo(String value) {
            addCriterion("answer2 <>", value, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2GreaterThan(String value) {
            addCriterion("answer2 >", value, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2GreaterThanOrEqualTo(String value) {
            addCriterion("answer2 >=", value, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2LessThan(String value) {
            addCriterion("answer2 <", value, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2LessThanOrEqualTo(String value) {
            addCriterion("answer2 <=", value, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2Like(String value) {
            addCriterion("answer2 like", value, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2NotLike(String value) {
            addCriterion("answer2 not like", value, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2In(List<String> values) {
            addCriterion("answer2 in", values, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2NotIn(List<String> values) {
            addCriterion("answer2 not in", values, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2Between(String value1, String value2) {
            addCriterion("answer2 between", value1, value2, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2NotBetween(String value1, String value2) {
            addCriterion("answer2 not between", value1, value2, "answer2");
            return (Criteria) this;
        }

        public Criteria andScore2IsNull() {
            addCriterion("score2 is null");
            return (Criteria) this;
        }

        public Criteria andScore2IsNotNull() {
            addCriterion("score2 is not null");
            return (Criteria) this;
        }

        public Criteria andScore2EqualTo(String value) {
            addCriterion("score2 =", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotEqualTo(String value) {
            addCriterion("score2 <>", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2GreaterThan(String value) {
            addCriterion("score2 >", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2GreaterThanOrEqualTo(String value) {
            addCriterion("score2 >=", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2LessThan(String value) {
            addCriterion("score2 <", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2LessThanOrEqualTo(String value) {
            addCriterion("score2 <=", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2Like(String value) {
            addCriterion("score2 like", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotLike(String value) {
            addCriterion("score2 not like", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2In(List<String> values) {
            addCriterion("score2 in", values, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotIn(List<String> values) {
            addCriterion("score2 not in", values, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2Between(String value1, String value2) {
            addCriterion("score2 between", value1, value2, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotBetween(String value1, String value2) {
            addCriterion("score2 not between", value1, value2, "score2");
            return (Criteria) this;
        }

        public Criteria andAnswer3IsNull() {
            addCriterion("answer3 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer3IsNotNull() {
            addCriterion("answer3 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer3EqualTo(String value) {
            addCriterion("answer3 =", value, "answer3");
            return (Criteria) this;
        }

        public Criteria andAnswer3NotEqualTo(String value) {
            addCriterion("answer3 <>", value, "answer3");
            return (Criteria) this;
        }

        public Criteria andAnswer3GreaterThan(String value) {
            addCriterion("answer3 >", value, "answer3");
            return (Criteria) this;
        }

        public Criteria andAnswer3GreaterThanOrEqualTo(String value) {
            addCriterion("answer3 >=", value, "answer3");
            return (Criteria) this;
        }

        public Criteria andAnswer3LessThan(String value) {
            addCriterion("answer3 <", value, "answer3");
            return (Criteria) this;
        }

        public Criteria andAnswer3LessThanOrEqualTo(String value) {
            addCriterion("answer3 <=", value, "answer3");
            return (Criteria) this;
        }

        public Criteria andAnswer3Like(String value) {
            addCriterion("answer3 like", value, "answer3");
            return (Criteria) this;
        }

        public Criteria andAnswer3NotLike(String value) {
            addCriterion("answer3 not like", value, "answer3");
            return (Criteria) this;
        }

        public Criteria andAnswer3In(List<String> values) {
            addCriterion("answer3 in", values, "answer3");
            return (Criteria) this;
        }

        public Criteria andAnswer3NotIn(List<String> values) {
            addCriterion("answer3 not in", values, "answer3");
            return (Criteria) this;
        }

        public Criteria andAnswer3Between(String value1, String value2) {
            addCriterion("answer3 between", value1, value2, "answer3");
            return (Criteria) this;
        }

        public Criteria andAnswer3NotBetween(String value1, String value2) {
            addCriterion("answer3 not between", value1, value2, "answer3");
            return (Criteria) this;
        }

        public Criteria andScore3IsNull() {
            addCriterion("score3 is null");
            return (Criteria) this;
        }

        public Criteria andScore3IsNotNull() {
            addCriterion("score3 is not null");
            return (Criteria) this;
        }

        public Criteria andScore3EqualTo(String value) {
            addCriterion("score3 =", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotEqualTo(String value) {
            addCriterion("score3 <>", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3GreaterThan(String value) {
            addCriterion("score3 >", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3GreaterThanOrEqualTo(String value) {
            addCriterion("score3 >=", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3LessThan(String value) {
            addCriterion("score3 <", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3LessThanOrEqualTo(String value) {
            addCriterion("score3 <=", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3Like(String value) {
            addCriterion("score3 like", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotLike(String value) {
            addCriterion("score3 not like", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3In(List<String> values) {
            addCriterion("score3 in", values, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotIn(List<String> values) {
            addCriterion("score3 not in", values, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3Between(String value1, String value2) {
            addCriterion("score3 between", value1, value2, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotBetween(String value1, String value2) {
            addCriterion("score3 not between", value1, value2, "score3");
            return (Criteria) this;
        }

        public Criteria andAnswer4IsNull() {
            addCriterion("answer4 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer4IsNotNull() {
            addCriterion("answer4 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer4EqualTo(String value) {
            addCriterion("answer4 =", value, "answer4");
            return (Criteria) this;
        }

        public Criteria andAnswer4NotEqualTo(String value) {
            addCriterion("answer4 <>", value, "answer4");
            return (Criteria) this;
        }

        public Criteria andAnswer4GreaterThan(String value) {
            addCriterion("answer4 >", value, "answer4");
            return (Criteria) this;
        }

        public Criteria andAnswer4GreaterThanOrEqualTo(String value) {
            addCriterion("answer4 >=", value, "answer4");
            return (Criteria) this;
        }

        public Criteria andAnswer4LessThan(String value) {
            addCriterion("answer4 <", value, "answer4");
            return (Criteria) this;
        }

        public Criteria andAnswer4LessThanOrEqualTo(String value) {
            addCriterion("answer4 <=", value, "answer4");
            return (Criteria) this;
        }

        public Criteria andAnswer4Like(String value) {
            addCriterion("answer4 like", value, "answer4");
            return (Criteria) this;
        }

        public Criteria andAnswer4NotLike(String value) {
            addCriterion("answer4 not like", value, "answer4");
            return (Criteria) this;
        }

        public Criteria andAnswer4In(List<String> values) {
            addCriterion("answer4 in", values, "answer4");
            return (Criteria) this;
        }

        public Criteria andAnswer4NotIn(List<String> values) {
            addCriterion("answer4 not in", values, "answer4");
            return (Criteria) this;
        }

        public Criteria andAnswer4Between(String value1, String value2) {
            addCriterion("answer4 between", value1, value2, "answer4");
            return (Criteria) this;
        }

        public Criteria andAnswer4NotBetween(String value1, String value2) {
            addCriterion("answer4 not between", value1, value2, "answer4");
            return (Criteria) this;
        }

        public Criteria andScore4IsNull() {
            addCriterion("score4 is null");
            return (Criteria) this;
        }

        public Criteria andScore4IsNotNull() {
            addCriterion("score4 is not null");
            return (Criteria) this;
        }

        public Criteria andScore4EqualTo(String value) {
            addCriterion("score4 =", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4NotEqualTo(String value) {
            addCriterion("score4 <>", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4GreaterThan(String value) {
            addCriterion("score4 >", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4GreaterThanOrEqualTo(String value) {
            addCriterion("score4 >=", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4LessThan(String value) {
            addCriterion("score4 <", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4LessThanOrEqualTo(String value) {
            addCriterion("score4 <=", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4Like(String value) {
            addCriterion("score4 like", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4NotLike(String value) {
            addCriterion("score4 not like", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4In(List<String> values) {
            addCriterion("score4 in", values, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4NotIn(List<String> values) {
            addCriterion("score4 not in", values, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4Between(String value1, String value2) {
            addCriterion("score4 between", value1, value2, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4NotBetween(String value1, String value2) {
            addCriterion("score4 not between", value1, value2, "score4");
            return (Criteria) this;
        }

        public Criteria andAnswer5IsNull() {
            addCriterion("answer5 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer5IsNotNull() {
            addCriterion("answer5 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer5EqualTo(String value) {
            addCriterion("answer5 =", value, "answer5");
            return (Criteria) this;
        }

        public Criteria andAnswer5NotEqualTo(String value) {
            addCriterion("answer5 <>", value, "answer5");
            return (Criteria) this;
        }

        public Criteria andAnswer5GreaterThan(String value) {
            addCriterion("answer5 >", value, "answer5");
            return (Criteria) this;
        }

        public Criteria andAnswer5GreaterThanOrEqualTo(String value) {
            addCriterion("answer5 >=", value, "answer5");
            return (Criteria) this;
        }

        public Criteria andAnswer5LessThan(String value) {
            addCriterion("answer5 <", value, "answer5");
            return (Criteria) this;
        }

        public Criteria andAnswer5LessThanOrEqualTo(String value) {
            addCriterion("answer5 <=", value, "answer5");
            return (Criteria) this;
        }

        public Criteria andAnswer5Like(String value) {
            addCriterion("answer5 like", value, "answer5");
            return (Criteria) this;
        }

        public Criteria andAnswer5NotLike(String value) {
            addCriterion("answer5 not like", value, "answer5");
            return (Criteria) this;
        }

        public Criteria andAnswer5In(List<String> values) {
            addCriterion("answer5 in", values, "answer5");
            return (Criteria) this;
        }

        public Criteria andAnswer5NotIn(List<String> values) {
            addCriterion("answer5 not in", values, "answer5");
            return (Criteria) this;
        }

        public Criteria andAnswer5Between(String value1, String value2) {
            addCriterion("answer5 between", value1, value2, "answer5");
            return (Criteria) this;
        }

        public Criteria andAnswer5NotBetween(String value1, String value2) {
            addCriterion("answer5 not between", value1, value2, "answer5");
            return (Criteria) this;
        }

        public Criteria andScore5IsNull() {
            addCriterion("score5 is null");
            return (Criteria) this;
        }

        public Criteria andScore5IsNotNull() {
            addCriterion("score5 is not null");
            return (Criteria) this;
        }

        public Criteria andScore5EqualTo(String value) {
            addCriterion("score5 =", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5NotEqualTo(String value) {
            addCriterion("score5 <>", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5GreaterThan(String value) {
            addCriterion("score5 >", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5GreaterThanOrEqualTo(String value) {
            addCriterion("score5 >=", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5LessThan(String value) {
            addCriterion("score5 <", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5LessThanOrEqualTo(String value) {
            addCriterion("score5 <=", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5Like(String value) {
            addCriterion("score5 like", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5NotLike(String value) {
            addCriterion("score5 not like", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5In(List<String> values) {
            addCriterion("score5 in", values, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5NotIn(List<String> values) {
            addCriterion("score5 not in", values, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5Between(String value1, String value2) {
            addCriterion("score5 between", value1, value2, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5NotBetween(String value1, String value2) {
            addCriterion("score5 not between", value1, value2, "score5");
            return (Criteria) this;
        }

        public Criteria andAnswer6IsNull() {
            addCriterion("answer6 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer6IsNotNull() {
            addCriterion("answer6 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer6EqualTo(String value) {
            addCriterion("answer6 =", value, "answer6");
            return (Criteria) this;
        }

        public Criteria andAnswer6NotEqualTo(String value) {
            addCriterion("answer6 <>", value, "answer6");
            return (Criteria) this;
        }

        public Criteria andAnswer6GreaterThan(String value) {
            addCriterion("answer6 >", value, "answer6");
            return (Criteria) this;
        }

        public Criteria andAnswer6GreaterThanOrEqualTo(String value) {
            addCriterion("answer6 >=", value, "answer6");
            return (Criteria) this;
        }

        public Criteria andAnswer6LessThan(String value) {
            addCriterion("answer6 <", value, "answer6");
            return (Criteria) this;
        }

        public Criteria andAnswer6LessThanOrEqualTo(String value) {
            addCriterion("answer6 <=", value, "answer6");
            return (Criteria) this;
        }

        public Criteria andAnswer6Like(String value) {
            addCriterion("answer6 like", value, "answer6");
            return (Criteria) this;
        }

        public Criteria andAnswer6NotLike(String value) {
            addCriterion("answer6 not like", value, "answer6");
            return (Criteria) this;
        }

        public Criteria andAnswer6In(List<String> values) {
            addCriterion("answer6 in", values, "answer6");
            return (Criteria) this;
        }

        public Criteria andAnswer6NotIn(List<String> values) {
            addCriterion("answer6 not in", values, "answer6");
            return (Criteria) this;
        }

        public Criteria andAnswer6Between(String value1, String value2) {
            addCriterion("answer6 between", value1, value2, "answer6");
            return (Criteria) this;
        }

        public Criteria andAnswer6NotBetween(String value1, String value2) {
            addCriterion("answer6 not between", value1, value2, "answer6");
            return (Criteria) this;
        }

        public Criteria andScore6IsNull() {
            addCriterion("score6 is null");
            return (Criteria) this;
        }

        public Criteria andScore6IsNotNull() {
            addCriterion("score6 is not null");
            return (Criteria) this;
        }

        public Criteria andScore6EqualTo(String value) {
            addCriterion("score6 =", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6NotEqualTo(String value) {
            addCriterion("score6 <>", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6GreaterThan(String value) {
            addCriterion("score6 >", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6GreaterThanOrEqualTo(String value) {
            addCriterion("score6 >=", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6LessThan(String value) {
            addCriterion("score6 <", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6LessThanOrEqualTo(String value) {
            addCriterion("score6 <=", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6Like(String value) {
            addCriterion("score6 like", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6NotLike(String value) {
            addCriterion("score6 not like", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6In(List<String> values) {
            addCriterion("score6 in", values, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6NotIn(List<String> values) {
            addCriterion("score6 not in", values, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6Between(String value1, String value2) {
            addCriterion("score6 between", value1, value2, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6NotBetween(String value1, String value2) {
            addCriterion("score6 not between", value1, value2, "score6");
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