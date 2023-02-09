package com.example.springbootcrud1.service;

import com.example.springbootcrud1.entity.Product;
import com.example.springbootcrud1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository; //injecting the related repository


    //save products to database
    public Product saveProduct(Product product){
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products){
        return repository.saveAll(products);
    }

    public List<Product> getProduts(){
        return repository.findAll();
    }

    public Product getProdutById(int id){
        return repository.findById(id).orElse(null);
    }

    public Product getProdutByName(String name){
        return repository.findByName(name);
    }

    public String deleteProduct(int id){
        repository.deleteById(id);
        return "product removed " +id;
    }

    public Product updateProduct(Product product){
        Product existingProduct=repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }

}
