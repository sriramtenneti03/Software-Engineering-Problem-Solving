package com.sriram.dsa.dynamicprogramming;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class HouseRobberTest { @Test void skipsAdjacentHousesAndHandlesEmptyInput() { assertEquals(4,HouseRobber.maxAmount(new int[]{1,2,3,1}));assertEquals(12,HouseRobber.maxAmount(new int[]{2,7,9,3,1}));assertEquals(0,HouseRobber.maxAmount(new int[]{}));assertEquals(5,HouseRobber.maxAmount(new int[]{5})); } }
