package com.pinan2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            Main main = new Main();
            System.out.println(main.solveNQueens(a));
        }
    }

    public int solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        boolean[] line = new boolean[n];
        boolean[] main = new boolean[2 * n - 1];
        boolean[] sub = new boolean[2 * n - 1];
        dfs(board, line, main, sub, 0, res);
        return res.size();
    }

    private List<String> convert2board(boolean[][] board) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]) {
                    stringBuilder.append('Q');
                } else {
                    stringBuilder.append('.');
                }
            }
            res.add(stringBuilder.toString());
        }
        return res;
    }

    void dfs(boolean[][] board, boolean[] line, boolean[] main, boolean[] sub, int row,
             List<List<String>> res) {
        if (row == board.length) {
            List<String> temp = convert2board(board);
            res.add(temp);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (!(line[i] || main[row - i + board.length - 1] || sub[row + i])) {
                board[row][i] = true;
                line[i] = true;
                main[row - i + board.length - 1] = true;
                sub[row + i] = true;
                dfs(board, line, main, sub, row + 1, res);
                board[row][i] = false;
                line[i] = false;
                main[row - i + board.length - 1] = false;
                sub[row + i] = false;
            }
        }
    }
}
