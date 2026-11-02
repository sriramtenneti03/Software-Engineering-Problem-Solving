package com.sriram.dsa.stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public final class DailyTemperatures {
    private DailyTemperatures() { }

    /** Resolves pending days with a decreasing monotonic stack. O(n) time and O(n) space. */
    public static int[] waitDays(int[] temperatures) {
        int[] answer = new int[temperatures.length]; Deque<Integer> pending = new ArrayDeque<>();
        for (int day = 0; day < temperatures.length; day++) {
            while (!pending.isEmpty() && temperatures[day] > temperatures[pending.peek()]) {
                int previous = pending.pop(); answer[previous] = day - previous;
            }
            pending.push(day);
        }
        return answer;
    }
}
