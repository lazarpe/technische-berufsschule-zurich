package com.phantic;

/**
 * Created by lazar on 3/15/2022.
 * Project name: composite
 **/
public class HomeMadeProduct implements Product {
    private String productName;
    private float productPrice;

    public HomeMadeProduct(String productName, float productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public void printProductInfo() {
        System.out.println("" +
                "********************************"
                + "\nHome made Product"
                + "\nproduct name: " + this.getProductName()
                + "\nproduct price: " + this.getProductPrice()
        );
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
