package com.zhongming;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        List<Integer> path = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        dfs(nums,path,res,0,0);
        for(int list:res){
            System.out.print(list+" ");
        }
        System.out.println();
        System.out.println(res.size());
    }

    private static void dfs(int[] nums, List<Integer> path, List<Integer> res, int depth, int start) {
        if(depth==3){
            int sum = 0;
            for (int i=0;i<3;i++){
                sum = path.get(i)+sum*10;
            }
            res.add(sum);
            return;
        }
        for(int i=start;i<nums.length;i++){
            path.add(nums[i]);
            dfs(nums,path,res,depth+1,i+1);
            path.remove(path.size()-1);
        }
    }
}
