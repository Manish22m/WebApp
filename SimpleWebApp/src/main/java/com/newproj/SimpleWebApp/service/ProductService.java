package com.newproj.SimpleWebApp.service;

import com.newproj.SimpleWebApp.model.Product;
import com.newproj.SimpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product getById(int prodId) {
       return productRepo.findById(prodId).orElse(null);
    }

    public void addprod(Product product) {

        productRepo.save(product);
    }

    public void update(int prodId, Product product) {
        productRepo.save(product);
    }

    public void deleteById(int prodId) {
        productRepo.deleteById(prodId);
    }
}
