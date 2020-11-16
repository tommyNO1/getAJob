package com.leetcode.lcp19;

public class LeavesCollection {
    public int minimumOperations(String leaves) {
        int[][] dp = new int[leaves.length()][3];
        dp[0][0] = leaves.charAt(0) == 'y' ? 1 : 0;
        dp[0][1] = Integer.MAX_VALUE;
        dp[0][2] = Integer.MAX_VALUE;
        dp[1][2] = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < leaves.length(); j++) {
                int isYellow = leaves.charAt(j) == 'y' ? 1 : 0;
                int isRed = leaves.charAt(j) == 'r' ? 1 : 0;
                if (i == 0) {
                    dp[j][0] = dp[j - 1][0] + isYellow;
                }
                if (i == 1) {
                    dp[j][1] = Math.min(dp[j - 1][0], dp[j - 1][1]) + isRed;
                }
                if (i == 2 && j > 1) {
                    dp[j][2] = Math.min(dp[j - 1][1], dp[j - 1][2]) + isYellow;
                }
            }
        }
        return dp[leaves.length() - 1][2];
    }
}
