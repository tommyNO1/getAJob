package com.leetcode.num56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) return o1[0] - o2[0];
                return o1[0] - o2[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int L = intervals[i][0];
            int R = intervals[i][1];
            if (list.size() == 0 || list.get(list.size() - 1)[1] < L) {
                list.add(new int[]{L, R});
            } else {
                list.get(list.size() - 1)[1] = Math.max(R, list.get(list.size() - 1)[1]);
            }
        }
        return list.toArray(new int[list.size()][]);

    }

    public static void main(String[] args) {
        int[][] nums = new int[][]{{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        Merge merge = new Merge();
        int[][] res = merge.merge(nums);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i][0] + ",");
            System.out.print(res[i][1]);
            System.out.println();
        }
    }
}
