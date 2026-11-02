package com.sriram.dsa.stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;

/** Stack with O(1) operations and O(n) storage, including constant-time minimum lookup. */
public class MinStack {
    private final Deque<Integer> values = new ArrayDeque<>();
    private final Deque<Integer> minima = new ArrayDeque<>();

    public void push(int value) { values.push(value); if (minima.isEmpty() || value <= minima.peek()) minima.push(value); }
    public int pop() { int value = values.pop(); if (value == minima.peek()) minima.pop(); return value; }
    public int top() { return values.element(); }
    public int getMin() { return minima.element(); }
}
