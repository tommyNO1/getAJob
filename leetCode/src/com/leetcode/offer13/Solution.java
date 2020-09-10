package com.leetcode.offer13;

public class Solution {
    public int movingCount(int m, int n, int k) {
        int count = 0;
        int[][] board = new int[m][n];
        dfs(board,0,0,k);
        for(int i=0;i<m-1;i++){
            for(int j=0;j<n-1;j++){
                if(board[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }

    void dfs(int[][]board,int i,int j,int k){
        if(i<0||i>=board.length||j<0||j>=board[0].length||
                (getDigitSum(i)+getDigitSum(j)>k)){
            return;
        }
        if(board[i][j]==1)return;
        board[i][j]=1;
        dfs(board,i+1,j,k);
        dfs(board,i-1,j,k);
        dfs(board,i,j+1,k);
        dfs(board,i,j-1,k);
    }

    int getDigitSum(int number){
        int sum = 0;
        while(number>0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }
}
