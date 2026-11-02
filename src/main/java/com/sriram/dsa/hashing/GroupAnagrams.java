package com.sriram.dsa.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class GroupAnagrams {
    private GroupAnagrams() { }

    /** Groups by sorted-character signature and preserves first-seen group order. O(n m log m) time. */
    public static List<List<String>> group(String[] words) {
        Map<String, List<String>> groups = new LinkedHashMap<>();
        for (String word : words) {
            char[] letters = word.toCharArray(); Arrays.sort(letters);
            groups.computeIfAbsent(new String(letters), key -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(groups.values());
    }
}
