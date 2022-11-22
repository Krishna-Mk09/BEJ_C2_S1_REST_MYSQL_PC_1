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
public class ProductServiceImpl implements IProductService {
    // A private variable that is used to access the database.
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
     * It deletes a product from the database.
     *
     * @param pid The id of the product to be deleted.
     * @return A boolean value.
     */
    @Override
    public boolean deleteProduct(int pid) {
        productRepository.deleteById(pid);
        return true;
    }

    /**
     * > The function fetches all the products from the database and returns them as a list
     *
     * @return A list of all products in the database.
     */
    @Override
    public List<Product> fetchAllProduct() {
        return productRepository.findAll();
    }

    /**
     * > The function returns an Optional object that contains a Product object if the product exists in the database, or
     * an empty Optional object if the product does not exist in the database
     *
     * @param pid The id of the product you want to get.
     * @return Optional<Product>
     */
    @Override
    public Optional<Product> getProductById(int pid) {
        return productRepository.findById(pid);
    }

    // Updating the product.
    @Override
    public void updateProduct(int pid, Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> fetchDataByName(String productName) {
        return productRepository.findByProductName(productName);
    }
}
