package com.sriram.dsa.linkedlist;

import com.sriram.dsa.model.ListNode;

public final class RemoveNthNodeFromEnd {
    private RemoveNthNodeFromEnd() { }

    /** Uses a lead pointer n steps ahead of the predecessor. O(n) time and O(1) space. */
    public static ListNode remove(ListNode head, int n) {
        if (n <= 0) return head;
        ListNode dummy = new ListNode(0, head), fast = dummy, slow = dummy;
        for (int i = 0; i < n; i++) { fast = fast.next; if (fast == null) return head; }
        while (fast.next != null) { fast = fast.next; slow = slow.next; }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
