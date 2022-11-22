/*
 * Author Name : M.Krishna.
 * Date: 22-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.dp.BEJ_C2_S1_REST_MYSQL_PC_1.service;

import com.niit.dp.BEJ_C2_S1_REST_MYSQL_PC_1.domain.Product;
import com.niit.dp.BEJ_C2_S1_REST_MYSQL_PC_1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public boolean deleteProduct(int productId) {
        productRepository.deleteById(productId);
        return true;
    }

    @Override
    public List<Product> fetchAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> fetchProductById(int productId) {
        return productRepository.findById(productId);
    }

    @Override
    public void updateProduct(int productId, Product product) {
        productRepository.save(product);
    }
}
