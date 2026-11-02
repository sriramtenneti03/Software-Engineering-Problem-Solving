package com.sriram.dsa.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class CombinationSum {
    private CombinationSum() { }
    /** Searches sorted positive candidates and reuses the current index. Complexity is output-sensitive. */
    public static List<List<Integer>> find(int[] candidates, int target) {
        int[] sorted = Arrays.copyOf(candidates, candidates.length); Arrays.sort(sorted);
        List<List<Integer>> result = new ArrayList<>(); build(sorted, target, 0, new ArrayList<>(), result); return result;
    }
    private static void build(int[] values, int remaining, int start, List<Integer> path, List<List<Integer>> result) {
        if (remaining == 0) { result.add(new ArrayList<>(path)); return; }
        for (int i = start; i < values.length && values[i] <= remaining; i++) {
            if (i > start && values[i] == values[i - 1]) continue;
            path.add(values[i]); build(values, remaining - values[i], i, path, result); path.remove(path.size() - 1);
        }
    }
}
