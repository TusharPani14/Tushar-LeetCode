class Solution {
public:
    int f(vector<int>& nums, int i, int j, vector<vector<int>> dp){
        if(i>j){
            return dp[i][j]=0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int maxi = INT_MIN;
        for(int k=i;k<=j;k++){
            int cost=nums[i-1]*nums[k]*nums[j+1]+f(nums,i,k-1,dp)+f(nums,k+1,j,dp);
            maxi=max(maxi,cost);
        }
        return dp[i][j]=maxi;
    }
    int maxCoins(vector<int>& nums) {
        // int n=nums.size();
        // nums.insert(nums.begin(), 1);
        // nums.push_back(1);
        // vector<vector<int>> dp(n+2,vector<int>(n+2,-1));
        // return f(nums,1,n,dp);
        int n = nums.size() + 2;        
        vector<vector<int>> dp(n, vector<int>(n));
        vector<int> new_nums(n, 1);
        int i = 1;
        for(auto num : nums) {
            new_nums[i++] = num;
        }
        for(int len = 2; len <= n; len++) { 
            for(int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                for(int k = i + 1; k < j; k++) { 
                    dp[i][j] = max(dp[i][j], dp[i][k] + dp[k][j] + new_nums[i] * new_nums[k] * new_nums[j]);
                }
            }
        }
        return dp[0][n - 1];
    }
};