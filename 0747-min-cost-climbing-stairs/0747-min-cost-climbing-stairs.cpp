class Solution {
public:
    int solve(vector<int>& cost, int i, int n, vector<int>& dp) {
        if (i >= n) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }

        int cost1 = cost[i] + solve(cost, i + 1, n, dp);
        int cost2 = cost[i] + solve(cost, i + 2, n, dp);

        return dp[i] = min(cost1, cost2);
    }

    int minCostClimbingStairs(vector<int>& cost) {
        int n = cost.size();
        vector<int> dp(n, -1);
        int cost_from_0 = solve(cost, 0, n, dp);
        
        int cost_from_1 = solve(cost, 1, n, dp);
        
        return min(cost_from_0, cost_from_1);
    }
};
