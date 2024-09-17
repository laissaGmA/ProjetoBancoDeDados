package com.example.oracle_db_project.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq")
    @SequenceGenerator(name = "product_seq", sequenceName = "SEQ_PRODUCT", allocationSize = 1)
    private Long product_id;

    @Enumerated(EnumType.ORDINAL)
    private Status status;
    private double sale_price;
    private double min_sale_price;

    @ManyToOne
    @JoinColumn(name = "fk_category_id", referencedColumnName = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "fk_supplier_id", referencedColumnName = "supplier_id")
    private Supplier supplier;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<NameProduct> nameProducts = new ArrayList<>();

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<DescriptionProduct> descriptionProducts = new ArrayList<>();

    // Getters and Setters

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public double getSale_price() {
        return sale_price;
    }

    public void setSale_price(double sale_price) {
        this.sale_price = sale_price;
    }

    public double getMin_sale_price() {
        return min_sale_price;
    }

    public void setMin_sale_price(double min_sale_price) {
        this.min_sale_price = min_sale_price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<NameProduct> getNameProducts() {
        return nameProducts;
    }

    public void setNameProducts(List<NameProduct> nameProducts) {
        this.nameProducts = nameProducts;
    }

    public List<DescriptionProduct> getDescriptionProducts() {
        return descriptionProducts;
    }

    public void setDescriptionProducts(List<DescriptionProduct> descriptionProducts) {
        this.descriptionProducts = descriptionProducts;
    }
}
