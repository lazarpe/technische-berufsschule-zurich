package com.company;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by lazar on 11/30/2021.
 * Project name: Stock
 **/
class PortfolioTest {

    @BeforeEach
    void setUp() {
        StockExchange stockExchange = new StockExchange() {
            @Override
            public void buyStock(Stock stock) {

            }

            @Override
            public void sellStock(Stock stock) {

            }
        };
    }
}