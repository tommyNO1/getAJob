package com.leetcode.offer53;

public class Solution53_2 {
    public int missingNumber(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]!=mid&&nums[mid-1]==mid){
                return mid;
            }else if(nums[mid]==mid){
                left = mid+1;
            }else if(nums[mid]!=mid&&nums[mid-1]!=mid){
                right = mid-1;
            }
        }
        return -1;
    }
}
