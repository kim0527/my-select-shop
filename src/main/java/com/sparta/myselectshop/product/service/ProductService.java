package com.sparta.myselectshop.product.service;

import com.sparta.myselectshop.product.Product;
import com.sparta.myselectshop.product.dto.ProductRequestDto;
import com.sparta.myselectshop.product.dto.ProductResponseDto;
import com.sparta.myselectshop.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductResponseDto createProduct(ProductRequestDto requestDto) {
        Product product = productRepository.save(new Product(requestDto));
        return new ProductResponseDto(product);
    }

}
