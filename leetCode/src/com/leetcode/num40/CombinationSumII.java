package com.leetcode.num40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * 组合排列II
 * tis:将数组排序，然后检测小剪支
 * */
public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(path, res, candidates, target, 0);
        return res;
    }

    private void dfs(List<Integer> path, List<List<Integer>> res, int[] candidates,
                     int target, int start) {
        if (target == 0) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            path.add(candidates[i]);
            dfs(path, res, candidates, target - candidates[i], i + 1);
            path.remove(path.size() - 1);
        }
    }
}
