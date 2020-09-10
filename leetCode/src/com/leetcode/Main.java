package com.leetcode;


import com.leetcode.num5.LongestPalindromicSubstring;

public class Main {
    public static void main(String[] args) {
        LongestPalindromicSubstring test = new LongestPalindromicSubstring();
        String str = test.longestPalindrome("acbaccab");
        System.out.println(str);
    }
}

