package com.example.ProteinApp.repository;

import com.example.ProteinApp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

