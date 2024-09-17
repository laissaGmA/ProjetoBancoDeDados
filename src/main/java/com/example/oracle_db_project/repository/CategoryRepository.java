package com.example.oracle_db_project.repository;

import com.example.oracle_db_project.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
