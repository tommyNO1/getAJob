package com.leetcode.num9;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int revNum = 0;
        while (x > revNum) {
            x /= 10;
            revNum = x % 10 + revNum * 10;
        }
        if (x == revNum) return true;
        if (revNum / 10 == x) return true;
        return false;
    }
}
