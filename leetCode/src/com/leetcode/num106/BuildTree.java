package com.leetcode.num106;

import java.util.Arrays;

public class BuildTree {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0||postorder.length==0)return null;
        if(inorder.length==1){
            return new TreeNode(inorder[0]);
        }
        int index=0;
        int root = postorder[postorder.length - 1];
        for (int i = 0; i < inorder.length; i++) {
            if (root == inorder[i]) {
                index=i;
            }
        }
        int[] leftIn = Arrays.copyOfRange(inorder,0,index);
        int[] rightIn = Arrays.copyOfRange(inorder,index+1,inorder.length);
        int[] leftPos = Arrays.copyOfRange(postorder,0,index);
        int[] rightPos = Arrays.copyOfRange(postorder,index,postorder.length-1);
        TreeNode node = new TreeNode(root);
        node.left = buildTree(leftIn,leftPos);
        node.right = buildTree(rightIn,rightPos);
        return null;
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