class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        // int dp[][] = new int[text1.length()][text2.length()];
        // for (int row[] : dp) {
        // Arrays.fill(row, -1);
        // }
        // return solve(text1, text2, text1.length() - 1, text2.length() - 1, dp);
        return tabulation(text1, text2);
    }

    public int solve(String text1, String text2, int i, int j, int dp[][]) {
        if (i < 0 || j < 0) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        char c1 = text1.charAt(i);
        char c2 = text2.charAt(j);
        if (c1 == c2) {
            return dp[i][j] = 1 + solve(text1, text2, i - 1, j - 1, dp);
        } else {
            return dp[i][j] = 0 + Math.max(solve(text1, text2, i - 1, j, dp), solve(text1, text2, i, j - 1, dp));
        }
    }

    public int tabulation(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
}