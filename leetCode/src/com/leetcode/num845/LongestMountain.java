package com.leetcode.num845;

public class LongestMountain {
    public int longestMountain(int[] A) {
        int len = 0;
        for(int i=1;i<A.length-1;i++){
            if(A[i]>A[i-1]&&A[i]>A[i+1]){
                int p1 = i-1;
                int p2 = i+1;
                while (p1>0&&A[p1]>A[p1-1]){
                    p1--;
                }
                while (p2<A.length-1&&A[p2]>A[p2+1]){
                    p2++;
                }
                len = Math.max(p2-p1+1,len);
            }
        }
        return len;
    }
}
