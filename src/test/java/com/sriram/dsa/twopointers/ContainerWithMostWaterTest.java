package com.sriram.dsa.twopointers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ContainerWithMostWaterTest { @Test void findsBestPairOfWalls() { assertEquals(49, ContainerWithMostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7})); assertEquals(1, ContainerWithMostWater.maxArea(new int[]{1,1})); assertEquals(0, ContainerWithMostWater.maxArea(new int[]{4})); } }
