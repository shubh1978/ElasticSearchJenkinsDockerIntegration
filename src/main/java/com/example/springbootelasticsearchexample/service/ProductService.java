package com.example.springbootelasticsearchexample.service;

import com.example.springbootelasticsearchexample.entity.Product;




public interface ProductService{





    Product insertProduct(Product product);


    Iterable<Product> getProduct() ;
}