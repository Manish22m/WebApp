package com.newproj.SimpleWebApp.service;

import com.newproj.SimpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products= new ArrayList<>(Arrays.asList(new Product(101, "Shampooo", 500),
                                            new Product(102, "Oil", 1000),
                                            new Product(103, "Shirt", 699)
                                                ));
    public List<Product> getAllProducts() {
        return products;
    }

    public Product getById(int prodId) {
       return products.stream()
                .filter(p->p.getProdId()==prodId)
                .findFirst().get();
    }

    public void addprod(Product product) {
        products.add(product);

    }

    public void update(int prodId, Product product) {
        Product prod=products.stream().filter(p -> p.getProdId()==prodId).findFirst().get();
        prod.setProdName(product.getProdName());
        prod.setPrice(product.getPrice());
//        prod.setProdId(product.getProdId());
    }

    public void deleteById(int prodId) {
        Product prod=products.stream().filter(p -> p.getProdId()==prodId).findFirst().get();
        products.remove(prod);
    }
}
