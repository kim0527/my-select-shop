package com.sparta.myselectshop.folder.repository;

import com.sparta.myselectshop.folder.Folder;
import com.sparta.myselectshop.folder.ProductFolder;
import com.sparta.myselectshop.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductFolderRepository extends JpaRepository<ProductFolder, Long> {
    Optional<ProductFolder> findByProductAndFolder(Product product, Folder folder);
}
