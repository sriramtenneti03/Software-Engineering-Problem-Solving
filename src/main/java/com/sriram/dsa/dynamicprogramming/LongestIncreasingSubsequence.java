package com.sriram.dsa.dynamicprogramming;

public final class LongestIncreasingSubsequence {
    private LongestIncreasingSubsequence() { }
    /** Maintains the smallest tail for each subsequence length. O(n log n) time, O(n) space. */
    public static int length(int[] nums) {
        int[] tails = new int[nums.length]; int size = 0;
        for (int value : nums) {
            int left = 0, right = size;
            while (left < right) { int mid = left + (right - left) / 2; if (tails[mid] < value) left = mid + 1; else right = mid; }
            tails[left] = value; if (left == size) size++;
        }
        return size;
    }
}
