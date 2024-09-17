package com.example.oracle_db_project.service;

import com.example.oracle_db_project.model.Category;
import com.example.oracle_db_project.model.Product;
import com.example.oracle_db_project.model.Supplier;
import com.example.oracle_db_project.repository.CategoryRepository;
import com.example.oracle_db_project.repository.ProductRepository;
import com.example.oracle_db_project.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    public List<String> languages() {
        return productRepository.newQuerySearchForDistinctLanguage();
    }
}
