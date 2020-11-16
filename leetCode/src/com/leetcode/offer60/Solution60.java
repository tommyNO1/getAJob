package com.leetcode.offer60;

public class Solution60 {
    public double[] twoSum(int n) {
        int[][] dp = new int[6 * n + 1][n + 1];
        for (int i = 1; i <= 6; i++) {
            dp[i][1] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = i * 6; j >= i; j--) {
                for (int k = 1; k <= 6; k++) {
                    if (j - k <= 0) break;
                    dp[j][i] += dp[j - k][i - 1];
                }
            }
        }
        double[] res = new double[6 * n - n + 1];
        for (int i = n; i <= 6 * n; i++) {
            res[i - n] = dp[i][n] / Math.pow(6, n);
        }
        return res;
    }
}
