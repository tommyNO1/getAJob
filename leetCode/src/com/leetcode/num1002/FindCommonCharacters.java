package com.leetcode.num1002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {
    public List<String> commonChars(String[] A) {
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);
        for (String str : A) {
            int[] freq = new int[26];
            int len = str.length();
            for (int i = 0; i < len; i++) {
                char c = str.charAt(i);
                freq[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], freq[i]);
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFreq[i]; j++) {
                list.add(String.valueOf((char) (i + 'a')));
            }
        }
        return list;
    }
}
