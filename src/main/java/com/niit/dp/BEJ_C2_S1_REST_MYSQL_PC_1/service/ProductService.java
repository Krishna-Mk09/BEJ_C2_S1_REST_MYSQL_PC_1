package com.niit.dp.BEJ_C2_S1_REST_MYSQL_PC_1.service;

import domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product saveProduct(Product product);

    boolean deleteProduct(int productId);

    List<Product> fetchAllProducts();

    Optional<Product> fetchProductById(int productId);

    void updateProduct(int productId, Product product);
}


