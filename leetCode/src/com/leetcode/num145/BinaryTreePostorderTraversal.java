package com.leetcode.num145;

import java.util.*;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
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
                if (temp.left != null) {
                    visited.put(temp.left, false);
                    stack.push(temp.left);
                }
                stack.push(temp);
            }
        }
        return res;

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