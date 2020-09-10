package com.leetcode.offer45;

public class Solution45 {
    public static String minNumber(int[] num) {
        String[] numStr = new String[num.length];
        for (int i = 0; i < num.length; i++) {
            numStr[i] = String.valueOf(num[i]);
        }
        quickSort(numStr,0,numStr.length-1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numStr.length; i++) {
            sb.append(numStr[i]);
        }
        return sb.toString();
    }

    public static void quickSort(String[] numStr,int low,int high) {
        if (low >= high) return;
        int l = low;
        int h = high;
        String temp = numStr[low];
        while (low < high) {
            while (low<high&&strCompare(numStr[high],temp)){
                high--;
            }
            numStr[low] = numStr[high];
            while (low<high&&strCompare(temp,numStr[low])) {
                low++;
            }
            numStr[high] = numStr[low];
        }
        numStr[low] = temp;
        int index = low;
        quickSort(numStr,l,index-1);
        quickSort(numStr,index+1,h);
    }

    public static boolean strCompare(String a,String b){
        String abSum = a+b;
        String baSum = b+a;
        if(Long.valueOf(abSum)>=Long.valueOf(baSum)){
            return true;
        }else {
            return  false;
        }
    }

    public static void main(String[] args) {
        System.out.println(minNumber(new int[]{999999998,999999997,999999999}));
    }
}
