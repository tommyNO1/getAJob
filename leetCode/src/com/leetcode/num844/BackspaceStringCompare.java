package com.leetcode.num844;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        Deque<Character> list1 = new LinkedList<>();
        Deque<Character> list2 = new LinkedList<>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='#'){
                if(!list1.isEmpty()){
                    list1.removeLast();
                }
            }else {
                list1.add(S.charAt(i));
            }
        }
        for(int i=0;i<T.length();i++){
            if(S.charAt(i)=='#'){
                if(!list2.isEmpty()){
                    list2.removeLast();
                }
            }else {
                list2.add(S.charAt(i));
            }
        }
    return list1.equals(list2);
    }
}
