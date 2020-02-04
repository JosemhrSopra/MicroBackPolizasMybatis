package com.aseguradora.microbackpolizas.beans;

import java.util.ArrayList;
import java.util.List;

public class RelPolTomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RelPolTomExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdrelationpolizatomadorIsNull() {
            addCriterion("idRelationPolizaTomador is null");
            return (Criteria) this;
        }

        public Criteria andIdrelationpolizatomadorIsNotNull() {
            addCriterion("idRelationPolizaTomador is not null");
            return (Criteria) this;
        }

        public Criteria andIdrelationpolizatomadorEqualTo(Integer value) {
            addCriterion("idRelationPolizaTomador =", value, "idrelationpolizatomador");
            return (Criteria) this;
        }

        public Criteria andIdrelationpolizatomadorNotEqualTo(Integer value) {
            addCriterion("idRelationPolizaTomador <>", value, "idrelationpolizatomador");
            return (Criteria) this;
        }

        public Criteria andIdrelationpolizatomadorGreaterThan(Integer value) {
            addCriterion("idRelationPolizaTomador >", value, "idrelationpolizatomador");
            return (Criteria) this;
        }

        public Criteria andIdrelationpolizatomadorGreaterThanOrEqualTo(Integer value) {
            addCriterion("idRelationPolizaTomador >=", value, "idrelationpolizatomador");
            return (Criteria) this;
        }

        public Criteria andIdrelationpolizatomadorLessThan(Integer value) {
            addCriterion("idRelationPolizaTomador <", value, "idrelationpolizatomador");
            return (Criteria) this;
        }

        public Criteria andIdrelationpolizatomadorLessThanOrEqualTo(Integer value) {
            addCriterion("idRelationPolizaTomador <=", value, "idrelationpolizatomador");
            return (Criteria) this;
        }

        public Criteria andIdrelationpolizatomadorIn(List<Integer> values) {
            addCriterion("idRelationPolizaTomador in", values, "idrelationpolizatomador");
            return (Criteria) this;
        }

        public Criteria andIdrelationpolizatomadorNotIn(List<Integer> values) {
            addCriterion("idRelationPolizaTomador not in", values, "idrelationpolizatomador");
            return (Criteria) this;
        }

        public Criteria andIdrelationpolizatomadorBetween(Integer value1, Integer value2) {
            addCriterion("idRelationPolizaTomador between", value1, value2, "idrelationpolizatomador");
            return (Criteria) this;
        }

        public Criteria andIdrelationpolizatomadorNotBetween(Integer value1, Integer value2) {
            addCriterion("idRelationPolizaTomador not between", value1, value2, "idrelationpolizatomador");
            return (Criteria) this;
        }

        public Criteria andIdtomadorIsNull() {
            addCriterion("idTomador is null");
            return (Criteria) this;
        }

        public Criteria andIdtomadorIsNotNull() {
            addCriterion("idTomador is not null");
            return (Criteria) this;
        }

        public Criteria andIdtomadorEqualTo(Integer value) {
            addCriterion("idTomador =", value, "idtomador");
            return (Criteria) this;
        }

        public Criteria andIdtomadorNotEqualTo(Integer value) {
            addCriterion("idTomador <>", value, "idtomador");
            return (Criteria) this;
        }

        public Criteria andIdtomadorGreaterThan(Integer value) {
            addCriterion("idTomador >", value, "idtomador");
            return (Criteria) this;
        }

        public Criteria andIdtomadorGreaterThanOrEqualTo(Integer value) {
            addCriterion("idTomador >=", value, "idtomador");
            return (Criteria) this;
        }

        public Criteria andIdtomadorLessThan(Integer value) {
            addCriterion("idTomador <", value, "idtomador");
            return (Criteria) this;
        }

        public Criteria andIdtomadorLessThanOrEqualTo(Integer value) {
            addCriterion("idTomador <=", value, "idtomador");
            return (Criteria) this;
        }

        public Criteria andIdtomadorIn(List<Integer> values) {
            addCriterion("idTomador in", values, "idtomador");
            return (Criteria) this;
        }

        public Criteria andIdtomadorNotIn(List<Integer> values) {
            addCriterion("idTomador not in", values, "idtomador");
            return (Criteria) this;
        }

        public Criteria andIdtomadorBetween(Integer value1, Integer value2) {
            addCriterion("idTomador between", value1, value2, "idtomador");
            return (Criteria) this;
        }

        public Criteria andIdtomadorNotBetween(Integer value1, Integer value2) {
            addCriterion("idTomador not between", value1, value2, "idtomador");
            return (Criteria) this;
        }

        public Criteria andIdpolizaIsNull() {
            addCriterion("idPoliza is null");
            return (Criteria) this;
        }

        public Criteria andIdpolizaIsNotNull() {
            addCriterion("idPoliza is not null");
            return (Criteria) this;
        }

        public Criteria andIdpolizaEqualTo(Integer value) {
            addCriterion("idPoliza =", value, "idpoliza");
            return (Criteria) this;
        }

        public Criteria andIdpolizaNotEqualTo(Integer value) {
            addCriterion("idPoliza <>", value, "idpoliza");
            return (Criteria) this;
        }

        public Criteria andIdpolizaGreaterThan(Integer value) {
            addCriterion("idPoliza >", value, "idpoliza");
            return (Criteria) this;
        }

        public Criteria andIdpolizaGreaterThanOrEqualTo(Integer value) {
            addCriterion("idPoliza >=", value, "idpoliza");
            return (Criteria) this;
        }

        public Criteria andIdpolizaLessThan(Integer value) {
            addCriterion("idPoliza <", value, "idpoliza");
            return (Criteria) this;
        }

        public Criteria andIdpolizaLessThanOrEqualTo(Integer value) {
            addCriterion("idPoliza <=", value, "idpoliza");
            return (Criteria) this;
        }

        public Criteria andIdpolizaIn(List<Integer> values) {
            addCriterion("idPoliza in", values, "idpoliza");
            return (Criteria) this;
        }

        public Criteria andIdpolizaNotIn(List<Integer> values) {
            addCriterion("idPoliza not in", values, "idpoliza");
            return (Criteria) this;
        }

        public Criteria andIdpolizaBetween(Integer value1, Integer value2) {
            addCriterion("idPoliza between", value1, value2, "idpoliza");
            return (Criteria) this;
        }

        public Criteria andIdpolizaNotBetween(Integer value1, Integer value2) {
            addCriterion("idPoliza not between", value1, value2, "idpoliza");
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