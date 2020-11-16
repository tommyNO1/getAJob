package com.leetcode.offer55;


public class Solution55 {
    public boolean isBalanced(TreeNode root) {
        if (recur(root) == -1) return false;
        return true;
    }

    int recur(TreeNode root) {
        if (root == null) return 0;
        int left = recur(root.left);
        if (left == -1) return -1;
        int right = recur(root.right);
        if (right == -1) return -1;
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return left < right ? left + 1 : right + 1;
    }
}
