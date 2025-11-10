package com.newproj.SimpleWebApp.controller;

import com.newproj.SimpleWebApp.model.Product;
import com.newproj.SimpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {


    @Autowired
    ProductService productService;

    @GetMapping("/getall")
    public List<Product> getAllProduct(){
        return productService.getAllProducts();
    }

    @GetMapping("/getbyid/{prodId}")
    public Product getbyId(@PathVariable int prodId){
        return productService.getById(prodId);
    }

//    @PostMapping("/update")
//    public void update(@RequestBody Product product){
//        productService.update(product);
//    }
}
