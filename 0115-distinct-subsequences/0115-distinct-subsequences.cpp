class Solution {
public:
    int solve(string s, string t, int k, int l, vector<vector<int>>&dp){
        if(l<0){
            return 1;
        }
        if(k<0){
            return 0;
        }
        if(dp[k][l]!=-1){
            return dp[k][l];
        }
        if(s[k]==t[l]){
            return dp[k][l]=solve(s,t,k-1,l-1,dp)+solve(s,t,k-1,l,dp);
        }
        else{
            return dp[k][l]=solve(s,t,k-1,l,dp);
        }
    }
    int numDistinct(string s, string t) {
        // vector<vector<int>>dp(s.length(),vector<int>(t.length(),-1));
        // return solve(s, t, s.length()-1,t.length()-1,dp);
        int n = s.size();
		int m = t.size();
		int mod = 1e9+7;
        vector<int> dp(m+1,0);

		dp[0] = 1;
        for(int i = 1; i<=n ; i++)
		{
			for(int j = m ; j>=1 ; j--)
			{
				if(s[i-1] == t[j-1])
				{
					dp[j] = (dp[j-1] + dp[j]) % mod;
				}
			}
		}

		return dp[m];   
    }
};