/*
 * Author Name : M.Krishna.
 * Date: 22-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.dp.BEJ_C2_S1_REST_MYSQL_PC_1.controller;

import com.niit.dp.BEJ_C2_S1_REST_MYSQL_PC_1.service.ProductService;
import domain.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/insertProduct")
    public ResponseEntity<?> saveFunction(@RequestBody Product product) {
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    @GetMapping("/fetchAllProducts")
    public ResponseEntity<?> fetchFunction() {
        return new ResponseEntity<>(productService.fetchAllProducts(), HttpStatus.OK);
    }

    @DeleteMapping("/deleteById/{productId}")
    public ResponseEntity<?> deleteFunction(@PathVariable int productId) {
        productService.deleteProduct(productId);
        return new ResponseEntity<>("deleted", HttpStatus.CREATED);
    }

    @GetMapping("/getById/{productId}")
    public ResponseEntity<?> getByIdFunction(@PathVariable int productId) {
        productService.fetchProductById(productId);
        return new ResponseEntity<>(productService.fetchProductById(productId), HttpStatus.OK);
    }

    @PutMapping("/updateById/{productId}")
    public ResponseEntity<?> updateByIdFunction(@PathVariable int productId, @RequestBody Product product) {
        productService.updateProduct(productId, product);
        return new ResponseEntity<>("product Record Updated", HttpStatus.OK);
    }

}
