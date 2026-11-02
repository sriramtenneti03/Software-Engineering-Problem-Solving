package com.sriram.dsa.arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ProductOfArrayExceptSelfTest { @Test void combinesPrefixAndSuffixProductsWithZeros() { assertArrayEquals(new int[]{24,12,8,6}, ProductOfArrayExceptSelf.calculate(new int[]{1,2,3,4})); assertArrayEquals(new int[]{0,3,0}, ProductOfArrayExceptSelf.calculate(new int[]{1,0,3})); assertArrayEquals(new int[0], ProductOfArrayExceptSelf.calculate(new int[]{})); } }
