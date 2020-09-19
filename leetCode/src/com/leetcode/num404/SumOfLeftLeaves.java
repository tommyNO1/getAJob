package com.leetcode.num404;


public class SumOfLeftLeaves {
    int sum;

    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root);
        return sum;
    }

    void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left!=null){
            if(root.left.left==null&&root.left.right==null)
            sum +=root.left.val;
        }
        dfs(root.left);
        dfs(root.right);
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
