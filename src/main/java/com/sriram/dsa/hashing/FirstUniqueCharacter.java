package com.sriram.dsa.hashing;

public final class FirstUniqueCharacter {
    private FirstUniqueCharacter() { }

    /** Counts characters then returns the first singleton index. O(n) time, O(1) space for UTF-16. */
    public static int index(String value) {
        int[] counts = new int[Character.MAX_VALUE + 1];
        for (int i = 0; i < value.length(); i++) counts[value.charAt(i)]++;
        for (int i = 0; i < value.length(); i++) if (counts[value.charAt(i)] == 1) return i;
        return -1;
    }
}
