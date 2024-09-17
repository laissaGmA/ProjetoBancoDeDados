package com.example.oracle_db_project.repository;

import com.example.oracle_db_project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT DISTINCT np.name_language FROM NAME_PRODUCT np", nativeQuery = true)
    List<String> newQuerySearchForDistinctLanguage();

}
