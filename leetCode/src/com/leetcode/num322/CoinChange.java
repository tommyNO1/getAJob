package com.leetcode.num322;

import java.util.Arrays;

public class CoinChange {
    int res = Integer.MAX_VALUE;

    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        dfs(coins, amount, 0, coins.length - 1);
        return res;
    }

    private void dfs(int[] coins, int amount, int count, int index) {

        if (index < 0) {
            return;
        }
        for (int i = amount / coins[index]; i >= 0; i--) {
            int na = amount - i * coins[index];
            int ncnt = count + i;
            if (na == 0) {
                res = Math.min(na, ncnt);
                break;
            }
            if (ncnt + 1 > res) {
                break;
            }
            dfs(coins, na, ncnt, index - 1);
        }
    }
}
