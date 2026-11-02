package com.sriram.dsa.arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class BestTimeToBuyAndSellStockTest { @Test void usesBestEarlierBuyOrReturnsZero() { assertEquals(5, BestTimeToBuyAndSellStock.maxProfit(new int[]{7,1,5,3,6,4})); assertEquals(0, BestTimeToBuyAndSellStock.maxProfit(new int[]{7,6,4,3,1})); assertEquals(0, BestTimeToBuyAndSellStock.maxProfit(new int[]{9})); } }
