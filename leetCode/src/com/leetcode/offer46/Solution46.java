package com.leetcode.offer46;
/*
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻
 * 译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 * */

import java.util.HashMap;
import java.util.Map;

public class Solution46 {
    public static int translateNum(int num) {
        String numStr = String.valueOf(num);
        return dfs(numStr, 0);
    }

    public static int dfs(String numStr, int p) {
        Map<Integer, Integer> map = new HashMap<>();
        if (p >= numStr.length() - 1) return 1;
        int temp = Integer.parseInt(numStr.substring(p, p + 2));
        if (temp >= 10 && temp <= 25) {
            map.put(p, dfs(numStr, p + 1) + dfs(numStr, p + 2));
        } else {
            map.put(p, dfs(numStr, p + 1));
        }
        return map.get(p);
    }

    public static void main(String[] args) {
        System.out.println(translateNum(12258));
    }
}
