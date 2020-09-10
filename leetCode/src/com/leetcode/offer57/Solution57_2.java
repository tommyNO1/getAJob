package com.leetcode.offer57;

import java.util.LinkedList;
import java.util.List;

public class Solution57_2 {
    public int[][] findContinuousSequence(int target) {
        List<int[]> list = new LinkedList<>();
        int small = 1;
        int big = 2;
        int sum = 0;
        while (small < (target+1) / 2) {
            for (int i = small; i <= big; i++) {
                sum += i;
            }
            if(sum<target){
                big--;
            }
            if(sum>target){
                small++;
            }
            if(sum==target){
                list.add(creatArr(small,big));
            }
        }
        int[][] res = new int[list.size()][];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }

    private int[] creatArr(int small, int big) {
        int[] arr = new int[big-small+1];
        for(int i=0;i<arr.length;i++){
            arr[i] = small++;
        }
        return arr;
    }

}
