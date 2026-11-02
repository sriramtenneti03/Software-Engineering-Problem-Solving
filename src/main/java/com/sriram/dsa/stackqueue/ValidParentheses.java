package com.sriram.dsa.stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public final class ValidParentheses {
    private ValidParentheses() { }

    /** Uses a stack of expected closing delimiters. O(n) time and O(n) space. */
    public static boolean isValid(String value) {
        Deque<Character> expected = new ArrayDeque<>();
        for (char ch : value.toCharArray()) {
            if (ch == '(') expected.push(')'); else if (ch == '[') expected.push(']'); else if (ch == '{') expected.push('}');
            else if (expected.isEmpty() || expected.pop() != ch) return false;
        }
        return expected.isEmpty();
    }
}
