package com.leetcode.offer56;

public class Solution56 {
    public int[] singleNumbers(int[] nums) {
        int k = 0;
        for (int num : nums) {
            k ^= num;
        }
        int mask = 1;
        while ((k & mask) == 0) {
            mask = mask << 1;
        }
        int a = 0;
        int b = 0;
        for (int num : nums) {
            if ((num & mask) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }
}
