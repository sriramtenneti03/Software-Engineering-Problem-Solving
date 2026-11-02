package com.sriram.dsa.linkedlist;
import com.sriram.dsa.model.ListNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MergeTwoSortedListsTest { @Test void mergesByRelinkingAndAcceptsAnEmptySide() { ListNode merged=MergeTwoSortedLists.merge(new ListNode(1,new ListNode(2,new ListNode(4))),new ListNode(1,new ListNode(3,new ListNode(4)))); int[] expected={1,1,2,3,4,4}; for(int value:expected){assertEquals(value,merged.val);merged=merged.next;} assertNull(merged); assertEquals(5,MergeTwoSortedLists.merge(null,new ListNode(5)).val); } }
