package com.example.oracle_db_project.model.compondKey;

import java.io.Serializable;
import java.util.Objects;

public class NameProductId implements Serializable {
    private Long product;
    private String name;
    private String name_language;

    // Construtores, equals e hashCode


    public NameProductId() {
    }

    public NameProductId(Long product, String name, String name_language) {
        this.product = product;
        this.name = name;
        this.name_language = name_language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NameProductId that = (NameProductId) o;
        return Objects.equals(product, that.product) && Objects.equals(name, that.name) && Objects.equals(name_language, that.name_language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, name, name_language);
    }
}

