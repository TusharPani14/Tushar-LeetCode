// class Solution {
// public:
//     int f(string s, string t, int i, int j, vector<vector<int>>dp){
//         if(i<0 || j<0){
//             return 0;
//         }
//         if(dp[i][j]!=-1){
//             return dp[i][j];
//         }
//         if(s[i]==t[j]){
//             return dp[i][j]=f(s,t,i-1,j-1,dp)+1;
//         }
//         return dp[i][j]=max(f(s,t,i-1,j,dp),f(s,t,i,j-1,dp));
//     }
//     int longestPalindromeSubseq(string s) {
//         string t=s;
//         reverse(t.begin(), t.end());
//         vector<vector<int>>dp(s.length()+1,vector<int>(t.length()+1,-1));
//         return f(s,t,s.length()-1,t.length()-1,dp);
//     }
// };
class Solution {
public:
int longestCommonSubsequence(string s1, string s2) {

int n=s1.size();
int m=s2.size();

vector<vector<int>> dp(n+1,vector<int>(m+1,-1));
    for(int i=0;i<=n;i++){
        dp[i][0] = 0;
    }
    for(int i=0;i<=m;i++){
        dp[0][i] = 0;
    }

    for(int ind1=1;ind1<=n;ind1++){
        for(int ind2=1;ind2<=m;ind2++){
            if(s1[ind1-1]==s2[ind2-1])
                dp[ind1][ind2] = 1 + dp[ind1-1][ind2-1];
            else
                dp[ind1][ind2] = 0 + max(dp[ind1-1][ind2],dp[ind1][ind2-1]);
            }
        }
        return dp[n][m];
    }
int longestPalindromeSubseq(string s) {

    string s2=s;
    reverse(s2.begin(),s2.end());

    return longestCommonSubsequence(s,s2);
    }
};