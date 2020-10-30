package com.leetcode.num129;

import com.leetcode.dataStruct.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SumNumbers {
    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        List<Integer> res = new ArrayList<>();
        int sum = 0;
        dfs(res,sum,root);
        for(int num:res){
            sum +=num;
        }
        return sum;
    }

    private void dfs(List<Integer> res, int sum, TreeNode root) {
        if(root.left==null&&root.right==null){
            res.add(sum*10+root.val);
            return;
        }
        sum = sum*10+root.val;
        if(root.left!=null)
        dfs(res,sum,root.left);
        if(root.right!=null)
        dfs(res,sum,root.right);
    }
}
