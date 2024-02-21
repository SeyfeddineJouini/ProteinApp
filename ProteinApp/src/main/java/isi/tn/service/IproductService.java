package com.example.ProteinApp.service;

import com.example.ProteinApp.entities.User;

import java.util.List;
import com.example.ProteinApp.entities.Product;


public interface IproductService {
        Product saveProduct(Product prod);

        List<Product> findAllProducts();

}
