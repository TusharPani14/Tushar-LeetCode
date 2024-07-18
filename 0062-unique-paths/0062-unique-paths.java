class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        // for (int[] row : dp) {
        // Arrays.fill(row, -1);
        // }
        return solve(m, n, dp);
    }

    // public int solve(int m, int n, int[][] dp) {
    // if (m == 0 || n == 0) {
    // return 1;
    // }
    // if (dp[m][n] != -1)
    // return dp[m][n];
    // return solve(m - 1, n, dp) + solve(m, n - 1, dp);
    // }

    public int solve(int m, int n, int[][] dp) {
        dp[0][0] = 1;
        int up = 0, left = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                up = (j > 0) ? dp[i][j - 1] : 0;
                left = (i > 0) ? dp[i - 1][j] : 0;
                dp[i][j] = left + up;
            }
        }
        return dp[m - 1][n - 1];
    }
}