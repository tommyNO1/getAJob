package com.leetcode.num216;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        dfs(path, res, k, n, 1);
        return res;
    }

    private void dfs(List<Integer> path, List<List<Integer>> res, int depth, int target, int start) {
        if (depth == 0 && target == 0) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i <= 9; i++) {
            path.add(i);
            dfs(path, res, depth - 1, target - i, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
