package com.leetcode.num1207;

import java.util.*;

public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (set.contains(count)) return false;
                set.add(count);
                count = 1;
            }
        }
        return !set.contains(count);
    }
}
