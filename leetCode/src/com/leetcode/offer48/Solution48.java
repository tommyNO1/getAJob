package com.leetcode.offer48;

import java.util.HashMap;
import java.util.Map;

public class Solution48 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int res = 0;
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = dic.getOrDefault(s.charAt(i), -1);
            dic.put(s.charAt(i), i);
            if (temp > i - j) {
                temp += 1;
            } else {
                temp = i - j;
            }
            res = Math.max(res, temp);
        }
        return res;
    }
}
