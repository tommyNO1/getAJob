package com.leetcode.offer44;

public class Solution {
    public static int findNthDigit(int n){
        int digit = 1;
        int start = 1;
        int count = 9*digit*start;
        while(n>count){
            n -= count;
            start *=10;
            digit +=1;
            count = 9*start*digit;
        }
        int num = start+(n-1)/digit;
        String s = String.valueOf(num);
        int res = s.charAt((n-1)%digit)-'0';
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findNthDigit(19));
    }
}
