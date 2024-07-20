class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        if (total % 2 != 0) {
            return false;
        }
        // return solve(nums, total / 2, 0);
        return tabulation(nums, total / 2);
    }

    public boolean solve(int[] nums, int target, int i) {
        if (target == 0) {
            return true;
        }
        if (i == nums.length - 1) {
            return nums[i] == target;
        }
        boolean nonPick = solve(nums, target, i + 1);
        boolean pick = false;
        if (target >= nums[i]) {
            pick = solve(nums, target - nums[i], i + 1);
        }
        return pick || nonPick;
    }

    public boolean tabulation(int[] nums, int target) {
        int n = nums.length;
        boolean[][] dp = new boolean[n + 1][target + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (j >= nums[i - 1]) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][target];
    }
}