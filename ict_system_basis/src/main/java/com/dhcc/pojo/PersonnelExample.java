package com.dhcc.pojo;

import java.util.ArrayList;
import java.util.List;

public class PersonnelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonnelExample() {
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

        public Criteria andUnameIsNull() {
            addCriterion("uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andUnumberIsNull() {
            addCriterion("unumber is null");
            return (Criteria) this;
        }

        public Criteria andUnumberIsNotNull() {
            addCriterion("unumber is not null");
            return (Criteria) this;
        }

        public Criteria andUnumberEqualTo(String value) {
            addCriterion("unumber =", value, "unumber");
            return (Criteria) this;
        }

        public Criteria andUnumberNotEqualTo(String value) {
            addCriterion("unumber <>", value, "unumber");
            return (Criteria) this;
        }

        public Criteria andUnumberGreaterThan(String value) {
            addCriterion("unumber >", value, "unumber");
            return (Criteria) this;
        }

        public Criteria andUnumberGreaterThanOrEqualTo(String value) {
            addCriterion("unumber >=", value, "unumber");
            return (Criteria) this;
        }

        public Criteria andUnumberLessThan(String value) {
            addCriterion("unumber <", value, "unumber");
            return (Criteria) this;
        }

        public Criteria andUnumberLessThanOrEqualTo(String value) {
            addCriterion("unumber <=", value, "unumber");
            return (Criteria) this;
        }

        public Criteria andUnumberLike(String value) {
            addCriterion("unumber like", value, "unumber");
            return (Criteria) this;
        }

        public Criteria andUnumberNotLike(String value) {
            addCriterion("unumber not like", value, "unumber");
            return (Criteria) this;
        }

        public Criteria andUnumberIn(List<String> values) {
            addCriterion("unumber in", values, "unumber");
            return (Criteria) this;
        }

        public Criteria andUnumberNotIn(List<String> values) {
            addCriterion("unumber not in", values, "unumber");
            return (Criteria) this;
        }

        public Criteria andUnumberBetween(String value1, String value2) {
            addCriterion("unumber between", value1, value2, "unumber");
            return (Criteria) this;
        }

        public Criteria andUnumberNotBetween(String value1, String value2) {
            addCriterion("unumber not between", value1, value2, "unumber");
            return (Criteria) this;
        }

        public Criteria andUroleIsNull() {
            addCriterion("urole is null");
            return (Criteria) this;
        }

        public Criteria andUroleIsNotNull() {
            addCriterion("urole is not null");
            return (Criteria) this;
        }

        public Criteria andUroleEqualTo(String value) {
            addCriterion("urole =", value, "urole");
            return (Criteria) this;
        }

        public Criteria andUroleNotEqualTo(String value) {
            addCriterion("urole <>", value, "urole");
            return (Criteria) this;
        }

        public Criteria andUroleGreaterThan(String value) {
            addCriterion("urole >", value, "urole");
            return (Criteria) this;
        }

        public Criteria andUroleGreaterThanOrEqualTo(String value) {
            addCriterion("urole >=", value, "urole");
            return (Criteria) this;
        }

        public Criteria andUroleLessThan(String value) {
            addCriterion("urole <", value, "urole");
            return (Criteria) this;
        }

        public Criteria andUroleLessThanOrEqualTo(String value) {
            addCriterion("urole <=", value, "urole");
            return (Criteria) this;
        }

        public Criteria andUroleLike(String value) {
            addCriterion("urole like", value, "urole");
            return (Criteria) this;
        }

        public Criteria andUroleNotLike(String value) {
            addCriterion("urole not like", value, "urole");
            return (Criteria) this;
        }

        public Criteria andUroleIn(List<String> values) {
            addCriterion("urole in", values, "urole");
            return (Criteria) this;
        }

        public Criteria andUroleNotIn(List<String> values) {
            addCriterion("urole not in", values, "urole");
            return (Criteria) this;
        }

        public Criteria andUroleBetween(String value1, String value2) {
            addCriterion("urole between", value1, value2, "urole");
            return (Criteria) this;
        }

        public Criteria andUroleNotBetween(String value1, String value2) {
            addCriterion("urole not between", value1, value2, "urole");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIsNull() {
            addCriterion("Jurisdiction is null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIsNotNull() {
            addCriterion("Jurisdiction is not null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionEqualTo(String value) {
            addCriterion("Jurisdiction =", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNotEqualTo(String value) {
            addCriterion("Jurisdiction <>", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionGreaterThan(String value) {
            addCriterion("Jurisdiction >", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionGreaterThanOrEqualTo(String value) {
            addCriterion("Jurisdiction >=", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionLessThan(String value) {
            addCriterion("Jurisdiction <", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionLessThanOrEqualTo(String value) {
            addCriterion("Jurisdiction <=", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionLike(String value) {
            addCriterion("Jurisdiction like", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNotLike(String value) {
            addCriterion("Jurisdiction not like", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIn(List<String> values) {
            addCriterion("Jurisdiction in", values, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNotIn(List<String> values) {
            addCriterion("Jurisdiction not in", values, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionBetween(String value1, String value2) {
            addCriterion("Jurisdiction between", value1, value2, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNotBetween(String value1, String value2) {
            addCriterion("Jurisdiction not between", value1, value2, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("post is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("post is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("post =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("post <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("post >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("post >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("post <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("post <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("post like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("post not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("post in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("post not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("post between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("post not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andElectronicresumeIsNull() {
            addCriterion("ElectronicResume is null");
            return (Criteria) this;
        }

        public Criteria andElectronicresumeIsNotNull() {
            addCriterion("ElectronicResume is not null");
            return (Criteria) this;
        }

        public Criteria andElectronicresumeEqualTo(String value) {
            addCriterion("ElectronicResume =", value, "electronicresume");
            return (Criteria) this;
        }

        public Criteria andElectronicresumeNotEqualTo(String value) {
            addCriterion("ElectronicResume <>", value, "electronicresume");
            return (Criteria) this;
        }

        public Criteria andElectronicresumeGreaterThan(String value) {
            addCriterion("ElectronicResume >", value, "electronicresume");
            return (Criteria) this;
        }

        public Criteria andElectronicresumeGreaterThanOrEqualTo(String value) {
            addCriterion("ElectronicResume >=", value, "electronicresume");
            return (Criteria) this;
        }

        public Criteria andElectronicresumeLessThan(String value) {
            addCriterion("ElectronicResume <", value, "electronicresume");
            return (Criteria) this;
        }

        public Criteria andElectronicresumeLessThanOrEqualTo(String value) {
            addCriterion("ElectronicResume <=", value, "electronicresume");
            return (Criteria) this;
        }

        public Criteria andElectronicresumeLike(String value) {
            addCriterion("ElectronicResume like", value, "electronicresume");
            return (Criteria) this;
        }

        public Criteria andElectronicresumeNotLike(String value) {
            addCriterion("ElectronicResume not like", value, "electronicresume");
            return (Criteria) this;
        }

        public Criteria andElectronicresumeIn(List<String> values) {
            addCriterion("ElectronicResume in", values, "electronicresume");
            return (Criteria) this;
        }

        public Criteria andElectronicresumeNotIn(List<String> values) {
            addCriterion("ElectronicResume not in", values, "electronicresume");
            return (Criteria) this;
        }

        public Criteria andElectronicresumeBetween(String value1, String value2) {
            addCriterion("ElectronicResume between", value1, value2, "electronicresume");
            return (Criteria) this;
        }

        public Criteria andElectronicresumeNotBetween(String value1, String value2) {
            addCriterion("ElectronicResume not between", value1, value2, "electronicresume");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeIsNull() {
            addCriterion("Registrationtime is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeIsNotNull() {
            addCriterion("Registrationtime is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeEqualTo(String value) {
            addCriterion("Registrationtime =", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeNotEqualTo(String value) {
            addCriterion("Registrationtime <>", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeGreaterThan(String value) {
            addCriterion("Registrationtime >", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeGreaterThanOrEqualTo(String value) {
            addCriterion("Registrationtime >=", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeLessThan(String value) {
            addCriterion("Registrationtime <", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeLessThanOrEqualTo(String value) {
            addCriterion("Registrationtime <=", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeLike(String value) {
            addCriterion("Registrationtime like", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeNotLike(String value) {
            addCriterion("Registrationtime not like", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeIn(List<String> values) {
            addCriterion("Registrationtime in", values, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeNotIn(List<String> values) {
            addCriterion("Registrationtime not in", values, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeBetween(String value1, String value2) {
            addCriterion("Registrationtime between", value1, value2, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeNotBetween(String value1, String value2) {
            addCriterion("Registrationtime not between", value1, value2, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeIsNull() {
            addCriterion("PersonInCharge is null");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeIsNotNull() {
            addCriterion("PersonInCharge is not null");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeEqualTo(String value) {
            addCriterion("PersonInCharge =", value, "personincharge");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeNotEqualTo(String value) {
            addCriterion("PersonInCharge <>", value, "personincharge");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeGreaterThan(String value) {
            addCriterion("PersonInCharge >", value, "personincharge");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeGreaterThanOrEqualTo(String value) {
            addCriterion("PersonInCharge >=", value, "personincharge");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeLessThan(String value) {
            addCriterion("PersonInCharge <", value, "personincharge");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeLessThanOrEqualTo(String value) {
            addCriterion("PersonInCharge <=", value, "personincharge");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeLike(String value) {
            addCriterion("PersonInCharge like", value, "personincharge");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeNotLike(String value) {
            addCriterion("PersonInCharge not like", value, "personincharge");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeIn(List<String> values) {
            addCriterion("PersonInCharge in", values, "personincharge");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeNotIn(List<String> values) {
            addCriterion("PersonInCharge not in", values, "personincharge");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeBetween(String value1, String value2) {
            addCriterion("PersonInCharge between", value1, value2, "personincharge");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeNotBetween(String value1, String value2) {
            addCriterion("PersonInCharge not between", value1, value2, "personincharge");
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