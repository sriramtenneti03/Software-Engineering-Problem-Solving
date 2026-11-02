package com.sriram.dsa.graphs;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class RottingOrangesTest { @Test void spreadsByMinutesAndReportsUnreachableFreshFruit() { int[][] grid={{2,1,1},{1,1,0},{0,1,1}}; assertEquals(4,RottingOranges.minutes(grid));assertEquals(2,grid[2][1]); assertEquals(-1,RottingOranges.minutes(new int[][]{{2,1,1},{0,1,1},{1,0,1}}));assertEquals(0,RottingOranges.minutes(new int[][]{{0,2}})); } }
