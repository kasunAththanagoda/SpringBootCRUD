package com.example.springbootcrud1.controller;

import com.example.springbootcrud1.entity.Product;
import com.example.springbootcrud1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return service.getProduts();
    }

    @GetMapping("/productById/{id}")
    public Product findProductsById(@PathVariable int id){
        return service.getProdutById(id);
    }

    @GetMapping("/productByName/{name}")
    public Product findProductsByName(@PathVariable String name) {
        return service.getProdutByName(name);
    }

    @PutMapping("/addProduct")
    public Product updateProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }


}
