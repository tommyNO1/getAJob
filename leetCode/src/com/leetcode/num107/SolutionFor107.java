package com.leetcode.num107;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SolutionFor107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return new LinkedList<List<Integer>>();
        Queue<TreeNode> que = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()) {
            int levelNum = que.size();
            List<Integer> temp = new LinkedList<>();
            for (int i = 0; i < levelNum; i++) {
                TreeNode node = que.poll();
                temp.add(node.val);
                if (node.left != null) que.add(node.left);
                if (node.right != null) que.add(node.right);
            }
            res.add(0, temp);
        }
        return res;
    }
}
