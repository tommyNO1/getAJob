package com.leetcode.offer51;

public class Solution51 {
     int count = 0;
    private void mergeSortRecur(int[] arr, int start, int end) {
        if (start >= end) return;
        int len = end - start;
        int mid = len / 2 + start;
        int start1 = start, end1 = mid;
        int start2 = mid + 1, end2 = end;
        mergeSortRecur(arr, start1, end1);
        mergeSortRecur(arr, start2, end2);
        int k = 0;
        int[] res = new int[end - start + 1];
        while (start1 <= end1 && start2 <= end2) {
            if(arr[start1]<arr[start2]){
                res[k] = arr[start1];
                start1++;
            }else {
                res[k] = arr[start2];
                start2++;
                count+=(end1-start1+1);
            }
            k++;
        }
        while(start1<=end1){
            res[k] = arr[start1];
            start1++;
            k++;
        }
        while (start2<=end2){
            res[k] = arr[start2];
            start2++;
            k++;
        }
        for(k=0;k<res.length;k++)
            arr[start+k] = res[k];
    }
}
