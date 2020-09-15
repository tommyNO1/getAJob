package com.leetcode.num37;

import java.util.ArrayList;
import java.util.List;

public class SudokuSolver {
    boolean flag;
    public void solveSudoku(char[][] board) {
        boolean[][] line = new boolean[board.length][9];
        boolean[][] col = new boolean[board[0].length][9];
        boolean[][][] block = new boolean[board.length / 3][board[0].length / 3][9];
        List<int[]> blank = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0';
                    line[i][num - 1] = true;
                    col[j][num - 1] = true;
                    block[i / 3][j / 3][num - 1] = true;

                } else {
                    blank.add(new int[]{i, j});
                }
            }
        }
        dfs(0,line,col,block,blank,board);

    }

    void dfs(int index, boolean[][] line, boolean[][] col, boolean[][][] block, List<int[]> blank,
             char[][] board ) {
        if(index>=blank.size()){
            flag=true;
            return;
        }
        int r = blank.get(index)[0];
        int c = blank.get(index)[1];
        for(int i=0;i<9&&!flag;i++){
            if (!(line[r][i]||col[c][i]||block[r/3][c/3][i])){
                board[r][c]=(char) (i+1+'0');
                line[r][i]=true;
                col[c][i]=true;
                block[r/3][c/3 ][i]=true;
                dfs(index+1,line,col,block,blank,board);
                line[r][i]=false;
                col[c][i]=false;
                block[r/3][c/3][i]=false;
            }
        }
    }
}
