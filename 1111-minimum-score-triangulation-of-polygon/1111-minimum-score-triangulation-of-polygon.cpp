class Solution {
public:
    int solve(vector<int>& values,int i,int j,vector<vector<int>> &dp){
        if(i==j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans = INT_MAX;
        for(int k=i;k<j;k++){
            ans=min(ans,values[i-1]*values[j]*values[k]+solve(values,i,k,dp)+ solve(values,k+1,j,dp));
        }
        dp[i][j]=ans;
        return dp[i][j];
    }
    int minScoreTriangulation(vector<int>& values) {
        int n=values.size();
        vector<vector<int>> dp(n,vector<int>(n,-1));
        return solve(values,1,n-1,dp);
    }
};