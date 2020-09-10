package com.leetcode.offer61;

import java.util.Arrays;

public class Solution61 {
    public boolean isStraight(int[] nums){
        if(nums.length==0) return false;
        Arrays.sort(nums);
        int numOfZero = 0;
        int numOfGap = 0;
        for(int i=0;i<nums.length&&nums[i]==0;i++)
            numOfZero++;
        int small=numOfZero;
        int big=small+1;
        while (big<nums.length){
            if(nums[small]==nums[big]){
                return false;
            }
            numOfGap += nums[big]-nums[small]-1;
            small=big;
            big++;
        }
        return numOfGap <= numOfZero;
    }
}
