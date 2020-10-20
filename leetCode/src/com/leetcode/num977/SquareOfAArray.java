package com.leetcode.num977;

public class SquareOfAArray {
    public int[] sortedSquares(int[] A) {
        int p1 =0;
        int p2 =0;
        for(int i=0;i<A.length;i++){
            if(A[i]>=0){
                p1=i-1;
                p2=i;
            }
            A[i] *=A[i];
        }
        int[] res = new int[A.length];
        int index =0;
        while(p1>=0||p2<A.length){
            if (p1 < 0) {
                res[index] = A[p2];
                p2++;
            }else if(p2>A.length-1){
                res[index] = A[p1];
                p1--;
            }else if(A[p1]<=A[p2]){
                res[index] = A[p1];
                p1--;
            }else {
                res[index] = A[p2];
                p2++;
            }
        }
        return res;
    }
}
