package com.sparta.myselectshop.product.repository;

import com.sparta.myselectshop.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
