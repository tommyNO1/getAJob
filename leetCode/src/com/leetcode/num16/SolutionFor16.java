package com.leetcode.num16;

import java.util.Arrays;

public class SolutionFor16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int start = 0;
        int end = 0;
        int res = nums[0]+nums[1]+nums[2];
        for (int i=0;i<nums.length;i++){
            start = i+1;
            end = nums.length-1;
            int sum = nums[i]+nums[start]+nums[end];
            if(i>=start) break;
            while (start<end){
                if(Math.abs(sum-target)<Math.abs(res-target)){
                    res = sum;
                }
                if(sum<target){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return res;
    }
}
