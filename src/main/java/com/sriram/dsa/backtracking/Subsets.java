package com.sriram.dsa.backtracking;

import java.util.ArrayList;
import java.util.List;

public final class Subsets {
    private Subsets() { }
    /** Adds each partial choice before extending it. O(n*2^n) time and output space. */
    public static List<List<Integer>> generate(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); build(nums, 0, new ArrayList<>(), result); return result;
    }
    private static void build(int[] nums, int index, List<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path));
        for (int i = index; i < nums.length; i++) { path.add(nums[i]); build(nums, i + 1, path, result); path.remove(path.size() - 1); }
    }
}
