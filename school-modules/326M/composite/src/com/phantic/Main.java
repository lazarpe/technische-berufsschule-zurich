package com.phantic;

public class Main {

    public static void main(String[] args) {
        Box box = new Box(1, "BOXBOX1");
        box.addProduct(new TechProduct(1, "MAC", 3.3f));
        box.addProduct(new TechProduct(2, "PHONE", 15.35f));
        box.addProduct(new HomeMadeProduct("honey", 6f));
        box.printProducts();
    }
}
