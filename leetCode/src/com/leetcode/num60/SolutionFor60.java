package com.leetcode.num60;

public class SolutionFor60 {
    private int n;
    private int k;
    private boolean[] used;
    private int[] factorial;

    public String getPermutation(int n, int k) {
        this.n = n;
        this.k = k;
        factorial = new int[n + 1];
        factorial[0] = 1;
        for (int i = 1; i < n + 1; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
        used = new boolean[n + 1];
        StringBuilder path = new StringBuilder();
        dfs(0, path);
        return path.toString();

    }

    void dfs(int depth, StringBuilder path) {
        if (depth == n) {
            return;
        }
        int count = factorial[n - 1 - depth];
        for (int i = 1; i < n + 1; i++) {
            if (used[i]) {
                continue;
            }
            if (count < k) {
                k -= count;
                continue;
            }
            path.append(i);
            used[i] = true;
            dfs(depth + 1, path);
        }
    }
}
