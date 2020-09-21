package com.leetcode.num547;

import java.util.HashSet;
import java.util.Set;

public class FriendCircles {
    public int findCircleNum(int[][] M) {
        int n = M.length;
        UnionFind unionFind = new UnionFind(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(M[i][j]==1){
                    unionFind.join(j,i);
                }
            }
        }
        int[] res = unionFind.getArr();
        int count = 0;
        Set<Integer> root = new HashSet<>();
        for(int i=0;i<res.length;i++){
            root.add(unionFind.find(res[i]));
        }
        return root.size();
    }
}

class UnionFind {
    private int[] arr;

    public int[] getArr() {
        return arr;
    }

    public UnionFind(int n) {
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
    }

    public int find(int x) {
        if (x == arr[x]) {
            return x;
        } else {
            arr[x] = find(arr[x]);
            return arr[x];
        }
    }

    public void join(int x, int y) {
        int xFather = find(x);
        int yFather = find(y);
        if (xFather != yFather) {
            arr[xFather] = yFather;
        }
    }
}
