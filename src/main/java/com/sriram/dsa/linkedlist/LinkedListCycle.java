package com.sriram.dsa.linkedlist;

import com.sriram.dsa.model.ListNode;

public final class LinkedListCycle {
    private LinkedListCycle() { }

    /** Floyd's tortoise-and-hare check. O(n) time and O(1) space. */
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) { slow = slow.next; fast = fast.next.next; if (slow == fast) return true; }
        return false;
    }
}
