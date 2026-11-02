package com.sriram.dsa.arrays;

public final class RotateArray {
    private RotateArray() { }

    /** Reverses sections in place. O(n) time, O(1) space. */
    public static void rotate(int[] nums, int k) {
        if (nums.length == 0) return;
        k = Math.floorMod(k, nums.length);
        reverse(nums, 0, nums.length - 1); reverse(nums, 0, k - 1); reverse(nums, k, nums.length - 1);
    }
    private static void reverse(int[] nums, int left, int right) {
        while (left < right) { int value = nums[left]; nums[left++] = nums[right]; nums[right--] = value; }
    }
}
