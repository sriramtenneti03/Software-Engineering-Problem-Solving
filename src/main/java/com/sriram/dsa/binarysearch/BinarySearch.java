package com.sriram.dsa.binarysearch;

public final class BinarySearch {
    private BinarySearch() { }

    /** Iterative search in a sorted array. O(log n) time and O(1) space. */
    public static int find(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) { int middle = left + (right - left) / 2; if (nums[middle] == target) return middle; if (nums[middle] < target) left = middle + 1; else right = middle - 1; }
        return -1;
    }
}
