package com.sriram.dsa.backtracking;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class WordSearchTest { @Test void searchesAdjacentCellsAndRestoresTheBoard() { char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};char[][] before={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};assertTrue(WordSearch.exists(board,"ABCCED"));assertArrayEquals(before,board);assertTrue(WordSearch.exists(board,"SEE"));assertFalse(WordSearch.exists(board,"ABCB"));assertTrue(WordSearch.exists(new char[][]{{'A'}},"")); } }
