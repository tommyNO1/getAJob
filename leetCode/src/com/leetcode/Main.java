package com.leetcode;




public class Main {
    public static void main(String[] args) {
        int[] father = new int[]{0,1,1,1,2,4};
        findXFather(father,5);
        for(int num:father){
            System.out.print(num+",");
        }

    }
    public static int findXFather(int[] father,int x){
/*        while (x!=father[x]){
            father[x]=father[father[x]];
            x=father[x];
        }
        return x;*/
        if(x==father[x]){
            return x;
        }else {
            father[x] = findXFather(father,father[x]);
            return father[x];
        }
    }
}

