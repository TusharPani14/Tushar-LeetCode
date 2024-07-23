class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] memo = new int[coins.length][amount + 1];
        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j <= amount; j++) {
                memo[i][j] = -1;
            }
        }
        int result = solve(coins, amount, coins.length - 1, memo);
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    public int solve(int[] coins, int amount, int i, int[][] memo) {
        if (amount == 0) {
            return 0;
        }
        if (i < 0) {
            return Integer.MAX_VALUE;
        }
        if (memo[i][amount] != -1) {
            return memo[i][amount];
        }
        int nonPick = solve(coins, amount, i - 1, memo);
        int pick = Integer.MAX_VALUE;
        if (amount >= coins[i]) {
            int res = solve(coins, amount - coins[i], i, memo);
            if (res != Integer.MAX_VALUE) {
                pick = 1 + res;
            }
        }
        memo[i][amount] = Math.min(pick, nonPick);
        return memo[i][amount];
    }
}
