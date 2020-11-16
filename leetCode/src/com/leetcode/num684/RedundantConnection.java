package com.leetcode.num684;

public class RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        int[] res = new int[2];
        int[] father = new int[edges.length + 1];
        for (int i = 0; i < edges.length + 1; i++) {
            father[i] = i;
        }
        for (int[] num : edges) {
            union(father, num[0], num[1], res);
        }
        return res;
    }

    private int findXFather(int[] father, int x) {
        if (x == father[x]) {
            return x;
        } else {
            father[x] = findXFather(father, father[x]);
            return father[x];
        }
    }

    private void union(int[] father, int x, int y, int[] res) {
        int xFather = findXFather(father, x);
        int yFather = findXFather(father, y);
        if (xFather != yFather) {
            father[xFather] = yFather;
        } else {
            res[0] = x;
            res[1] = y;
        }
    }
}
