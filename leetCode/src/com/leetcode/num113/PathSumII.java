package com.leetcode.num113;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        dfs(path,res,root,sum);
        return res;
    }

    private void dfs(List<Integer> path, List<List<Integer>> res, TreeNode root, int target) {
        if(root==null){
            return;
        }
        path.add(root.val);
        target = target -root.val;
        if(target==0&&root.left==null&&root.right==null){
            res.add(new ArrayList<Integer>(path));
        }
        dfs(path,res,root.left,target);
        dfs(path,res,root.right,target);
        path.remove(path.size()-1);
        target = target + root.val;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}