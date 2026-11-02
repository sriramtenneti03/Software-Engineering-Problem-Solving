package com.sriram.dsa.dynamicprogramming;

public final class ClimbingStairs {
    private ClimbingStairs() { }
    /** Keeps only the previous two Fibonacci counts. O(n) time, O(1) space. */
    public static int ways(int n) {
        if (n <= 2) return n;
        int twoBack = 1, oneBack = 2;
        for (int step = 3; step <= n; step++) { int current = twoBack + oneBack; twoBack = oneBack; oneBack = current; }
        return oneBack;
    }
}
