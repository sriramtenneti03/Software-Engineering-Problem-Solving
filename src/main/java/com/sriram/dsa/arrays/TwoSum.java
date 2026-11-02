package com.sriram.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public final class TwoSum {
    private TwoSum() { }

    /** Finds the first complement seen so far. O(n) time and O(n) space. */
    public static int[] find(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            long complement = (long) target - nums[i];
            if (complement >= Integer.MIN_VALUE && complement <= Integer.MAX_VALUE) {
                Integer other = indices.get((int) complement);
                if (other != null) return new int[]{other, i};
            }
            indices.put(nums[i], i);
        }
        return new int[0];
    }
}
