package com.leetcode.num617;

public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return dfs(t1, t2);
    }

    private TreeNode dfs(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        if (t1 != null && t2 != null) {
            t1.val += t2.val;
        }
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        TreeNode left = dfs(t1.left, t2.left);
        TreeNode right = dfs(t1.right, t2.right);
        t1.left = left;
        t1.right = right;
        return t1;
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
