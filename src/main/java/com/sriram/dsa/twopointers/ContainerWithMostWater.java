package com.sriram.dsa.twopointers;

public final class ContainerWithMostWater {
    private ContainerWithMostWater() { }

    /** Moves the shorter wall inward because it limits the current area. O(n) time, O(1) space. */
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1, best = 0;
        while (left < right) {
            best = Math.max(best, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) left++; else right--;
        }
        return best;
    }
}
