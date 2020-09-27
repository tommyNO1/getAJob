package com.leetcode.num11;

import org.omg.CORBA.INTERNAL;

import java.util.HashSet;
import java.util.Set;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int container = 0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int high = Math.min(height[i],height[j]);
                int width = j-i;
                container = high*width;
                if(container>max){
                    max=container;
                }
            }
        }
        return max;
    }
}
