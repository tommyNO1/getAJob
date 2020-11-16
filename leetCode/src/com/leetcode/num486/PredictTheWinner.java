package com.leetcode.num486;

public class PredictTheWinner {
    public boolean PredictTheWinner(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    dp[i][j] = nums[i];
                }
            }
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            for (int j = nums.length - 1; j >= 1; j--) {
                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
            }
        }
        if (dp[0][nums.length - 1] > 0) {
            return true;
        } else {
            return false;
        }
    }
}
