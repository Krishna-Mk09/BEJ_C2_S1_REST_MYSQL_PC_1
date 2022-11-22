/*
 * Author Name : M.Krishna.
 * Date: 22-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.dp.BEJ_C2_S1_REST_MYSQL_PC_1.service;

import com.niit.dp.BEJ_C2_S1_REST_MYSQL_PC_1.repository.ProductRepository;
import domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    // A constructor injection.
    private final ProductRepository productRepository;

    // A constructor injection.
    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * > The function takes a product object as an argument, saves it to the database, and returns the saved product object
     *
     * @param product The product object that we want to save.
     * @return The product that was saved.
     */
    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    /**
     * > Delete a product from the database
     *
     * @param productId The id of the product to be deleted.
     * @return A boolean value.
     */
    @Override
    public boolean deleteProduct(int productId) {
        productRepository.deleteById(productId);
        return true;
    }

    /**
     * Return a list of all products from the product repository.
     *
     * @return A list of all products in the database.
     */
    @Override
    public List<Product> fetchAllProducts() {
        return productRepository.findAll();
    }

    /**
     * > It fetches a product by its id
     *
     * @param productId The id of the product to be fetched.
     * @return Optional<Product>
     */
    @Override
    public Optional<Product> fetchProductById(int productId) {
        return productRepository.findById(productId);
    }

    /**
     * The function takes in a productId and a product object, and then saves the product object to the database
     *
     * @param productId The id of the product to be updated.
     * @param product   The product object that we want to update.
     */
    @Override
    public void updateProduct(int productId, Product product) {
        productRepository.save(product);
    }
}
