package com.sriram.dsa.arrays;

public final class MoveZeroes {
    private MoveZeroes() { }

    /** Compacts nonzero values in place, preserving order. O(n) time, O(1) space. */
    public static void move(int[] nums) {
        int write = 0;
        for (int value : nums) if (value != 0) nums[write++] = value;
        while (write < nums.length) nums[write++] = 0;
    }
}
