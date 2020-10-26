package com.leetcode.num763;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList<>();
        boolean[] alp = new boolean[26];
        int pHead = 0;
        int pEnd = 0;
        int pCur = 0;
        for (int i = 0; i < S.length(); i++) {
//            if (alp[S.charAt(i) - 'a']) continue;
//            alp[S.charAt(i) - 'a'] = true;
            int k = S.length() - 1;
            while (S.charAt(i) != S.charAt(k)) {
                k--;
            }
            if(k>pEnd){
                pEnd = k;
            }
            if (i == pEnd) {
                res.add(pEnd - pHead+1);
                pHead = i+1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        PartitionLabels partitionLabels = new PartitionLabels();
        List<Integer> list = partitionLabels.partitionLabels("ababcbacadefegdehijhklij");
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
