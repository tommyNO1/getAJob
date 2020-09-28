package com.leetcode.num117;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FullRightPoint {
    public Node connect(Node root) {
        if(root==null) return null;
        Queue<Node> que  = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int levelNum = que.size();
            List<Node> temp = new LinkedList<>();
            for(int i = 0;i<levelNum;i++){
                Node node = que.poll();
                temp.add(node);
                if(node.left!=null) que.add(node.left);
                if(node.right!=null) que.add(node.right);
            }
            for(int i=1;i<temp.size();i++){
                temp.get(i-1).next=temp.get(i);
            }
            temp.get(temp.size()-1).next=null;
        }
        return root;
    }
}
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
