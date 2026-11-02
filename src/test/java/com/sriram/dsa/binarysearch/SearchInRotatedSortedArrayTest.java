package com.sriram.dsa.binarysearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class SearchInRotatedSortedArrayTest { @Test void searchesEitherSortedHalf() { assertEquals(4,SearchInRotatedSortedArray.find(new int[]{4,5,6,7,0,1,2},0)); assertEquals(-1,SearchInRotatedSortedArray.find(new int[]{4,5,6,7,0,1,2},3)); assertEquals(0,SearchInRotatedSortedArray.find(new int[]{1},1)); assertEquals(-1,SearchInRotatedSortedArray.find(new int[]{},0)); } }
