package com.leetcode.offer59;

import java.util.Deque;
import java.util.LinkedList;

public class Solution59 {
    public int[] maxSlidingWindow(int[] nums,int k){
        if(nums.length==0||k==0) return new int[0];
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length-k+1];
        for(int i=1-k,j=0;j<nums.length;i++,j++){
            if(i>0&&deque.peekFirst()==i-1)
                deque.removeFirst();
            while (!deque.isEmpty()&&deque.peekLast()<nums[j]){
                deque.removeLast();
            }
            deque.addLast(j);
            if(i>=0){
                res[i] = nums[deque.peekFirst()];
            }
        }
        return res;
    }
}
