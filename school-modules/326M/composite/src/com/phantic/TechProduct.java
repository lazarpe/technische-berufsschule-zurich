package com.phantic;

/**
 * Created by lazar on 3/15/2022.
 * Project name: composite
 **/
public class TechProduct implements Product {
    private int productId;
    private String productName;
    private float productPrice;

    public TechProduct(int productId, String productName, float productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public void printProductInfo() {
        System.out.println("" +
                "********************************"
                + "\nProduct\n"
                + "product_id: " + this.getProductId()
                + "\nproduct name: " + this.getProductName()
                + "\nproduct price: " + this.getProductPrice()
        );
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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
