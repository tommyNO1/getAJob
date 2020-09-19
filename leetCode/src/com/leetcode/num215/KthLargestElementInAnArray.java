package com.leetcode.num215;

public class KthLargestElementInAnArray {
    int res;
    public int findKthLargest(int[] nums, int k) {
        quickSelect(nums,0,nums.length-1,nums.length-k);
        if (res==0){
            return nums[nums.length-k];
        }
        return res;
    }
    public void quickSelect(int[] arr, int low, int high,int target) {
        if (low >= high) {
            return;
        }
        int l = low;
        int h = high;
        int temp = arr[low];
        while (low < high) {
            while (low<high&&arr[high] >= temp) {
                high--;
            }
            arr[low] = arr[high];
            while (low<high&&arr[low] <= temp) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = temp;
        int index = low;
        if(index==target){
            res=arr[index];
        }
        if(index>target)quickSelect(arr,l,index-1,target);
        else quickSelect(arr,index+1,h,target);
    }
}
