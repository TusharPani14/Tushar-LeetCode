class Solution {
    public int rob(int[] nums) {
        // int[] dp = new int[nums.length];
        // Arrays.fill(dp, -1);
        // return solve(nums, dp, nums.length - 1);
        // return tabulation(nums, dp);
        return spaceOptimisation(nums);
    }

    public int solve(int[] nums, int[] dp, int i) {
        if (i == 0) {
            return nums[i];
        }
        if (i < 0) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int pick = nums[i] + solve(nums, dp, i - 2);
        int notPick = 0 + solve(nums, dp, i - 1);
        return Math.max(pick, notPick);
    }

    public int tabulation(int[] nums, int[] dp) {
        dp[0] = nums[0];
        int neg = 0;
        for (int i = 1; i < nums.length; i++) {
            int pick = nums[i];
            if (i > 1)
                pick = pick + dp[i - 2];
            int notPick = 0 + dp[i - 1];
            dp[i] = Math.max(pick, notPick);
        }
        return dp[nums.length - 1];
    }

    public int spaceOptimisation(int[] nums) {
        int prev = nums[0];
        int prev2 = 0;
        for (int i = 1; i < nums.length; i++) {
            int pick = nums[i];
            if (i > 1)
                pick = pick + prev2;
            int notPick = 0 + prev;
            int cur = Math.max(pick, notPick);
            prev2 = prev;
            prev = cur;
        }
        return prev;
    }
}