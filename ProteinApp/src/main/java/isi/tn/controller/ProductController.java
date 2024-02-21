package com.example.ProteinApp.controller;

import java.util.List;

import javax.validation.Valid;

import com.example.ProteinApp.entities.Product;
import com.example.ProteinApp.service.IproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/protein")
public class ProductController {
    @Autowired
    private IproductService prod;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        List<Product> prods = prod.findAllProducts();
        return prods;
    }

    @PostMapping("/addproduct")
    public Product createUser(@Valid @RequestBody Product product) {
        return prod.saveProduct(product);
    }
}
