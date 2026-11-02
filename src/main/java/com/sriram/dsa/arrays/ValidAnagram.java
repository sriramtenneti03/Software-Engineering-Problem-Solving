package com.sriram.dsa.arrays;

public final class ValidAnagram {
    private ValidAnagram() { }

    /** Counts UTF-16 characters from one string against the other. O(n) time, O(1) space for the char range. */
    public static boolean isAnagram(String first, String second) {
        if (first.length() != second.length()) return false;
        int[] counts = new int[Character.MAX_VALUE + 1];
        for (int i = 0; i < first.length(); i++) { counts[first.charAt(i)]++; counts[second.charAt(i)]--; }
        for (int count : counts) if (count != 0) return false;
        return true;
    }
}
