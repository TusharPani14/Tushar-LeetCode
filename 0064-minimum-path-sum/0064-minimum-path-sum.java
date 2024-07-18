class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        // return solve(grid, grid.length - 1, grid[0].length - 1);
        return tabulation(grid, grid.length, grid[0].length, dp);
    }

    public int solve(int[][] grid, int m, int n) {
        if (m == 0 && n == 0) {
            return grid[0][0];
        }
        int up = m > 0 ? solve(grid, m - 1, n) : Integer.MAX_VALUE;
        int left = n > 0 ? solve(grid, m, n - 1) : Integer.MAX_VALUE;
        return grid[m][n] + Math.min(up, left);
    }

    public int tabulation(int[][] grid, int m, int n, int[][] dp) {
        dp[0][0] = grid[0][0];
        int up = Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                up = i > 0 ? dp[i - 1][j] : Integer.MAX_VALUE;
                left = j > 0 ? dp[i][j - 1] : Integer.MAX_VALUE;
                dp[i][j] = grid[i][j] + Math.min(up, left);
            }
        }
        return dp[m - 1][n - 1];
    }
}