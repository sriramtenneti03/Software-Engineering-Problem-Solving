package com.sriram.dsa.arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class LongestConsecutiveSequenceTest { @Test void countsRunsDespiteDuplicatesAndExtremeIntegers() { assertEquals(4, LongestConsecutiveSequence.length(new int[]{100,4,200,1,3,2,2})); assertEquals(0, LongestConsecutiveSequence.length(new int[]{})); assertEquals(2, LongestConsecutiveSequence.length(new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE-1})); } }
