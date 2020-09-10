package com.cvte.airTicket;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[][] R = new int[][]{{0,1,600},{1,2,500},{1,3,500},{3,2,500},{0,2,1300}};
        findMinAirTicketPrice(3,R,0,2);
    }
    public static int findMinAirTicketPrice(int w, int[][] R, int A, int B) {
        List<Integer> path = new ArrayList<>();
        dfs(R,A,B,0,path);
        return 0;
    }

    static void dfs(int[][] R, int start, int des, int sum, List<Integer> path) {
        if (start == des) {
            //将当前机票价格和加入到列表当中
            path.add(sum);
            return;
        }
        for (int i = 0; i < R.length; i++) {
            if (R[i][0] == start) {
                dfs(R, R[i][1], des,sum+R[i][2],path);
            }
        }
    }
}
