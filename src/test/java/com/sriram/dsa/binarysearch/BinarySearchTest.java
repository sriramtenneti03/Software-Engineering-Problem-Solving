package com.sriram.dsa.binarysearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class BinarySearchTest { @Test void findsTargetOrInsertionMissAcrossBounds() { assertEquals(4,BinarySearch.find(new int[]{-1,0,3,5,9,12},9)); assertEquals(-1,BinarySearch.find(new int[]{-1,0,3,5,9,12},2)); assertEquals(-1,BinarySearch.find(new int[]{},1)); assertEquals(0,BinarySearch.find(new int[]{7},7)); } }
