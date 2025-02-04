package com.sparta.myselectshop.product.repository;

import com.sparta.myselectshop.member.User;
import com.sparta.myselectshop.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findALlByUser(User user);
}
