package com.sriram.dsa.dynamicprogramming;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ClimbingStairsTest { @Test void buildsFibonacciStepCounts() { assertEquals(2,ClimbingStairs.ways(2));assertEquals(3,ClimbingStairs.ways(3));assertEquals(1,ClimbingStairs.ways(1));assertEquals(0,ClimbingStairs.ways(0)); } }
