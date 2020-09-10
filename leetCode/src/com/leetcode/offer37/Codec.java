package com.leetcode.offer37;

public class Codec {
    // Encodes a tree to a single string.
    StringBuilder res = new StringBuilder();
    int index = 0;
    public String serialize(TreeNode root) {
        if(root==null) return"[]";
        res.append("[");
        dfs(root);
        res.append("]");
        //String a = res.toString();
        return res.toString();
    }
    void dfs(TreeNode root){
        if(root==null){
            res.append("$,");
            return;
        }
        res.append(root.val+",");
        dfs(root.left);
        dfs(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("[]")) return null;
        String[] vals = data.substring(1, data.length() - 1).split(",");
        return dfs2(vals);
    }

    TreeNode dfs2(String[] vals){
        TreeNode root;
        if(vals[index].equals("$")){
            index++;
            return null;
        }
        root = new TreeNode(Integer.parseInt(vals[index]));
        index++;
        root.left=dfs2(vals);
        root.right=dfs2(vals);
        return root;
    }
}
