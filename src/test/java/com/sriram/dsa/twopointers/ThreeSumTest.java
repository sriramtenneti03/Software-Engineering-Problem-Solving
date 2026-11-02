package com.sriram.dsa.twopointers;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
class ThreeSumTest { @Test void returnsUniqueZeroSumTriplets() { assertEquals(List.of(List.of(-1,-1,2),List.of(-1,0,1)), ThreeSum.find(new int[]{-1,0,1,2,-1,-4})); assertEquals(List.of(), ThreeSum.find(new int[]{0,0,1})); assertEquals(List.of(List.of(Integer.MIN_VALUE,1,Integer.MAX_VALUE)), ThreeSum.find(new int[]{Integer.MIN_VALUE,1,Integer.MAX_VALUE})); } }
