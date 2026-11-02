package com.sriram.dsa.arrays;

public final class MaximumSubarray {
    private MaximumSubarray() { }

    /** Kadane's scan keeps the best subarray ending at each index. O(n) time, O(1) space. */
    public static int maxSum(int[] nums) {
        int current = nums[0], best = nums[0];
        for (int i = 1; i < nums.length; i++) { current = Math.max(nums[i], current + nums[i]); best = Math.max(best, current); }
        return best;
    }
}
