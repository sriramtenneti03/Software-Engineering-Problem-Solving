package com.sriram.dsa.backtracking;

public final class WordSearch {
    private WordSearch() { }
    /** Tries each starting cell and backtracks by restoring the board. O(rows*cols*4^L) worst case, O(L) stack. */
    public static boolean exists(char[][] board, String word) {
        if (word.isEmpty()) return true;
        for (int r = 0; r < board.length; r++) for (int c = 0; c < board[r].length; c++) if (search(board, word, 0, r, c)) return true;
        return false;
    }
    private static boolean search(char[][] board, String word, int index, int r, int c) {
        if (index == word.length()) return true;
        if (r < 0 || r >= board.length || c < 0 || c >= board[r].length || board[r][c] != word.charAt(index)) return false;
        char letter = board[r][c]; board[r][c] = '\0';
        boolean found = search(board, word, index + 1, r + 1, c) || search(board, word, index + 1, r - 1, c)
                || search(board, word, index + 1, r, c + 1) || search(board, word, index + 1, r, c - 1);
        board[r][c] = letter; return found;
    }
}
