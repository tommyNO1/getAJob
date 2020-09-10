package com.leetcode.offer63;

public class Solution63 {
    public int maxProfit(int[] prices){
        if(prices.length==0) return -1;
        int[] dp = new int[prices.length];
        dp[0]=0;
        int max =0;
        for(int i=1;i<dp.length;i++){
            for(int j=i-1;j>0;j--){
                int temp = prices[i]-prices[j];
                if(temp>max){
                    max = temp;
                }
            }
            dp[i]=max;
        }
        return dp[dp.length-1];
    }
}
