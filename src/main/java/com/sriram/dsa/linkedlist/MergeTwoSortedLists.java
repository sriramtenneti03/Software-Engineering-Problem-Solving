package com.sriram.dsa.linkedlist;

import com.sriram.dsa.model.ListNode;

public final class MergeTwoSortedLists {
    private MergeTwoSortedLists() { }

    /** Relinks nodes behind a sentinel. O(m+n) time and O(1) auxiliary space. */
    public static ListNode merge(ListNode first, ListNode second) {
        ListNode dummy = new ListNode(0), tail = dummy;
        while (first != null && second != null) {
            if (first.val <= second.val) { tail.next = first; first = first.next; }
            else { tail.next = second; second = second.next; }
            tail = tail.next;
        }
        tail.next = first != null ? first : second;
        return dummy.next;
    }
}
