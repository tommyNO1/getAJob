package com.leetcode.offer66;

public class Solution66 {
    public int[] constructArr(int[] a) {
        if (a.length == 0) return new int[0];
        int[] b = new int[a.length];
        for (int i = 0; i < b.length; i++) b[i] = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                b[i] *= a[j];
            }
        }
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = a.length - 1; j > i; j--) {
                b[i] *= a[j];
            }
        }
        return b;
    }
}
