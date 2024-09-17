package com.example.oracle_db_project.model;

import com.example.oracle_db_project.model.compondKey.DescriptionProductId;
import jakarta.persistence.*;

@Entity(name = "DESCRIPTION_PRODUCT")
@IdClass(DescriptionProductId.class)
public class DescriptionProduct {

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;

    @Id
    private String description;

    @Id
    private String description_language;

    // Getters e Setters
}

