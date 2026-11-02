package com.sriram.dsa.hashing;

public final class IsomorphicStrings {
    private IsomorphicStrings() { }

    /** Checks both mapping directions in one pass. O(n) time, O(1) space for UTF-16. */
    public static boolean areIsomorphic(String first, String second) {
        if (first.length() != second.length()) return false;
        int[] forward = new int[Character.MAX_VALUE + 1], reverse = new int[Character.MAX_VALUE + 1];
        for (int i = 0; i < first.length(); i++) {
            char a = first.charAt(i), b = second.charAt(i);
            if (forward[a] != reverse[b]) return false;
            forward[a] = reverse[b] = i + 1;
        }
        return true;
    }
}
