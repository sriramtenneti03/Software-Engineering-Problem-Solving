package com.sriram.dsa.binarysearch;

public final class KokoEatingBananas {
    private KokoEatingBananas() { }

    /** Binary-searches the minimum feasible eating speed. O(n log maxPile) time and O(1) space. */
    public static int minEatingSpeed(int[] piles, int hours) {
        int left = 1, right = 0;
        for (int pile : piles) right = Math.max(right, pile);
        while (left < right) {
            int speed = left + (right - left) / 2;
            long needed = 0;
            for (int pile : piles) needed += (pile + (long) speed - 1) / speed;
            if (needed <= hours) right = speed; else left = speed + 1;
        }
        return left;
    }
}
