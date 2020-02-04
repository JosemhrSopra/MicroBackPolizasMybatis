package com.aseguradora.microbackpolizas.beans;

import java.util.ArrayList;
import java.util.List;

public class PolizaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PolizaExample() {
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

        public Criteria andNumpolizaIsNull() {
            addCriterion("numPoliza is null");
            return (Criteria) this;
        }

        public Criteria andNumpolizaIsNotNull() {
            addCriterion("numPoliza is not null");
            return (Criteria) this;
        }

        public Criteria andNumpolizaEqualTo(Integer value) {
            addCriterion("numPoliza =", value, "numpoliza");
            return (Criteria) this;
        }

        public Criteria andNumpolizaNotEqualTo(Integer value) {
            addCriterion("numPoliza <>", value, "numpoliza");
            return (Criteria) this;
        }

        public Criteria andNumpolizaGreaterThan(Integer value) {
            addCriterion("numPoliza >", value, "numpoliza");
            return (Criteria) this;
        }

        public Criteria andNumpolizaGreaterThanOrEqualTo(Integer value) {
            addCriterion("numPoliza >=", value, "numpoliza");
            return (Criteria) this;
        }

        public Criteria andNumpolizaLessThan(Integer value) {
            addCriterion("numPoliza <", value, "numpoliza");
            return (Criteria) this;
        }

        public Criteria andNumpolizaLessThanOrEqualTo(Integer value) {
            addCriterion("numPoliza <=", value, "numpoliza");
            return (Criteria) this;
        }

        public Criteria andNumpolizaIn(List<Integer> values) {
            addCriterion("numPoliza in", values, "numpoliza");
            return (Criteria) this;
        }

        public Criteria andNumpolizaNotIn(List<Integer> values) {
            addCriterion("numPoliza not in", values, "numpoliza");
            return (Criteria) this;
        }

        public Criteria andNumpolizaBetween(Integer value1, Integer value2) {
            addCriterion("numPoliza between", value1, value2, "numpoliza");
            return (Criteria) this;
        }

        public Criteria andNumpolizaNotBetween(Integer value1, Integer value2) {
            addCriterion("numPoliza not between", value1, value2, "numpoliza");
            return (Criteria) this;
        }

        public Criteria andNumsupIsNull() {
            addCriterion("numSup is null");
            return (Criteria) this;
        }

        public Criteria andNumsupIsNotNull() {
            addCriterion("numSup is not null");
            return (Criteria) this;
        }

        public Criteria andNumsupEqualTo(Integer value) {
            addCriterion("numSup =", value, "numsup");
            return (Criteria) this;
        }

        public Criteria andNumsupNotEqualTo(Integer value) {
            addCriterion("numSup <>", value, "numsup");
            return (Criteria) this;
        }

        public Criteria andNumsupGreaterThan(Integer value) {
            addCriterion("numSup >", value, "numsup");
            return (Criteria) this;
        }

        public Criteria andNumsupGreaterThanOrEqualTo(Integer value) {
            addCriterion("numSup >=", value, "numsup");
            return (Criteria) this;
        }

        public Criteria andNumsupLessThan(Integer value) {
            addCriterion("numSup <", value, "numsup");
            return (Criteria) this;
        }

        public Criteria andNumsupLessThanOrEqualTo(Integer value) {
            addCriterion("numSup <=", value, "numsup");
            return (Criteria) this;
        }

        public Criteria andNumsupIn(List<Integer> values) {
            addCriterion("numSup in", values, "numsup");
            return (Criteria) this;
        }

        public Criteria andNumsupNotIn(List<Integer> values) {
            addCriterion("numSup not in", values, "numsup");
            return (Criteria) this;
        }

        public Criteria andNumsupBetween(Integer value1, Integer value2) {
            addCriterion("numSup between", value1, value2, "numsup");
            return (Criteria) this;
        }

        public Criteria andNumsupNotBetween(Integer value1, Integer value2) {
            addCriterion("numSup not between", value1, value2, "numsup");
            return (Criteria) this;
        }

        public Criteria andIdproductoIsNull() {
            addCriterion("idProducto is null");
            return (Criteria) this;
        }

        public Criteria andIdproductoIsNotNull() {
            addCriterion("idProducto is not null");
            return (Criteria) this;
        }

        public Criteria andIdproductoEqualTo(Integer value) {
            addCriterion("idProducto =", value, "idproducto");
            return (Criteria) this;
        }

        public Criteria andIdproductoNotEqualTo(Integer value) {
            addCriterion("idProducto <>", value, "idproducto");
            return (Criteria) this;
        }

        public Criteria andIdproductoGreaterThan(Integer value) {
            addCriterion("idProducto >", value, "idproducto");
            return (Criteria) this;
        }

        public Criteria andIdproductoGreaterThanOrEqualTo(Integer value) {
            addCriterion("idProducto >=", value, "idproducto");
            return (Criteria) this;
        }

        public Criteria andIdproductoLessThan(Integer value) {
            addCriterion("idProducto <", value, "idproducto");
            return (Criteria) this;
        }

        public Criteria andIdproductoLessThanOrEqualTo(Integer value) {
            addCriterion("idProducto <=", value, "idproducto");
            return (Criteria) this;
        }

        public Criteria andIdproductoIn(List<Integer> values) {
            addCriterion("idProducto in", values, "idproducto");
            return (Criteria) this;
        }

        public Criteria andIdproductoNotIn(List<Integer> values) {
            addCriterion("idProducto not in", values, "idproducto");
            return (Criteria) this;
        }

        public Criteria andIdproductoBetween(Integer value1, Integer value2) {
            addCriterion("idProducto between", value1, value2, "idproducto");
            return (Criteria) this;
        }

        public Criteria andIdproductoNotBetween(Integer value1, Integer value2) {
            addCriterion("idProducto not between", value1, value2, "idproducto");
            return (Criteria) this;
        }

        public Criteria andEstadoIsNull() {
            addCriterion("estado is null");
            return (Criteria) this;
        }

        public Criteria andEstadoIsNotNull() {
            addCriterion("estado is not null");
            return (Criteria) this;
        }

        public Criteria andEstadoEqualTo(String value) {
            addCriterion("estado =", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotEqualTo(String value) {
            addCriterion("estado <>", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoGreaterThan(String value) {
            addCriterion("estado >", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoGreaterThanOrEqualTo(String value) {
            addCriterion("estado >=", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoLessThan(String value) {
            addCriterion("estado <", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoLessThanOrEqualTo(String value) {
            addCriterion("estado <=", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoLike(String value) {
            addCriterion("estado like", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotLike(String value) {
            addCriterion("estado not like", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoIn(List<String> values) {
            addCriterion("estado in", values, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotIn(List<String> values) {
            addCriterion("estado not in", values, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoBetween(String value1, String value2) {
            addCriterion("estado between", value1, value2, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotBetween(String value1, String value2) {
            addCriterion("estado not between", value1, value2, "estado");
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