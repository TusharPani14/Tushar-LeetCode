class Solution {
public:
    int solve(int n, vector<int> &dp){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=solve(i-1,dp)*solve(n-i,dp);
        }
        return dp[n]=sum;
    }
    int numTrees(int n) {
        if(n==0 || n==1){
            return 1;
        }
        vector<int>dp(n+1,0);
        // return solve(n,dp); 
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                dp[i] += dp[j - 1] * dp[i - j];
            } 
        }
        return dp[n];
    }
};