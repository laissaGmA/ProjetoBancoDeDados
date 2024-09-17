package com.example.oracle_db_project.dtos;

import java.math.BigDecimal;

public class QueryNove {
    public BigDecimal numeroClientes;
    public BigDecimal porcentagem;

    public QueryNove(BigDecimal numeroClientes, BigDecimal porcentagem) {
        this.numeroClientes = numeroClientes;
        this.porcentagem = porcentagem;
    }

    public QueryNove() {
    }

    public BigDecimal getNumeroClientes() {
        return numeroClientes;
    }

    public void setNumeroClientes(BigDecimal numeroClientes) {
        this.numeroClientes = numeroClientes;
    }

    public BigDecimal getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(BigDecimal porcentagem) {
        this.porcentagem = porcentagem;
    }
}
