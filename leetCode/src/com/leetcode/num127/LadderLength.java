package com.leetcode.num127;

import java.util.*;

public class LadderLength {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Deque<String> que = new LinkedList<>();
        List<String> list = wordList;
        que.add(beginWord);
        int depth = 0;
        while (!que.isEmpty()) {
            int levelNum = que.size();
            for (int j = 0; j < levelNum; j++) {
                String temp = que.poll();
                if (temp.equals(endWord)) return depth;
                for (int i = list.size() - 1; i >= 0; i--) {
                    if (search(temp, list.get(i))) {
                        que.add(list.get(i));
                        list.remove(list.get(i));
                    }
                }
            }
            depth++;
        }
        return depth;
    }

    public boolean search(String s, String t) {
        int len = s.length();
        int diff = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) diff++;
        }
        return diff == 1;
    }
}
