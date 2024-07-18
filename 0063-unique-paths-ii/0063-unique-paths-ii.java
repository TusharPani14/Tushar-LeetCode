class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        dp[0][0] = 1;
        int up = 0, left = 0;
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[0].length; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (obstacleGrid[i][j] != 1) {
                    up = (j > 0) ? dp[i][j - 1] : 0;
                    left = (i > 0) ? dp[i - 1][j] : 0;
                    dp[i][j] = left + up;
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return dp[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}