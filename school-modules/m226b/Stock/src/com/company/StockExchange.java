package com.company;

/**
 * Created by lazar on 11/30/2021.
 * Project name: Stock
 **/
public interface StockExchange {
    public Stock buyStock(Stock stock);
    public void sellStock(Stock stock);
}
