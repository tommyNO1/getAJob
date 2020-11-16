package com.leetcode.num973;

import java.util.Arrays;
import java.util.Comparator;

public class KClosest {
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int sq1 = o1[0] * o1[0] + o1[1] * o1[1];
                int sq2 = o2[0] * o2[0] + o2[1] * o2[1];
                return sq1 - sq2;
            }
        });
        int[][] res = new int[K][2];
        for (int i = 0; i < K; i++) {
            res[i] = points[i];
        }
        return res;
    }
}
