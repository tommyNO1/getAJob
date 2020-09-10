package com.leetcode.offer50;

import java.util.HashMap;
import java.util.Map;

public class Solution50 {
    public char firstUniqChar(String s) {
        Map<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), false);
            } else {
                map.put(s.charAt(i), true);
            }
        }
        char res = '$';
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i))) {
                res = s.charAt(i);
                break;
            }
        }
        return res;
    }
}
