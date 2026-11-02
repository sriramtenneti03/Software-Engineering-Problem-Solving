package com.sriram.dsa.linkedlist;

import com.sriram.dsa.model.ListNode;

public final class ReverseLinkedList {
    private ReverseLinkedList() { }

    /** Reverses next pointers iteratively. O(n) time and O(1) space. */
    public static ListNode reverse(ListNode head) {
        ListNode previous = null, current = head;
        while (current != null) { ListNode next = current.next; current.next = previous; previous = current; current = next; }
        return previous;
    }
}
