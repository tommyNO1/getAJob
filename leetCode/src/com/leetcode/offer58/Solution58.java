package com.leetcode.offer58;

public class Solution58 {
    public String reverseWords(String s){
        String str = s.trim();
        int i = str.length()-1;
        int j = i;
        StringBuilder res = new StringBuilder();
        while (i>=0){
            while (i>=0&&str.charAt(i)!=' ') i--;
            res.append(s.substring(i+1,j+1));
            while (i>=0&&s.charAt(i)==' ')i--;
            j=i;
        }
        return res.toString().trim();
    }

}
