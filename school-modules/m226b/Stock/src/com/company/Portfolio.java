package com.company;

import java.util.ArrayList;

/**
 * Created by lazar on 11/30/2021.
 * Project name: Stock
 **/
public class Portfolio {
    public ArrayList<Stock> listOfStocks = new ArrayList<>();
    public StockExchange stockExchange;

    public Portfolio(StockExchange stockExchange, boolean amendStocks) {
        this.stockExchange = stockExchange;
        if (!amendStocks) {
            return;
        }
        listOfStocks.add(stockExchange.buyStock(new Stock("TSLA", (float) 255.45)));
        listOfStocks.add(stockExchange.buyStock(new Stock("GOOGL", (float) 525.55)));
        listOfStocks.add(stockExchange.buyStock(new Stock("ALP", (float) 423.35)));
        listOfStocks.add(stockExchange.buyStock(new Stock("MCD", (float) 245.3)));
    }

    public float getPriceOfPurchasedStocks() {
        float totalPrice = 0;
        for (Stock stock : listOfStocks) {
            totalPrice += stock.getStockPrice();
        }
        return totalPrice;
    }
}
