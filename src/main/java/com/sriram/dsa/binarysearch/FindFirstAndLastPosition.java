package com.sriram.dsa.binarysearch;

public final class FindFirstAndLastPosition {
    private FindFirstAndLastPosition() { }

    /** Runs lower and upper bound searches. O(log n) time and O(1) space. */
    public static int[] searchRange(int[] nums, int target) {
        int first = bound(nums, target, false);
        if (first == nums.length || nums[first] != target) return new int[]{-1, -1};
        return new int[]{first, bound(nums, target, true) - 1};
    }
    private static int bound(int[] nums, int target, boolean upper) {
        int left = 0, right = nums.length;
        while (left < right) { int mid = left + (right - left) / 2; if (nums[mid] > target || (!upper && nums[mid] == target)) right = mid; else left = mid + 1; }
        return left;
    }
}
