package com.leetcode.num530;

import com.leetcode.dataStructure.TreeNode;

public class MinimumAbsoluteDifferenceInBST {
    int min=Integer.MAX_VALUE;
    TreeNode pre = null;
    public int getMinimumDifference(TreeNode root) {
        if(root==null){
            return min;
        }
        getMinimumDifference(root.left);
        if(pre==null){
            pre=root;
        }else {
            min = Math.min(min,root.val-pre.val);
        }
        getMinimumDifference(root.right);
        return min;
    }
}
