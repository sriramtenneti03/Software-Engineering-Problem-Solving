package com.sriram.dsa.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ThreeSum {
    private ThreeSum() { }

    /** Sorts once and skips duplicate choices while scanning pairs. O(n^2) time. */
    public static List<List<Integer>> find(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                long sum = (long) nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    int low = nums[left], high = nums[right];
                    while (left < right && nums[left] == low) left++;
                    while (left < right && nums[right] == high) right--;
                } else if (sum < 0) left++; else right--;
            }
        }
        return result;
    }
}
