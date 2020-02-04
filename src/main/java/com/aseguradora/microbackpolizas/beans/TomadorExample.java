package com.aseguradora.microbackpolizas.beans;

import java.util.ArrayList;
import java.util.List;

public class TomadorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TomadorExample() {
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

        public Criteria andIdtomadorIsNull() {
            addCriterion("idtomador is null");
            return (Criteria) this;
        }

        public Criteria andIdtomadorIsNotNull() {
            addCriterion("idtomador is not null");
            return (Criteria) this;
        }

        public Criteria andIdtomadorEqualTo(Integer value) {
            addCriterion("idtomador =", value, "idtomador");
            return (Criteria) this;
        }

        public Criteria andIdtomadorNotEqualTo(Integer value) {
            addCriterion("idtomador <>", value, "idtomador");
            return (Criteria) this;
        }

        public Criteria andIdtomadorGreaterThan(Integer value) {
            addCriterion("idtomador >", value, "idtomador");
            return (Criteria) this;
        }

        public Criteria andIdtomadorGreaterThanOrEqualTo(Integer value) {
            addCriterion("idtomador >=", value, "idtomador");
            return (Criteria) this;
        }

        public Criteria andIdtomadorLessThan(Integer value) {
            addCriterion("idtomador <", value, "idtomador");
            return (Criteria) this;
        }

        public Criteria andIdtomadorLessThanOrEqualTo(Integer value) {
            addCriterion("idtomador <=", value, "idtomador");
            return (Criteria) this;
        }

        public Criteria andIdtomadorIn(List<Integer> values) {
            addCriterion("idtomador in", values, "idtomador");
            return (Criteria) this;
        }

        public Criteria andIdtomadorNotIn(List<Integer> values) {
            addCriterion("idtomador not in", values, "idtomador");
            return (Criteria) this;
        }

        public Criteria andIdtomadorBetween(Integer value1, Integer value2) {
            addCriterion("idtomador between", value1, value2, "idtomador");
            return (Criteria) this;
        }

        public Criteria andIdtomadorNotBetween(Integer value1, Integer value2) {
            addCriterion("idtomador not between", value1, value2, "idtomador");
            return (Criteria) this;
        }

        public Criteria andNombreIsNull() {
            addCriterion("nombre is null");
            return (Criteria) this;
        }

        public Criteria andNombreIsNotNull() {
            addCriterion("nombre is not null");
            return (Criteria) this;
        }

        public Criteria andNombreEqualTo(String value) {
            addCriterion("nombre =", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotEqualTo(String value) {
            addCriterion("nombre <>", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThan(String value) {
            addCriterion("nombre >", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThanOrEqualTo(String value) {
            addCriterion("nombre >=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThan(String value) {
            addCriterion("nombre <", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThanOrEqualTo(String value) {
            addCriterion("nombre <=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLike(String value) {
            addCriterion("nombre like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotLike(String value) {
            addCriterion("nombre not like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreIn(List<String> values) {
            addCriterion("nombre in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotIn(List<String> values) {
            addCriterion("nombre not in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreBetween(String value1, String value2) {
            addCriterion("nombre between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotBetween(String value1, String value2) {
            addCriterion("nombre not between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andApellidosIsNull() {
            addCriterion("apellidos is null");
            return (Criteria) this;
        }

        public Criteria andApellidosIsNotNull() {
            addCriterion("apellidos is not null");
            return (Criteria) this;
        }

        public Criteria andApellidosEqualTo(String value) {
            addCriterion("apellidos =", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosNotEqualTo(String value) {
            addCriterion("apellidos <>", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosGreaterThan(String value) {
            addCriterion("apellidos >", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosGreaterThanOrEqualTo(String value) {
            addCriterion("apellidos >=", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosLessThan(String value) {
            addCriterion("apellidos <", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosLessThanOrEqualTo(String value) {
            addCriterion("apellidos <=", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosLike(String value) {
            addCriterion("apellidos like", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosNotLike(String value) {
            addCriterion("apellidos not like", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosIn(List<String> values) {
            addCriterion("apellidos in", values, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosNotIn(List<String> values) {
            addCriterion("apellidos not in", values, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosBetween(String value1, String value2) {
            addCriterion("apellidos between", value1, value2, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosNotBetween(String value1, String value2) {
            addCriterion("apellidos not between", value1, value2, "apellidos");
            return (Criteria) this;
        }

        public Criteria andDniIsNull() {
            addCriterion("dni is null");
            return (Criteria) this;
        }

        public Criteria andDniIsNotNull() {
            addCriterion("dni is not null");
            return (Criteria) this;
        }

        public Criteria andDniEqualTo(String value) {
            addCriterion("dni =", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniNotEqualTo(String value) {
            addCriterion("dni <>", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniGreaterThan(String value) {
            addCriterion("dni >", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniGreaterThanOrEqualTo(String value) {
            addCriterion("dni >=", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniLessThan(String value) {
            addCriterion("dni <", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniLessThanOrEqualTo(String value) {
            addCriterion("dni <=", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniLike(String value) {
            addCriterion("dni like", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniNotLike(String value) {
            addCriterion("dni not like", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniIn(List<String> values) {
            addCriterion("dni in", values, "dni");
            return (Criteria) this;
        }

        public Criteria andDniNotIn(List<String> values) {
            addCriterion("dni not in", values, "dni");
            return (Criteria) this;
        }

        public Criteria andDniBetween(String value1, String value2) {
            addCriterion("dni between", value1, value2, "dni");
            return (Criteria) this;
        }

        public Criteria andDniNotBetween(String value1, String value2) {
            addCriterion("dni not between", value1, value2, "dni");
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