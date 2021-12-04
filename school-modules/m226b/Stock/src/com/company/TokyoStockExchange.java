package com.company;

/**
 * Created by lazar on 11/30/2021.
 * Project name: Stock
 **/
public class TokyoStockExchange implements StockExchange {
    @Override
    public void buyStock(Stock stock) {
        System.out.println("Bought " + stock.getStockName() + " for " + stock.getStockPrice() + "$ from Tokyo Stock Exchange");
    }

    @Override
    public void sellStock(Stock stock) {
        System.out.println("Sold " + stock.getStockName() + " for " + stock.getStockPrice() + "$ from Tokyo Stock Exchange");
    }
}
