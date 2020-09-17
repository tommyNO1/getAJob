package com.leetcode.num685;

public class RedundantConnectionII {
    public int[] findRedundantDirectedConnection(int[][] edges) {
        UnionFind uf = new UnionFind(edges.length);
        int[] parent = new int[edges.length + 1];
        for (int i = 0; i <= edges.length; i++) {
            parent[i] = i;
        }
        int conflict = -1;
        int cycle = -1;
        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            int node1 = edge[0];
            int node2 = edge[1];
            if (parent[node2] != node2) {
                conflict = i;
            } else {
                parent[node2] = node1;
                if (uf.unionFind(node1) == uf.unionFind(node2)) {
                    cycle = i;
                } else {
                    uf.unionJoin(node1, node2);
                }
            }
        }
        if (conflict < 0) {
            int[] res = new int[]{edges[cycle][0], edges[cycle][1]};
            return res;
        } else {
            int[] conflictEdge = edges[conflict];
            if (cycle >= 0) {
                int[] res = new int[]{parent[conflictEdge[1]], conflictEdge[1]};
                return res;
            } else {
                int[] res = new int[]{conflictEdge[0], conflictEdge[1]};
                return res;
            }
        }
    }
}

class UnionFind {
    int[] father;

    UnionFind(int n) {
        father = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            father[i] = i;
        }
    }

    public int unionFind(int x) {
        if (father[x] == x) return x;
        else {
            father[x] = unionFind(father[x]);
            return father[x];
        }
    }

    public void unionJoin(int x, int y) {
        int xFather = unionFind(x);
        int yFather = unionFind(y);
        if (xFather != yFather) {
            father[xFather] = yFather;
        }
    }
}
