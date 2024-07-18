class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] temp1 = new int[nums.length];
        int[] temp2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                temp1[i] = nums[i];
            }
            if (i < nums.length - 1) {
                temp2[i] = nums[i];
            }
        }
        return Math.max(spaceOptimisation(temp1), spaceOptimisation(temp2));
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