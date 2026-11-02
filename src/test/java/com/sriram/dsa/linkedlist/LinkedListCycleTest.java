package com.sriram.dsa.linkedlist;
import com.sriram.dsa.model.ListNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class LinkedListCycleTest { @Test void detectsCycleByNodeIdentity() { ListNode a=new ListNode(1),b=new ListNode(2),c=new ListNode(3); a.next=b;b.next=c;c.next=b; assertTrue(LinkedListCycle.hasCycle(a)); c.next=null; assertFalse(LinkedListCycle.hasCycle(a)); assertFalse(LinkedListCycle.hasCycle(null)); } }
