package com.leetcode.num226;



public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode node;
        node = root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(node);
        return root;
    }
}
