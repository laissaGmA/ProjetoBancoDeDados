package com.example.oracle_db_project.dtos;

import java.math.BigDecimal;

public class QueryCinco {
    private String nome;
    private String descricao;
    private BigDecimal faturamentoTotal;

    public QueryCinco() {
    }

    public QueryCinco(String nome, String descricao, BigDecimal faturamentoTotal) {
        this.nome = nome;
        this.descricao = descricao;
        this.faturamentoTotal = faturamentoTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getFaturamentoTotal() {
        return faturamentoTotal;
    }

    public void setFaturamentoTotal(BigDecimal faturamentoTotal) {
        this.faturamentoTotal = faturamentoTotal;
    }
}
