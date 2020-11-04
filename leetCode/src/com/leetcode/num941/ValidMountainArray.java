package com.leetcode.num941;

public class ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        if(A.length<3) return false;
        int pHead = 0;
        int pEnd = A.length-1;
        while (pHead<A.length-1&&A[pHead]<A[pHead+1]){
            pHead++;
        }
        while (pEnd>0&&A[pEnd]<A[pEnd-1]){
            pEnd--;
        }
        return pEnd == pHead && pEnd != 0 && pEnd != A.length - 1;
    }
}
