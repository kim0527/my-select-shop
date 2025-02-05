package com.sparta.myselectshop.product.repository;

import com.sparta.myselectshop.member.User;
import com.sparta.myselectshop.product.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findALlByUser(User user);
    Page<Product> findAllByUser(User user, Pageable pageable);
    Page<Product> findAllByUserAndProductFolderList_FolderId(User user, Long folderId, Pageable pageable);

}
