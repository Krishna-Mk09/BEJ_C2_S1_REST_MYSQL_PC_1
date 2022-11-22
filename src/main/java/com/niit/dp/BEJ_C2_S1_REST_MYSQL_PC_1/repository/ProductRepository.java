package com.niit.dp.BEJ_C2_S1_REST_MYSQL_PC_1.repository;

import com.niit.dp.BEJ_C2_S1_REST_MYSQL_PC_1.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// A Spring Data JPA repository. It is a Spring Data JPA repository. It is a Spring Data JPA repository. It is a Spring
// Data JPA repository. It is a Spring Data JPA repository. It is a Spring Data JPA repository. It is a Spring Data JPA
// repository. It is a Spring Data JPA repository. It is a Spring Data JPA repository. It is a Spring Data JPA repository.
// It is a Spring Data JPA repository. It is a Spring Data JPA repository. It is a Spring Data JPA repository. It is a
// Spring Data JPA repository. It is a Spring Data JPA repository. It is a Spring Data JPA repository. It is a Spring Data
// JPA repository. It is a Spring Data JPA repository. It is a Spring Data JPA repository. It is a Spring Data JPA

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    /**
     * Find all products whose name is equal to the given productName.
     *
     * @param productName The name of the product to search for.
     * @return A list of products with the given product name.
     */
    List<Product> findByProductName(String productName);


}
