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
// repository. It is a Spring Data JPA repository. It is a Spring Data JPA repository. It is a Spring Data JPA repository.
// It is a Spring Data JPA repository. It is a Spring Data JPA repository. It is a Spring Data JPA repository. It is a
// Spring Data J
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByProductName(String productName);


}
