package com.sriram.dsa.graphs;

public final class NumberOfIslands {
    private NumberOfIslands() { }
    /** Flood-fills each unvisited land component. O(rows*cols) time and space. */
    public static int count(char[][] grid) {
        if (grid.length == 0) return 0;
        boolean[][] seen = new boolean[grid.length][grid[0].length]; int islands = 0;
        for (int r = 0; r < grid.length; r++) for (int c = 0; c < grid[r].length; c++)
            if (grid[r][c] == '1' && !seen[r][c]) { islands++; visit(grid, seen, r, c); }
        return islands;
    }
    private static void visit(char[][] grid, boolean[][] seen, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[r].length || seen[r][c] || grid[r][c] != '1') return;
        seen[r][c] = true; visit(grid, seen, r + 1, c); visit(grid, seen, r - 1, c); visit(grid, seen, r, c + 1); visit(grid, seen, r, c - 1);
    }
}
