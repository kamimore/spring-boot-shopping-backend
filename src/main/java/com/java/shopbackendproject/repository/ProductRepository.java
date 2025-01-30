package com.java.shopbackendproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.shopbackendproject.model.Product;
import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Long>{
    List<Product> findByCategoryName(String category);
    List<Product> findByBrand(String brand);
    List<Product> findByCategoryNameAndBrand(String category, String brand);
    List<Product> findByName(String product);
    List<Product> findByBrandAndName(String brand, String name);
    Long countByBrandAndName(String brand, String name);
}
