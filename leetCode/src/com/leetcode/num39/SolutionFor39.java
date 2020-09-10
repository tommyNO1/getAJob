package com.leetcode.num39;

import java.util.ArrayList;
import java.util.List;

public class SolutionFor39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        int start = 0;
        dfs(path, res, candidates, start, target);
        return res;
    }

    private void dfs(List<Integer> path, List<List<Integer>> res, int[] candidates, int start, int target) {
        if (target == 0) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        if (target < 0) return;
        for (int i = start; i < candidates.length; i++) {
            path.add(candidates[i]);
            dfs(path, res, candidates, i, target-candidates[i]);
            path.remove(path.size() - 1);
        }
    }
}


