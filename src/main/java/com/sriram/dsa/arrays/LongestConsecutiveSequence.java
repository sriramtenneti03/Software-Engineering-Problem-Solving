package com.sriram.dsa.arrays;

import java.util.HashSet;

public final class LongestConsecutiveSequence {
    private LongestConsecutiveSequence() { }

    /** Starts runs only at values without a predecessor. O(n) expected time and O(n) space. */
    public static int length(int[] nums) {
        HashSet<Integer> values = new HashSet<>();
        for (int value : nums) values.add(value);
        int longest = 0;
        for (int value : values) if (value == Integer.MIN_VALUE || !values.contains(value - 1)) {
            int run = 1;
            while ((long) value + run <= Integer.MAX_VALUE && values.contains((int) ((long) value + run))) run++;
            longest = Math.max(longest, run);
        }
        return longest;
    }
}
