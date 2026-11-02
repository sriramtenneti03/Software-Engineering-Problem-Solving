package com.sriram.dsa.arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class RotateArrayTest { @Test void rotatesInPlaceForLargeAndNegativeSteps() { int[] values={1,2,3,4,5,6,7}; RotateArray.rotate(values,3); assertArrayEquals(new int[]{5,6,7,1,2,3,4},values); RotateArray.rotate(values,-1); assertArrayEquals(new int[]{6,7,1,2,3,4,5},values); int[] empty={}; RotateArray.rotate(empty,2); assertArrayEquals(new int[]{},empty); } }
