package com.leetcode.num18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        dfs(path, res, nums, target, 0, 0);
        return res;
    }

    private void dfs(List<Integer> path, List<List<Integer>> res, int[] nums, int target, int start, int depth) {
        if (depth == 4) {
            if (target == 0) {
                res.add(new ArrayList<Integer>(path));
            }
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            if (3 - depth < nums.length - i - 1) {
                continue;
            }
            path.add(nums[i]);
            dfs(path, res, nums, target - nums[i], i + 1, depth + 1);
            path.remove(path.size() - 1);
        }
    }
}
