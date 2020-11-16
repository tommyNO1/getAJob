package com.leetcode.num47;

import java.util.ArrayList;
import java.util.List;

public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        int depth = 0;
        dfs(path, res, nums, used, depth);
        return res;
    }

    private void dfs(List<Integer> path, List<List<Integer>> res, int[] nums, boolean[] used, int depth) {
        if (depth == nums.length) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !used[i] && !used[i - 1]) {
                continue;
            }
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                dfs(path, res, nums, used, depth + 1);
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }


}
