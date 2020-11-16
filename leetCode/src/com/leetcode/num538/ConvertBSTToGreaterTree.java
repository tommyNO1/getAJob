package com.leetcode.num538;

public class ConvertBSTToGreaterTree {
    int sum;

    public TreeNode convertBST(TreeNode root) {
        TreeNode head = root;
        dfs(root);
        return head;

    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.right);
        sum += root.val;
        root.val = sum;
        dfs(root.left);
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
