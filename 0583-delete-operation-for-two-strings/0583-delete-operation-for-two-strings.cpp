class Solution {
public:
    int lcs(string text1, string text2, int i, int j, vector<vector<int>>&dp){
        if(i==text1.size() || j==text2.size()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(text1[i]==text2[j]){
            return dp[i][j]=1+lcs(text1,text2,i+1,j+1,dp);
        }
        return dp[i][j]=max(lcs(text1,text2,i,j+1,dp),lcs(text1,text2,i+1,j,dp));
    }
    int minDistance(string word1, string word2) {
        int n=word1.length();
        int m=word2.length();
        vector<vector<int>> dp(n+1,vector<int>(m+1,-1));
        return n+m-2*lcs(word1,word2,0,0,dp);
    }
};