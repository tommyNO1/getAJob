package com.leetcode.num406;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReconstructQueue {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]) return o2[1]-o1[1];
                return o1[0]-o2[0];
            }
        });
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<people.length;i++){
            list.add(i);
        }
        int[][] res = new int[people.length][2];
        for(int i=0;i<people.length;i++){
            res[list.get(people[i][1])] = people[i];
            list.remove(people[i][1]);
        }
        return res;
    }
}
