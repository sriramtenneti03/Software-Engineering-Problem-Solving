package com.sriram.dsa.binarysearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class FindFirstAndLastPositionTest { @Test void returnsInclusiveBoundsForDuplicates() { assertArrayEquals(new int[]{3,4},FindFirstAndLastPosition.searchRange(new int[]{5,7,7,8,8,10},8)); assertArrayEquals(new int[]{-1,-1},FindFirstAndLastPosition.searchRange(new int[]{1,2,3},4)); assertArrayEquals(new int[]{0,0},FindFirstAndLastPosition.searchRange(new int[]{2},2)); } }
