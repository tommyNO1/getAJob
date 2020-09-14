package com.leetcode.num94;

import java.util.*;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Map<TreeNode, Boolean> visited = new HashMap<>();
        if (root == null) {
            return new ArrayList<Integer>();
        }
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        visited.put(root, false);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            if (visited.get(temp)) {
                res.add(temp.val);
            } else {
                visited.put(temp, true);
                if (temp.right != null) {
                    visited.put(temp.right, false);
                    stack.push(temp.right);
                }
                stack.push(temp);
                if (temp.left != null) {
                    visited.put(temp.left, false);
                    stack.push(temp.left);
                }
            }
        }
        return res;
    }
}
