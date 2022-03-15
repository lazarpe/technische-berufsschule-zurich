package com.phantic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lazar on 3/15/2022.
 * Project name: composite
 **/
public class Box {
    private int id;
    private String boxCode;

    private List<Product> products;

    public Box(int id, String boxCode) {
        this.id = id;
        this.boxCode = boxCode;
        this.products = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBoxCode() {
        return boxCode;
    }

    public void setBoxCode(String boxCode) {
        this.boxCode = boxCode;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void printProducts() {
        products.forEach(Product::printProductInfo);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product techProduct) {
        products.remove(techProduct);
    }
}
