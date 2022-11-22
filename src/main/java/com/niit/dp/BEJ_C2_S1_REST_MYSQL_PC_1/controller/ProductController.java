/*
 * Author Name : M.Krishna.
 * Date: 22-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.dp.BEJ_C2_S1_REST_MYSQL_PC_1.controller;

import com.niit.dp.BEJ_C2_S1_REST_MYSQL_PC_1.domain.Product;
import com.niit.dp.BEJ_C2_S1_REST_MYSQL_PC_1.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")

public class ProductController {
    private final IProductService iproductService;

    @Autowired
    public ProductController(IProductService iproductService) {
        this.iproductService = iproductService;
    }

    @PostMapping("/insertProduct")
    public ResponseEntity<?> saveFunction(@RequestBody Product product) {
        return new ResponseEntity<>(iproductService.saveProduct(product), HttpStatus.CREATED);
    }

    @GetMapping("/fetchAllProduct")
    public ResponseEntity<?> fetchFunction() {
        return new ResponseEntity<>(iproductService.fetchAllProduct(), HttpStatus.OK);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public ResponseEntity<?> deleteFunction(@PathVariable int id) {
        iproductService.deleteProduct(id);
        return new ResponseEntity<>("Product Record Deleted", HttpStatus.OK);
    }

    @GetMapping("/getProductById/{id}")
    public ResponseEntity<?> getProductByIdFunction(@PathVariable int id) {
        return new ResponseEntity<>(iproductService.getProductById(id), HttpStatus.OK);
    }

    @PutMapping("/updateById/{id}")
    public ResponseEntity<?> updateFunction(@PathVariable int id, @RequestBody Product product) {
        iproductService.updateProduct(id, product);
        return new ResponseEntity<>("Product Record Updated", HttpStatus.OK);
    }


}
