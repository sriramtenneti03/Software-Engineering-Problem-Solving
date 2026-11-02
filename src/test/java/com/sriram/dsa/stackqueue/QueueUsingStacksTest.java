package com.sriram.dsa.stackqueue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class QueueUsingStacksTest { @Test void maintainsFifoOrderAcrossTransfers() { QueueUsingStacks queue=new QueueUsingStacks(); assertTrue(queue.empty()); queue.push(1); queue.push(2); assertEquals(1,queue.peek()); assertEquals(1,queue.pop()); queue.push(3); assertEquals(2,queue.pop()); assertEquals(3,queue.pop()); assertTrue(queue.empty()); } }
