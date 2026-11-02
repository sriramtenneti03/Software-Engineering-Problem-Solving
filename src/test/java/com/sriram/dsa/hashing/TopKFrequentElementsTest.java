package com.sriram.dsa.hashing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class TopKFrequentElementsTest { @Test void returnsFrequentValuesWithStableTies() { assertArrayEquals(new int[]{1,2}, TopKFrequentElements.find(new int[]{1,1,1,2,2,3},2)); assertArrayEquals(new int[]{-1}, TopKFrequentElements.find(new int[]{-1,-1,2},1)); assertArrayEquals(new int[0], TopKFrequentElements.find(new int[]{},0)); } }
