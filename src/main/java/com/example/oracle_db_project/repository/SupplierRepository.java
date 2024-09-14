package com.example.oracle_db_project.repository;

import com.example.oracle_db_project.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
