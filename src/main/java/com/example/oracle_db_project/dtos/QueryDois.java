package com.example.oracle_db_project.dtos;

import java.math.BigDecimal;

public class QueryDois {
    public String name;
    public BigDecimal credit_limit;
    public String city;
    public String state;

    public QueryDois(String name, BigDecimal credit_limit, String city, String state) {
        this.name = name;
        this.credit_limit = credit_limit;
        this.city = city;
        this.state = state;
    }

    public QueryDois() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCredit_limit() {
        return credit_limit;
    }

    public void setCredit_limit(BigDecimal credit_limit) {
        this.credit_limit = credit_limit;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
