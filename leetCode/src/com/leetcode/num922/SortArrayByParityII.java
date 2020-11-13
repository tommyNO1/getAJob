package com.leetcode.num922;

public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        int[] res = new int[A.length];
        int p1 = 0;
        for (int i = 0; i < A.length; i++) {
            if ((A[i] & 1) == 0) {
                res[p1] = A[i];
                p1 += 2;
            }
        }
        p1 = 1;
        for (int i = 0; i < A.length; i++) {
            if ((A[i] & 1) == 1) {
                res[p1] = A[i];
                p1 += 2;
            }
        }
        return res;
    }
}
