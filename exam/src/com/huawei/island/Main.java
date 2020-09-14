package com.huawei.island;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] strArr = s.split(",");
        int m=Integer.parseInt(strArr[0]);
        int n=Integer.parseInt(strArr[1]);
        char[][] board = new char[m][n];
        for(int i=0;i<m;i++){
            String a = in.nextLine();
            for(int j=0;j<n;j++){
                board[i][j]=a.charAt(j);
            }
        }
        System.out.println(getNums(board));
    }
    private static void dfs(char[][] board,int r,int c){
        int numR = board.length;
        int numC = board[0].length;
        if(r<0||c<0||r>=numR||c>=numC||board[r][c]=='H'){
            return;
        }
        board[r][c]='H';
        dfs(board,r-1,c);
        dfs(board,r+1,c);
        dfs(board,r,c-1);
        dfs(board,r,c+1);
    }

    private static int getNums(char[][] board){
        if(board==null||board.length==0){
            return 0;
        }
        int numR = board.length;
        int numC = board[0].length;
        int count=0;
        for(int r=0;r<numR;r++){
            for (int c=0;c<numC;c++){
                if(board[r][c]=='S'){
                    ++count;
                    dfs(board,r,c);
                }
            }
        }
        return count;
    }
}
