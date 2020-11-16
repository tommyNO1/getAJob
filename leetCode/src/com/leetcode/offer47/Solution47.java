package com.leetcode.offer47;

public class Solution47 {
    public int maxValue(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int temp = grid[i][j];
                if (i == 0 && j == 0) {
                    grid[i][j] = temp;
                }
                if (i == 0 && j != 0) {
                    grid[i][j] = temp + grid[i][j - 1];
                }
                if (i != 0 && j == 0) {
                    grid[i][j] = temp + grid[i - 1][j];
                }
                if (i != 0 && j != 0) {
                    grid[i][j] = temp + Math.max(grid[i - 1][j], grid[i][j - 1]);
                }
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}
