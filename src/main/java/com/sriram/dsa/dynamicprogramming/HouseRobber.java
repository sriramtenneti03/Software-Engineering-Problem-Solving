package com.sriram.dsa.dynamicprogramming;

public final class HouseRobber {
    private HouseRobber() { }
    /** Carries best totals excluding and including the current house. O(n) time, O(1) space. */
    public static int maxAmount(int[] houses) {
        int twoBack = 0, oneBack = 0;
        for (int money : houses) { int current = Math.max(oneBack, twoBack + money); twoBack = oneBack; oneBack = current; }
        return oneBack;
    }
}
