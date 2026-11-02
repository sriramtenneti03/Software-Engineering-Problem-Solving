package com.sriram.dsa.linkedlist;
import com.sriram.dsa.model.ListNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class RemoveNthNodeFromEndTest { @Test void removesTailInteriorOrHead() { ListNode result=RemoveNthNodeFromEnd.remove(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5))))),2); assertEquals(1,result.val);assertEquals(2,result.next.val);assertEquals(3,result.next.next.val);assertEquals(5,result.next.next.next.val); assertEquals(2,RemoveNthNodeFromEnd.remove(new ListNode(1,new ListNode(2)),2).val); ListNode single=new ListNode(1);assertNull(RemoveNthNodeFromEnd.remove(single,1)); assertEquals(1,RemoveNthNodeFromEnd.remove(single,2).val); } }
