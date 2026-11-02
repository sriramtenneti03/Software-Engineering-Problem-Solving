package com.sriram.dsa.stackqueue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MinStackTest { @Test void tracksMinimumAcrossDuplicateAndNegativeValues() { MinStack stack=new MinStack(); stack.push(-2); stack.push(0); stack.push(-3); assertEquals(-3,stack.getMin()); assertEquals(-3,stack.pop()); assertEquals(0,stack.top()); assertEquals(-2,stack.getMin()); stack.push(-2); assertEquals(-2,stack.pop()); assertEquals(-2,stack.getMin()); } }
