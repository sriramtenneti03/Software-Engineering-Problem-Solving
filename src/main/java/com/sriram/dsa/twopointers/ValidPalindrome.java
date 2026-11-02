package com.sriram.dsa.twopointers;

public final class ValidPalindrome {
    private ValidPalindrome() { }

    /** Compares only alphanumeric characters, case-insensitively. O(n) time, O(1) space. */
    public static boolean isPalindrome(String value) {
        int left = 0, right = value.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(value.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(value.charAt(right))) right--;
            if (Character.toLowerCase(value.charAt(left++)) != Character.toLowerCase(value.charAt(right--))) return false;
        }
        return true;
    }
}
