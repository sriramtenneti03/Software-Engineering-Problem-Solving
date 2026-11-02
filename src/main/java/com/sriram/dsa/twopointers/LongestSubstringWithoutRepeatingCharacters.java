package com.sriram.dsa.twopointers;

import java.util.HashMap;
import java.util.Map;

public final class LongestSubstringWithoutRepeatingCharacters {
    private LongestSubstringWithoutRepeatingCharacters() { }

    /** Jumps the left edge past a repeated character. O(n) time, O(min(n, alphabet)) space. */
    public static int length(String value) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int left = 0, best = 0;
        for (int right = 0; right < value.length(); right++) {
            Integer previous = lastSeen.put(value.charAt(right), right);
            if (previous != null) left = Math.max(left, previous + 1);
            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}
