package com.sriram.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public final class SubarraySumEqualsK {
    private SubarraySumEqualsK() { }

    /** Counts matching prefix-sum differences. O(n) time and O(n) space. */
    public static int count(int[] nums, int k) {
        Map<Integer, Integer> prefixes = new HashMap<>(); prefixes.put(0, 1);
        int sum = 0, result = 0;
        for (int value : nums) { sum += value; result += prefixes.getOrDefault(sum - k, 0); prefixes.merge(sum, 1, Integer::sum); }
        return result;
    }
}
