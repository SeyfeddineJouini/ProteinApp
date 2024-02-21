package com.example.ProteinApp.service;

import com.example.ProteinApp.entities.Product;
import com.example.ProteinApp.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class IproductServiceImpl implements IproductService{
    @Autowired
    private ProductRepository prodRep;
    @Override
    public Product saveProduct(Product prod) {
        return null;
    }

    @Override
    public List<Product> findAllProducts() {
        return this.prodRep.findAll();
    }
}
