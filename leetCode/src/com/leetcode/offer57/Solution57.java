package com.leetcode.offer57;

public class Solution57 {
    public int[] twoSum(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            if (nums[low] + nums[high] == target) {
                return new int[]{nums[low], nums[high]};
            } else if (nums[low] + nums[high] > target) {
                high--;
            } else if (nums[low] + nums[high] < target) {
                low++;
            }
        }
        return new int[0];
    }
}
