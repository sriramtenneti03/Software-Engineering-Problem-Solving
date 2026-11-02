package com.sriram.dsa.dynamicprogramming;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class LongestIncreasingSubsequenceTest { @Test void replacesTailsForStrictlyIncreasingSubsequences() { assertEquals(4,LongestIncreasingSubsequence.length(new int[]{10,9,2,5,3,7,101,18}));assertEquals(4,LongestIncreasingSubsequence.length(new int[]{0,1,0,3,2,3}));assertEquals(1,LongestIncreasingSubsequence.length(new int[]{7,7,7}));assertEquals(0,LongestIncreasingSubsequence.length(new int[]{})); } }
