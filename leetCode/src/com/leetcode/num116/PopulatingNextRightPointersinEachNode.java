package com.leetcode.num116;

import com.leetcode.dataStruct.Node;

public class PopulatingNextRightPointersinEachNode {
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        if (root.left != null) {
            root.left.next = root.right;
            if (root.next != null) {
                root.right.next = root.next.left;
            }
        }
        root.left = connect(root.left);
        root.right = connect(root.right);
        return root;
    }
}

