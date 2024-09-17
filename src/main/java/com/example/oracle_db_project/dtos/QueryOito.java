package com.example.oracle_db_project.dtos;

import java.math.BigDecimal;

public class QueryOito {
    public BigDecimal id;
    public BigDecimal precoTabela;
    public BigDecimal precoMinimo;
    public BigDecimal precoMinimoVenda;

    public QueryOito(BigDecimal id, BigDecimal precoTabela, BigDecimal precoMinimo, BigDecimal precoMinimoVenda) {
        this.id = id;
        this.precoTabela = precoTabela;
        this.precoMinimo = precoMinimo;
        this.precoMinimoVenda = precoMinimoVenda;
    }

    public QueryOito() {
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getPrecoTabela() {
        return precoTabela;
    }

    public void setPrecoTabela(BigDecimal precoTabela) {
        this.precoTabela = precoTabela;
    }

    public BigDecimal getPrecoMinimo() {
        return precoMinimo;
    }

    public void setPrecoMinimo(BigDecimal precoMinimo) {
        this.precoMinimo = precoMinimo;
    }

    public BigDecimal getPrecoMinimoVenda() {
        return precoMinimoVenda;
    }

    public void setPrecoMinimoVenda(BigDecimal precoMinimoVenda) {
        this.precoMinimoVenda = precoMinimoVenda;
    }
}
