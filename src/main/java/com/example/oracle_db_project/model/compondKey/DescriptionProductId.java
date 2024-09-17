package com.example.oracle_db_project.model.compondKey;

import java.io.Serializable;
import java.util.Objects;

public class DescriptionProductId implements Serializable {
    private Long product;
    private String description;
    private String description_language;

    // Construtores, equals e hashCode

    public DescriptionProductId(Long product, String description, String description_language) {
        this.product = product;
        this.description = description;
        this.description_language = description_language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DescriptionProductId that = (DescriptionProductId) o;
        return Objects.equals(product, that.product) && Objects.equals(description, that.description) && Objects.equals(description_language, that.description_language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, description, description_language);
    }
}

