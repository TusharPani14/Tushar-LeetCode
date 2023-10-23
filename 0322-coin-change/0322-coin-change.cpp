class Solution {
public:
    int solve(vector<int>& coins, int amount, vector<int>& dp) {
        if (amount == 0) {
            return 0;
        }
        
        if (dp[amount] != -1) {
            return dp[amount];
        }

        int minCoins = INT_MAX;

        for (int i = 0; i < coins.size(); i++) {
            if (amount - coins[i] >= 0 && dp[amount-coins[i]]!=INT_MAX) {
                int subproblem = solve(coins, amount - coins[i], dp);
                if (subproblem != -1) {
                    minCoins = min(minCoins, 1 + subproblem);
                }
            }
        }

        dp[amount] = (minCoins == INT_MAX) ? -1 : minCoins;
        return dp[amount];
    }

    int coinChange(vector<int>& coins, int amount) {
        vector<int> dp(amount + 1, -1);
        // return solve(coins, amount, dp);
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            dp[i]=INT_MAX;
            for(int j=0;j<coins.size();j++){
                if(i-coins[j]>=0 && dp[i-coins[j]]!=INT_MAX){
                    dp[i]=min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount]==INT_MAX?-1:dp[amount];
    }
};
