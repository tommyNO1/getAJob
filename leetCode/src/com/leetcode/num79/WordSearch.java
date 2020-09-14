package com.leetcode.num79;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, 0, i, j, word))
                return true;
            }
        }
        return false;

    }

    Boolean dfs(char[][] board, int depth, int i, int j, String word) {
        if (depth >= word.length()) {
            return true;
        }
        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1||board[i][j]!=word.charAt(depth)) {
            return false;
        }
        board[i][j] +=26;
        boolean res = dfs(board, depth + 1, i + 1, j, word)
                || dfs(board, depth + 1, i - 1, j, word)
                || dfs(board, depth + 1, i, j + 1, word)
                || dfs(board, depth + 1, i, j - 1, word);
        board[i][j] -=26;
        return res;
    }
}
