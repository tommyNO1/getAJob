package com.leetcode.num77;

import java.util.ArrayList;
import java.util.List;

public class SolutionFor77 {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        dfs(path, res, 1, n, k);
        return res;
    }

    private void dfs(List<Integer> path, List<List<Integer>> res, int start, int n, int k) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <= n - (path.size() - k) + 1; i++) {
            path.add(i);
            dfs(path, res, i + 1, n, k);
            path.remove(path.size() - 1);
        }
    }


}
