package com.example.oracle_db_project.dtos;

import java.math.BigDecimal;

public class QuerySeis {
    public BigDecimal numPedidos;
    public BigDecimal porcentagem;

    public QuerySeis(BigDecimal numPedidos, BigDecimal porcentagem) {
        this.numPedidos = numPedidos;
        this.porcentagem = porcentagem;
    }

    public QuerySeis() {
    }

    public BigDecimal getNumPedidos() {
        return numPedidos;
    }

    public void setNumPedidos(BigDecimal numPedidos) {
        this.numPedidos = numPedidos;
    }

    public BigDecimal getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(BigDecimal porcentagem) {
        this.porcentagem = porcentagem;
    }
}
