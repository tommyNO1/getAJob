package com.huawei.truck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int k = sc.nextInt();
            int n = sc.nextInt();
            int[] w = new int[n+1];
            int[] v = new int[n+1];
            for(int i=1;i<=n;i++){
                w[i]=sc.nextInt();
            }
            for(int i=1;i<=n;i++){
                v[i]=sc.nextInt();
            }
            int[] dp =new int[k+1];
            for(int i=1;i<=n;i++){
                for(int j=w[i];j<=k;j++){
                    dp[j]=Math.max(dp[j-w[i]]+v[i],dp[j]);
                }
            }
            System.out.println(dp[k]);
        }

    }
}
