package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import javax.sound.sampled.Port;
import java.util.ArrayList;

/**
 * Created by lazar on 11/30/2021.
 * Project name: Stock
 **/
class PortfolioTest {

    Portfolio portfolio;

    @BeforeEach
    void setUp() {
        portfolio = new Portfolio(new TokyoStockExchange(), false);

        portfolio.listOfStocks.add(portfolio.stockExchange.buyStock(new Stock("Microsoft", (float) 100.0)));
        portfolio.listOfStocks.add(portfolio.stockExchange.buyStock(new Stock("Microsoft", (float) 100.0)));
        portfolio.listOfStocks.add(portfolio.stockExchange.buyStock(new Stock("Microsoft", (float) 100.0)));
        portfolio.listOfStocks.add(portfolio.stockExchange.buyStock(new Stock("Microsoft", (float) 100.0)));
        portfolio.listOfStocks.add(portfolio.stockExchange.buyStock(new Stock("Microsoft", (float) 100.0)));
    }

    @Test
    @DisplayName("Test total price of purchased stocks")
    void testPriceOfPurchasedStocks() {
        Assertions.assertEquals(500, portfolio.getPriceOfPurchasedStocks(), "Total should be 500 --> True");
    }
}