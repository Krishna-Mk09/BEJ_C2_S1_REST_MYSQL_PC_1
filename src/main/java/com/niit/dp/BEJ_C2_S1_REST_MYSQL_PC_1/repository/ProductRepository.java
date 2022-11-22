package com.niit.dp.BEJ_C2_S1_REST_MYSQL_PC_1.repository;

import com.niit.dp.BEJ_C2_S1_REST_MYSQL_PC_1.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
