package com.leetcode.num402;

public class RemoveKdigits {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) return "0";
        StringBuilder stringBuilder = new StringBuilder(num);
        for (int i = 0; i < k; i++) {
            int idx = 0;
            for (int j = 1; j < stringBuilder.length(); j++) {
                if (stringBuilder.charAt(j) >= stringBuilder.charAt(j - 1)) {
                    idx = j;
                } else {
                    break;
                }
            }
            stringBuilder.delete(idx, idx + 1);
            while (stringBuilder.length() > 1 && stringBuilder.charAt(0) == '0') stringBuilder.delete(0, 1);
        }
        return stringBuilder.toString();
    }
}
