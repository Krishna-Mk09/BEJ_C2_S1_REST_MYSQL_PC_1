/*
 * Author Name : M.Krishna.
 * Date: 22-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.dp.BEJ_C2_S1_REST_MYSQL_PC_1.domain;

public class Product {
    private int productId;
    private String Name;
    private String Description;
    private double amountInStock;

    public Product() {
    }

    public Product(int productId, String name, String description, double amountInStock) {
        this.productId = productId;
        Name = name;
        Description = description;
        this.amountInStock = amountInStock;
    }

}
