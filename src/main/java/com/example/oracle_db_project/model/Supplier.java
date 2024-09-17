package com.example.oracle_db_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity(name = "SUPPLIER")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "supplier_seq")
    @SequenceGenerator(name = "supplier_seq", sequenceName = "SEQ_SUPPLIER", allocationSize = 1)
    private Long supplier_id;

    private String supplier_name;
    private String supplier_country;
    private String supplier_street;
    private String supplier_complement;
    private long supplier_number;
    private int supplier_type;
    private String supplier_document;

    // Getters e Setters
    public Long getSupplierId() {
        return supplier_id;
    }

    public void setSupplierId(Long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public String getSupplier_country() {
        return supplier_country;
    }

    public void setSupplier_country(String supplier_country) {
        this.supplier_country = supplier_country;
    }

    public String getSupplier_street() {
        return supplier_street;
    }

    public void setSupplier_street(String supplier_street) {
        this.supplier_street = supplier_street;
    }

    public String getSupplier_complement() {
        return supplier_complement;
    }

    public void setSupplier_complement(String supplier_complement) {
        this.supplier_complement = supplier_complement;
    }

    public Long getSupplier_number() {
        return supplier_number;
    }

    public void setSupplier_number(long supplier_number) {
        this.supplier_number = supplier_number;
    }

    public int getSupplier_type() {
        return supplier_type;
    }

    public void setSupplier_type(int supplier_type) {
        this.supplier_type = supplier_type;
    }

    public String getSupplier_document() {
        return supplier_document;
    }

    public void setSupplier_document(String supplier_document) {
        this.supplier_document = supplier_document;
    }
}

