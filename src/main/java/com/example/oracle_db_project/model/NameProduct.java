package com.example.oracle_db_project.model;

import com.example.oracle_db_project.model.compondKey.NameProductId;
import jakarta.persistence.*;

@Entity(name = "NAME_PRODUCT")
@IdClass(NameProductId.class)
public class NameProduct {

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;

    @Id
    private String name;

    @Id
    private String name_language;

    // Getters e Setters

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_language() {
        return name_language;
    }

    public void setName_language(String name_language) {
        this.name_language = name_language;
    }
}


