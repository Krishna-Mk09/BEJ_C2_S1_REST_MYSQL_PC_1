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

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(double amountInStock) {
        this.amountInStock = amountInStock;
    }
}
