package com.leetcode.num1356;

import java.util.Arrays;
import java.util.Comparator;

public class SortByBits {
    public int[] sortByBits(int[] arr) {
        Integer[] array = new Integer[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            array[i] = arr[i];
        }
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int c1 = getBitOneNum(o1);
                int c2 = getBitOneNum(o2);
                if(c1==c2) return o1-o2;
                return c1-c2;
            }
        });

        for (int i = 0; i <array.length ; i++) {
            arr[i] = array[i];
        }
        return arr;
    }

    public int getBitOneNum(int n){
        int count = 0;
        while (n!=0){
            if((n&1)==1) count++;
            n = n>>1;
        }
        return count;
    }
}
