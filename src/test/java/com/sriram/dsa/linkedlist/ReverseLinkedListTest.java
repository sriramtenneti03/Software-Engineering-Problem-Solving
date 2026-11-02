package com.sriram.dsa.linkedlist;
import com.sriram.dsa.model.ListNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ReverseLinkedListTest { @Test void reversesLinksAndHandlesEmptyList() { ListNode a=new ListNode(1,new ListNode(2,new ListNode(3))); ListNode reversed=ReverseLinkedList.reverse(a); assertEquals(3,reversed.val); assertEquals(2,reversed.next.val); assertEquals(1,reversed.next.next.val); assertNull(reversed.next.next.next); assertNull(ReverseLinkedList.reverse(null)); } }
