package com.leetcode.num349;

import java.util.*;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    res.add(nums1[i]);
                    break;
                }
            }
        }
        int[] ans = new int[res.size()];
        int index = 0;
        for (int num : res) {
            ans[index++] = num;
        }
        return ans;
    }
}
