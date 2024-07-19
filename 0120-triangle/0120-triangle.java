class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 1) {
            return triangle.get(0).get(0);
        }
        int[][] dp = new int[triangle.size()][triangle.size()];
        // return solve(triangle, 0, 0);
        return tabulation(triangle, dp);
    }

    public int solve(List<List<Integer>> triangle, int i, int j) {
        if (i == triangle.size() - 1) {
            return triangle.get(i).get(j);
        }
        int down = solve(triangle, i + 1, j);
        int diagRight = solve(triangle, i + 1, j + 1);

        return triangle.get(i).get(j) + Math.min(down, diagRight);
    }

    public int tabulation(List<List<Integer>> triangle, int[][] dp) {
        int n = triangle.size();
        for (int j = 0; j < n; j++) {
            dp[n - 1][j] = triangle.get(n - 1).get(j);
        }
        int down = Integer.MAX_VALUE, diagRight = Integer.MAX_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                down = dp[i + 1][j];
                diagRight = dp[i + 1][j + 1];
                dp[i][j] = triangle.get(i).get(j) + Math.min(down, diagRight);
            }
        }
        return dp[0][0];
    }
}