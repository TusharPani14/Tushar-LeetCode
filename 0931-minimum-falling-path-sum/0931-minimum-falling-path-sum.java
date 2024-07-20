class Solution {
    public int minFallingPathSum(int[][] matrix) {
        // int res = Integer.MAX_VALUE;
        // for (int j = 0; j < matrix[0].length; j++) {
        // res = Math.min(res, solve(matrix, matrix.length - 1, j));
        // }
        // return res;
        return tabulation(matrix);
    }

    public int solve(int[][] matrix, int i, int j) {
        if (j < 0 || j >= matrix[0].length) {
            return Integer.MAX_VALUE;
        }
        if (i == 0) {
            return matrix[i][j];
        }
        int st = solve(matrix, i - 1, j);
        int left = solve(matrix, i - 1, j - 1);
        int right = solve(matrix, i - 1, j + 1);
        return matrix[i][j] + Math.min(Math.min(st, left), right);
    }

    public int tabulation(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        int st, left, right = Integer.MAX_VALUE;
        for (int j = 0; j < matrix[0].length; j++) {
            dp[0][j] = matrix[0][j];
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                st = dp[i - 1][j];
                left = j > 0 ? dp[i - 1][j - 1] : Integer.MAX_VALUE;
                right = j < matrix[0].length - 1 ? dp[i - 1][j + 1] : Integer.MAX_VALUE;
                dp[i][j] = matrix[i][j] + Math.min(Math.min(st, left), right);
            }
        }
        int res = Integer.MAX_VALUE;
        for (int j = 0; j < matrix[0].length; j++) {
            res = Math.min(res, dp[matrix.length - 1][j]);
        }
        return res;
    }
}