package com.sriram.dsa.hashing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class SubarraySumEqualsKTest { @Test void countsPrefixSumMatchesWithNegativeValues() { assertEquals(2, SubarraySumEqualsK.count(new int[]{1,1,1},2)); assertEquals(3, SubarraySumEqualsK.count(new int[]{1,-1,0},0)); assertEquals(0, SubarraySumEqualsK.count(new int[]{},4)); } }
