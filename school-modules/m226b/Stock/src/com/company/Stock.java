package com.company;

/**
 * Created by lazar on 11/30/2021.
 * Project name: Stock
 **/
public class Stock {
    private String stockName;
    private Float stockPrice;

    public Stock(String stockName, Float stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Float getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(Float stockPrice) {
        this.stockPrice = stockPrice;
    }
}
