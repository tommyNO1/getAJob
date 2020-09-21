package com.leetcode.num78;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length+1;i++){
            dfs(path,res,nums,0,i,0);

        }
        return res;
    }

    private void dfs(List<Integer> path, List<List<Integer>> res, int[] nums, int depth, int targetDepth, int start) {
        if(depth==targetDepth){
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for(int i=start;i<nums.length;i++){
            path.add(nums[i]);
            dfs(path,res,nums,depth+1,targetDepth,i+1);
            path.remove(path.size()-1);
        }
    }

}
