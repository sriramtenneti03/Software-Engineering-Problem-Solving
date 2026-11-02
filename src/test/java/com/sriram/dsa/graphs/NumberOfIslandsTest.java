package com.sriram.dsa.graphs;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class NumberOfIslandsTest { @Test void countsDisconnectedLandWithoutChangingGrid() { char[][] grid={{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}}; assertEquals(3,NumberOfIslands.count(grid)); assertEquals('1',grid[0][0]); assertEquals(0,NumberOfIslands.count(new char[0][0])); } }
