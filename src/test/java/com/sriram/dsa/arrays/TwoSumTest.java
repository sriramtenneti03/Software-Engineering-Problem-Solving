package com.sriram.dsa.arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class TwoSumTest { @Test void findsDistinctIndicesAndHandlesNoPair() { assertArrayEquals(new int[]{0,1}, TwoSum.find(new int[]{2,7,11,15},9)); assertArrayEquals(new int[]{0,1}, TwoSum.find(new int[]{3,3},6)); assertArrayEquals(new int[0], TwoSum.find(new int[]{1},4)); } }
