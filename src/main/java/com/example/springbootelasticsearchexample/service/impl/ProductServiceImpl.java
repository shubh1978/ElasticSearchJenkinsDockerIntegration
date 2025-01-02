package com.example.springbootelasticsearchexample.service.impl;

import com.example.springbootelasticsearchexample.entity.Product;
import com.example.springbootelasticsearchexample.repo.ProductRepo;
import com.example.springbootelasticsearchexample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

@Autowired
private ProductRepo    productRepo;
    @Override
    public Product insertProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Iterable<Product> getProduct() {
        return productRepo.findAll();
    }
}