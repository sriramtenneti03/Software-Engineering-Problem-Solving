package com.sriram.dsa.arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MoveZeroesTest { @Test void preservesNonzeroOrderAndMutatesArray() { int[] values={0,1,0,3,12}; MoveZeroes.move(values); assertArrayEquals(new int[]{1,3,12,0,0},values); int[] unchanged={1,2}; MoveZeroes.move(unchanged); assertArrayEquals(new int[]{1,2},unchanged); } }
