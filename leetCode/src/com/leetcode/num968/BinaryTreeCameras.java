package com.leetcode.num968;

public class BinaryTreeCameras {
    int res;
    public int minCameraCover(TreeNode root) {
        if(dfs(root)==0){
            res++;
        }
        return res;
    }

    private int dfs(TreeNode root) {
        if(root==null){
            return 1;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        if(left==0||right==0){
            res++;
            return 2;
        }
        if(left==1&&right==1){
            return 0;
        }
        if(left+right>=3){
            return 1;
        }
        return 0;
    }

    /*
    * dfs节点返回状态
    * 0：该节点不可观测
    * 1：该节点可以观测
    * 2：该节点安装监视器
    * */

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
