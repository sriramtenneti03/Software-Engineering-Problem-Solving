package com.sriram.dsa.dynamicprogramming;

import java.util.Arrays;

public final class CoinChange {
    private CoinChange() { }
    /** Builds minimum coin counts from amount zero upward. O(amount*coins) time, O(amount) space. */
    public static int minCoins(int[] coins, int amount) {
        int[] best = new int[amount + 1]; Arrays.fill(best, amount + 1); best[0] = 0;
        for (int value = 1; value <= amount; value++) for (int coin : coins) if (coin > 0 && coin <= value) best[value] = Math.min(best[value], best[value - coin] + 1);
        return best[amount] > amount ? -1 : best[amount];
    }
}
