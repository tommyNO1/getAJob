package com.leetcode.num257;

import java.util.LinkedList;
import java.util.List;

public class SolutionFor257 {
    List<String> res = new LinkedList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        List<TreeNode> list = new LinkedList<>();
        dfs(root,list);
        return res;
    }

    void dfs(TreeNode root, List<TreeNode> list) {
        if (root == null) return;
        list.add(root);
        if (root.left == null && root.right == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i).val);
                if (i < list.size() - 1) {
                    sb.append("->");
                }
            }
            res.add(sb.toString());
        }
        dfs(root.left, list);
        dfs(root.right, list);
        list.remove(root);
    }

}
