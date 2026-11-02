package com.sriram.dsa.arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ContainsDuplicateTest { @Test void detectsDuplicatesIncludingNegativeValues() { assertTrue(ContainsDuplicate.contains(new int[]{1,2,3,1})); assertTrue(ContainsDuplicate.contains(new int[]{-4,0,-4})); assertFalse(ContainsDuplicate.contains(new int[]{1,2,3})); assertFalse(ContainsDuplicate.contains(new int[]{})); } }
