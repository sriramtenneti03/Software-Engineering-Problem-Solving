package com.sriram.dsa.arrays;

public final class ProductOfArrayExceptSelf {
    private ProductOfArrayExceptSelf() { }

    /** Builds prefix products, then folds in suffix products. O(n) time, O(1) extra space (excluding output). */
    public static int[] calculate(int[] nums) {
        int[] result = new int[nums.length];
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) { result[i] = prefix; prefix *= nums[i]; }
        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) { result[i] *= suffix; suffix *= nums[i]; }
        return result;
    }
}
