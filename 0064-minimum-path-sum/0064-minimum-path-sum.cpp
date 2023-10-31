class Solution {
public:
    int f(vector<vector<int>>& grid, int i, int j, vector<vector<int>>& dp){
        if(i==grid.size()-1 && j==grid[0].size()-1){
            return dp[i][j]=grid[grid.size()-1][grid[0].size()-1];
        }
        if(i>=grid.size() || j>=grid[0].size()){
            return INT_MAX;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        return dp[i][j]=min(f(grid,i+1,j,dp),f(grid,i,j+1,dp))+grid[i][j];
    }
    int minPathSum(vector<vector<int>>& grid) {
        int m=grid.size();
        int n=grid[0].size();
        vector<vector<int>>dp(m+1,vector<int>(n+1,-1));
        return f(grid,0,0,dp);
    }
};