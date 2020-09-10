package com.leetcode.num5;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int len = s.length();
        List<int[]> index = new ArrayList<>();
        boolean[][] dp = new boolean[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<=i;j++){
                    dp[i][j]=true;

            }
        }
        for(int j=1;j<len;j++){
            for(int i=0;i<j;i++){
                dp[i][j] = s.charAt(i)==s.charAt(j)&&dp[i+1][j-1];

                if(dp[i][j]){
                    index.add(new int[]{i,j});
                }
            }
        }
        int max = 0;
        int begin = 0;
        int end = 0;
        for(int[] arr:index){
            if(arr[1]-arr[0]>max){
                max=arr[1]-arr[0];
                begin=arr[0];
                end = arr[1];
            }
        }
        return s.substring(begin,end+1);
    }
}
