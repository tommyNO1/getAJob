package com.leetcode.offer49;

public class Solution49 {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        int a = 0;
        int b = 0;
        int c = 0;
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            int temp = Math.min(dp[a] * 2, dp[b] * 3);
            temp = Math.min(temp, dp[c] * 5);
            dp[i] = temp;
            if (dp[a] * 2 == dp[i]) a++;
            if (dp[b] * 3 == dp[i]) b++;
            if (dp[c] * 5 == dp[i]) c++;
        }
        return dp[n - 1];
    }

}
