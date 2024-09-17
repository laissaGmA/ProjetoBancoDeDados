package com.example.oracle_db_project.dtos;

import java.math.BigDecimal;

public class QueryQuatro {
    private BigDecimal quantidadeTotal;
    private BigDecimal mediaQuantidade;

    public QueryQuatro(BigDecimal quantidadeTotal, BigDecimal mediaQuantidade) {
        this.quantidadeTotal = quantidadeTotal;
        this.mediaQuantidade = mediaQuantidade;
    }

    public QueryQuatro() {
    }

    public BigDecimal getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public void setQuantidadeTotal(BigDecimal quantidadeTotal) {
        this.quantidadeTotal = quantidadeTotal;
    }

    public BigDecimal getMediaQuantidade() {
        return mediaQuantidade;
    }

    public void setMediaQuantidade(BigDecimal mediaQuantidade) {
        this.mediaQuantidade = mediaQuantidade;
    }
}
