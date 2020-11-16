package com.leetcode.num165;

public class SolutionFor165 {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int len = Math.max(v1.length, v2.length);
        for (int i = 0; i < len; i++) {
            if (i < v1.length && i < v2.length) {
                if (Integer.parseInt(v1[i]) == Integer.parseInt(v2[i])) continue;
                if (Integer.parseInt(v1[i]) > Integer.parseInt(v2[i])) return 1;
                if (Integer.parseInt(v1[i]) < Integer.parseInt(v2[i])) return -1;
            } else if (v1.length < v2.length) {
                if (Integer.parseInt(v2[i]) != 0) return -1;
            } else {
                if (Integer.parseInt(v1[i]) != 0) return 1;
            }
        }
        return 0;
    }
}
