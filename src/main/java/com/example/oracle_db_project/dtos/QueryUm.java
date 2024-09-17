package com.example.oracle_db_project.dtos;

public class QueryUm {
    private String nome;
    private String descricao;
    private double precoMinimo;

    public QueryUm(String nome, String descricao, double precoMinimo) {
        this.nome = nome;
        this.descricao = descricao;
        this.precoMinimo = precoMinimo;
    }

    public QueryUm() {
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

    public double getPrecoMinimo() {
        return precoMinimo;
    }

    public void setPrecoMinimo(double precoMinimo) {
        this.precoMinimo = precoMinimo;
    }
}
