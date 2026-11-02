package com.sriram.dsa.twopointers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MinimumSizeSubarraySumTest { @Test void returnsShortestWindowOrZeroWhenImpossible() { assertEquals(2, MinimumSizeSubarraySum.minLength(7,new int[]{2,3,1,2,4,3})); assertEquals(1, MinimumSizeSubarraySum.minLength(4,new int[]{1,4,4})); assertEquals(0, MinimumSizeSubarraySum.minLength(11,new int[]{1,1,1,1})); } }
