package com.example.oracle_db_project.dtos;

public class QueryTres {
    private String nome;
    private String endereco;

    public QueryTres(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public QueryTres() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
