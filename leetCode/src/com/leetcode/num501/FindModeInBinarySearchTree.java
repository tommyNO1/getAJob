package com.leetcode.num501;


import java.util.ArrayList;
import java.util.List;

public class FindModeInBinarySearchTree {
    int count;
    int max;
    TreeNode pre;

    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    private void dfs(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        dfs(root.left, list);
        if (pre != null) {
            if (root.val != pre.val) {
                count = 1;
            } else {
                count++;
            }
        } else {
            count = 1;
        }
        pre = root;
        if (count == max) {
            list.add(root.val);
        }
        if (count > max) {
            max = count;
            list.clear();
            list.add(root.val);
        }
        dfs(root.right, list);
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
