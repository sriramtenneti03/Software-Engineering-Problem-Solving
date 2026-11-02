package com.sriram.dsa.binarysearch;

public final class SearchInRotatedSortedArray {
    private SearchInRotatedSortedArray() { }

    /** Identifies the sorted half at each step. O(log n) time, O(1) space. */
    public static int find(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) right = mid - 1; else left = mid + 1;
            } else if (nums[mid] < target && target <= nums[right]) left = mid + 1; else right = mid - 1;
        }
        return -1;
    }
}
