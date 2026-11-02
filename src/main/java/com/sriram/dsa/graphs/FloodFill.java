package com.sriram.dsa.graphs;

public final class FloodFill {
    private FloodFill() { }
    /** Recolors the connected component recursively. O(rows*cols) time, O(rows*cols) call stack worst case. */
    public static int[][] fill(int[][] image, int row, int col, int color) {
        int original = image[row][col]; if (original != color) paint(image, row, col, original, color); return image;
    }
    private static void paint(int[][] image, int r, int c, int original, int color) {
        if (r < 0 || r == image.length || c < 0 || c == image[r].length || image[r][c] != original) return;
        image[r][c] = color; paint(image, r + 1, c, original, color); paint(image, r - 1, c, original, color); paint(image, r, c + 1, original, color); paint(image, r, c - 1, original, color);
    }
}
