package com.example.oracle_db_project.model;

import jakarta.persistence.*;

@Entity
@Table(name = "SUPPLIER", schema = "SYSTEM")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "supplier_seq")
    @SequenceGenerator(name = "supplier_seq", sequenceName = "SEQ_SUPPLIER", allocationSize = 1)
    private Long supplier_id;

    private String supplier_name;
    private String supplier_country;
    private String supplier_street;
    private String supplier_complement;
    private int supplier_number;
    private int supplier_type;
    private String supplier_document;

    // Getters e Setters

    public Long getSupplierId() {
        return supplier_id;
    }

    public void setSupplierId(Long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getSupplierName() {
        return supplier_name;
    }

    public void setSupplierName(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public String getSupplierCountry() {
        return supplier_country;
    }

    public void setSupplierCountry(String supplier_country) {
        this.supplier_country = supplier_country;
    }

    public String getSupplierStreet() {
        return supplier_street;
    }

    public void setSupplierStreet(String supplier_street) {
        this.supplier_street = supplier_street;
    }

    public String getSupplierComplement() {
        return supplier_complement;
    }

    public void setSupplierComplement(String supplier_complement) {
        this.supplier_complement = supplier_complement;
    }

    public int getSupplierNumber() {
        return supplier_number;
    }

    public void setSupplierNumber(int supplier_number) {
        this.supplier_number = supplier_number;
    }

    public int getSupplierType() {
        return supplier_type;
    }

    public void setSupplierType(int supplier_type) {
        this.supplier_type = supplier_type;
    }

    public String getSupplierDocument() {
        return supplier_document;
    }

    public void setSupplierDocument(String supplier_document) {
        this.supplier_document = supplier_document;
    }
}

