package com.leetcode.offer67;

public class Solution67 {
    public int strToInt(String str) {
        char[] chars = str.trim().toCharArray();
        if(chars.length==0) return 0;
        int res=0,bndry=Integer.MAX_VALUE/10;
        int i=1,sign=1;
        if(chars[0]=='-')sign=-1;
        else if(chars[0]!='+') i=0;
        for (int j=i;i<chars.length;j++){
            if(chars[j]<'0'||chars[j]>'i') break;;
            if(res>bndry||res==bndry&&chars[j]>'7') return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            res=res*10+(chars[j]-'0');
        }
        return res*sign;

    }
}
