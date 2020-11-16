package com.leetcode.num821;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShortestDistanceToACharacter {
    public int[] shortestToChar(String S, char C) {
        List<Integer> target = new ArrayList<>();
        int[] res = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                target.add(i);
            }
        }
        int min = Integer.MAX_VALUE / 2;
        for (int i = 0; i < S.length(); i++) {
            for (int num : target) {
                int a = Math.abs(i - num);
                if (a < min) {
                    min = a;
                }
            }
            res[i] = min;
        }
        return res;
    }

}
