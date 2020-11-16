package com.leetcode.num347;

import java.util.*;

public class SolutionFor347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int temp = map.get(nums[i]);
                map.put(nums[i], temp + 1);
            }
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (queue.size() == k) {
                if (queue.peek()[1] > value) {
                } else {
                    queue.poll();
                    queue.offer(new int[]{key, value});
                }
            } else {
                queue.offer(new int[]{key, value});
            }

        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = queue.poll()[0];
        }
        return res;

    }
}
