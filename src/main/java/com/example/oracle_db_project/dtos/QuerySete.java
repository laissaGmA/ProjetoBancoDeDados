package com.example.oracle_db_project.dtos;

import java.util.Date;

public class QuerySete {
    private String nome;
    private Date garantia;
    private String descricao;

    public QuerySete(String nome, Date garantia, String descricao) {
        this.nome = nome;
        this.garantia = garantia;
        this.descricao = descricao;
    }

    public QuerySete() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getGarantia() {
        return garantia;
    }

    public void setGarantia(Date garantia) {
        this.garantia = garantia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
