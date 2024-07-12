class Solution {
    public boolean canJump(int[] nums) {
        Boolean[] memo = new Boolean[nums.length];
        return solve(nums, 0, memo);
    }
    
    private boolean solve(int[] nums, int i, Boolean[] memo) {
        if (i >= nums.length - 1) {
            return true; 
        }
        
        if (memo[i] != null) {
            return memo[i];
        }
        
        int furthestJump = Math.min(i + nums[i], nums.length - 1);
        for (int j = i + 1; j <= furthestJump; j++) {
            if (solve(nums, j, memo)) {
                memo[i] = true;
                return true;
            }
        }
        
        memo[i] = false;
        return false;
    }
}
