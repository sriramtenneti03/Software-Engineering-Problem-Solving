package com.sriram.dsa.stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;

/** FIFO queue with O(1) amortized operations and O(n) storage; each element transfers at most once. */
public class QueueUsingStacks {
    private final Deque<Integer> incoming = new ArrayDeque<>(), outgoing = new ArrayDeque<>();
    public void push(int value) { incoming.push(value); }
    public int pop() { transfer(); return outgoing.pop(); }
    public int peek() { transfer(); return outgoing.element(); }
    public boolean empty() { return incoming.isEmpty() && outgoing.isEmpty(); }
    private void transfer() { if (outgoing.isEmpty()) while (!incoming.isEmpty()) outgoing.push(incoming.pop()); }
}
