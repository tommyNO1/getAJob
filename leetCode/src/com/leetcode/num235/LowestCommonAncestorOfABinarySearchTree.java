package com.leetcode.num235;

public class LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root.val < Math.max(p.val, q.val) && root.val > Math.min(p.val, q.val)) {
            return root;
        }
        if (root.val == p.val || root.val == q.val) {
            return root;
        }
        if (root.val > Math.max(p.val, q.val)) {
            root = lowestCommonAncestor(root.left, p, q);
        }
        if (root.val < Math.min(p.val, q.val)) {
            root = lowestCommonAncestor(root.right, p, q);
        }
        return root;
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