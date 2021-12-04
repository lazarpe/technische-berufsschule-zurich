package com.company;

/**
 * Created by lazar on 11/30/2021.
 * Project name: Stock
 **/
public class Portfolio {
    StockExchange stockExchange;

    public Portfolio(StockExchange stockExchange) {
        this.stockExchange = stockExchange;

        stockExchange.buyStock(new Stock("TSLA", (float) 255.45));
        stockExchange.buyStock(new Stock("GOOGL", (float) 525.55));
        stockExchange.buyStock(new Stock("ALP", (float) 423.35));
        stockExchange.buyStock(new Stock("MCD", (float) 245.3));
    }
}
