/*
 * Author Name : M.Krishna.
 * Date: 22-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.dp.BEJ_C2_S1_REST_MYSQL_PC_1.service;

import com.niit.dp.BEJ_C2_S1_REST_MYSQL_PC_1.domain.Product;

import java.util.List;
import java.util.Optional;

// This is a service interface.
public interface IProductService {
    Product saveProduct(Product product);

    boolean deleteProduct(int pid);

    List<Product> fetchAllProduct();

    Optional<Product> getProductById(int pid);

    void updateProduct(int pid, Product product);

    List<Product> fetchDataByName(String productName);
    

}
