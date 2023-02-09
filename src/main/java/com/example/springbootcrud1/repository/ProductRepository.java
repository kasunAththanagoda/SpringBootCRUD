package com.example.springbootcrud1.repository;

import com.example.springbootcrud1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name); //model name,data type of primarykey
}
