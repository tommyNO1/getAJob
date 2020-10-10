package com.leetcode.num75;

public class SortColors {
    public void sortColors(int[] nums) {
        int p1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=nums[p1];
                nums[p1]=0;
                p1++;
            }
        }
        for (int i=0;i<nums.length;i++){
            if(nums[i]==1){
                nums[i]=nums[p1];
                nums[p1]=1;
                p1++;
            }
        }
    }
}
