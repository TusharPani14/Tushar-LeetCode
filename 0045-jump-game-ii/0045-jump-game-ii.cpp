class Solution {
public:
    int solve(int i,vector<int>& nums,int n,vector<int> &dp){
        if(i==n-1){
            return 0;
        }
        if(i>=n){
            dp[i]=INT_MAX;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int steps=INT_MAX;
        for(int j=1;j<=nums[i] && i + j < n ;j++){
            int subProb=solve(j+i,nums,n,dp);
            if(subProb!=INT_MAX){
                steps=min(steps,subProb+1);
            }
        }
        return dp[i]=steps;
    }
    int jump(vector<int>& nums) {
        vector<int> dp(nums.size(),-1);
        return solve(0,nums,nums.size(),dp);
    }
};