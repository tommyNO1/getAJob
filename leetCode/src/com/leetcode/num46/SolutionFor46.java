package com.leetcode.num46;

import java.util.ArrayList;
import java.util.List;

public class SolutionFor46 {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        dfs(nums, 0, nums.length, used, path, res);
        return res;
    }

    void dfs(int[] nums, int depth, int len, boolean[] used, List<Integer> path, List<List<Integer>> res) {
        if (depth == len) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                dfs(nums, depth + 1, len, used, path, res);
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }
}
