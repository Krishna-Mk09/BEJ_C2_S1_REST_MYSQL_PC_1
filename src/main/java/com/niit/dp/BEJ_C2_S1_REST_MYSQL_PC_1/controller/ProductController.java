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
    // A constructor injection.
    private final IProductService iproductService;

    // This is a constructor injection.
    @Autowired
    public ProductController(IProductService iproductService) {
        this.iproductService = iproductService;
    }

    /**
     * This function is a POST request that takes in a JSON object and returns a JSON object
     *
     * @param product The object that will be saved in the database.
     * @return A response entity with the product that was saved and a status of created.
     */
    @PostMapping("/insertProduct")
    public ResponseEntity<?> saveFunction(@RequestBody Product product) {
        return new ResponseEntity<>(iproductService.saveProduct(product), HttpStatus.CREATED);
    }

    /**
     * It fetches all the products from the database.
     *
     * @return A list of all products in the database.
     */
    @GetMapping("/fetchAllProduct")
    public ResponseEntity<?> fetchFunction() {
        return new ResponseEntity<>(iproductService.fetchAllProduct(), HttpStatus.OK);
    }

    /**
     * The function takes in an id, and deletes the product with that id
     *
     * @param id The id of the product to be deleted.
     * @return A ResponseEntity object is being returned.
     */
    @DeleteMapping("/deleteProduct/{id}")
    public ResponseEntity<?> deleteFunction(@PathVariable int id) {
        iproductService.deleteProduct(id);
        return new ResponseEntity<>("Product Record Deleted", HttpStatus.OK);
    }

    /**
     * This function is a GET request that takes in an id as a path variable and returns a product object with the same id
     *
     * @param id The id of the product you want to get.
     * @return A ResponseEntity object is being returned.
     */
    @GetMapping("/getProductById/{id}")
    public ResponseEntity<?> getProductByIdFunction(@PathVariable int id) {
        return new ResponseEntity<>(iproductService.getProductById(id), HttpStatus.OK);
    }

    /**
     * The function takes in a product id and a product object, and updates the product record in the database with the
     * product object
     *
     * @param id      The id of the product to be updated.
     * @param product The object that will be updated.
     * @return A response entity with a message and a status code.
     */
    @PutMapping("/updateById/{id}")
    public ResponseEntity<?> updateFunction(@PathVariable int id, @RequestBody Product product) {
        iproductService.updateProduct(id, product);
        return new ResponseEntity<>("Product Record Updated", HttpStatus.OK);
    }

    @GetMapping("/getProductByName/{productName}")
    public ResponseEntity<?> getProductByName(@PathVariable String productName) {
        return new ResponseEntity<>(iproductService.fetchDataByName(productName), HttpStatus.OK);
    }
}
