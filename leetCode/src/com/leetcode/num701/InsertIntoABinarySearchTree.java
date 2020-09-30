package com.leetcode.num701;

public class InsertIntoABinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val,null,null);
        dfs(root,val);
        return root;
    }

    private void dfs(TreeNode root, int val) {
        if(root.val<val){
            if(root.right==null){
                root.right = new TreeNode(val,null,null);
                return;
            }else {
                dfs(root.right, val);
            }
        }
        if(root.val>val){
            if(root.left==null){
                root.left = new TreeNode(val,null,null);
                return;
            }else {
                dfs(root.left,val);
            }
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}