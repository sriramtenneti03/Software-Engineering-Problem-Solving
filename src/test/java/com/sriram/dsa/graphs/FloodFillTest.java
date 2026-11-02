package com.sriram.dsa.graphs;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class FloodFillTest { @Test void recolorsOnlyConnectedPixelsAndAvoidsUnneededWork() { int[][] image={{1,1,1},{1,1,0},{1,0,1}}; assertSame(image,FloodFill.fill(image,1,1,2));assertArrayEquals(new int[][]{{2,2,2},{2,2,0},{2,0,1}},image); FloodFill.fill(image,0,0,2);assertArrayEquals(new int[][]{{2,2,2},{2,2,0},{2,0,1}},image); } }
