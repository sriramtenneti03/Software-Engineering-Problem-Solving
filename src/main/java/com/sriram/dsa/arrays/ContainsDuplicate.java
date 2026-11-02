package com.sriram.dsa.arrays;

import java.util.HashSet;

public final class ContainsDuplicate {
    private ContainsDuplicate() { }

    /** Stops when a value has already appeared. O(n) time and O(n) space. */
    public static boolean contains(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int value : nums) if (!seen.add(value)) return true;
        return false;
    }
}
