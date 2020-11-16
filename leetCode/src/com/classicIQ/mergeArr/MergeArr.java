package com.classicIQ.mergeArr;

public class MergeArr {
    public static void main(String[] args) {
        int[] nums1 = new int[]{2, 5, 6, 0, 0, 0};
        int[] nums2 = new int[]{1, 2, 3};
        merge(nums1, 3, nums2, 3);
        for (int num : nums1)
            System.out.println(num);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = nums1.length - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] <= nums2[p2]) {
                nums1[p] = nums2[p2];
                p2--;
            } else {
                nums1[p] = nums1[p1];
                p1--;
            }
            p--;
        }
        if (p1 < 0) {
            for (; p >= 0; p--) {
                nums1[p] = nums2[p];
            }
        }
    }
}
