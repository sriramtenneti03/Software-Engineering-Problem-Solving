package com.sriram.dsa.graphs;

import java.util.ArrayDeque;
import java.util.Queue;

public final class RottingOranges {
    private RottingOranges() { }
    /** Spreads rot in BFS layers and returns elapsed minutes. O(rows*cols) time and space. */
    public static int minutes(int[][] grid) {
        int rows = grid.length; if (rows == 0) return 0; int cols = grid[0].length, fresh = 0;
        Queue<int[]> rotten = new ArrayDeque<>();
        for (int r = 0; r < rows; r++) for (int c = 0; c < cols; c++) { if (grid[r][c] == 2) rotten.add(new int[]{r,c}); else if (grid[r][c] == 1) fresh++; }
        int minutes = 0; int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while (fresh > 0 && !rotten.isEmpty()) {
            for (int count = rotten.size(); count > 0; count--) {
                int[] cell = rotten.remove();
                for (int[] direction : directions) { int r = cell[0] + direction[0], c = cell[1] + direction[1];
                    if (r >= 0 && r < rows && c >= 0 && c < cols && grid[r][c] == 1) { grid[r][c] = 2; fresh--; rotten.add(new int[]{r,c}); }
                }
            }
            minutes++;
        }
        return fresh == 0 ? minutes : -1;
    }
}
