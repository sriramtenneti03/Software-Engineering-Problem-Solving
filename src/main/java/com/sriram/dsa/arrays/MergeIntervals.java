package com.sriram.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class MergeIntervals {
    private MergeIntervals() { }

    /** Sorts by start and merges overlaps. O(n log n) time, O(n) output space. */
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][2];
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        int start = intervals[0][0], end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) end = Math.max(end, intervals[i][1]);
            else { merged.add(new int[]{start, end}); start = intervals[i][0]; end = intervals[i][1]; }
        }
        merged.add(new int[]{start, end});
        return merged.toArray(int[][]::new);
    }
}
