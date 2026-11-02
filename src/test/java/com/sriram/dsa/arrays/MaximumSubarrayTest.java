package com.sriram.dsa.arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MaximumSubarrayTest { @Test void handlesMixedAndAllNegativeValues() { assertEquals(6, MaximumSubarray.maxSum(new int[]{-2,1,-3,4,-1,2,1,-5,4})); assertEquals(-2, MaximumSubarray.maxSum(new int[]{-5,-2,-8})); assertEquals(3, MaximumSubarray.maxSum(new int[]{3})); } }
