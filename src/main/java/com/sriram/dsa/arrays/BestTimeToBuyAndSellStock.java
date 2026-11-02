package com.sriram.dsa.arrays;

public final class BestTimeToBuyAndSellStock {
    private BestTimeToBuyAndSellStock() { }

    /** Tracks the cheapest earlier price. O(n) time, O(1) space. */
    public static int maxProfit(int[] prices) {
        int lowest = Integer.MAX_VALUE, profit = 0;
        for (int price : prices) {
            lowest = Math.min(lowest, price);
            profit = Math.max(profit, price - lowest);
        }
        return profit;
    }
}
