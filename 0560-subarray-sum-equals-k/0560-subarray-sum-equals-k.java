class Solution {
    public int subarraySum(int[] nums, int k) {
        int j = 0, sum = 0, ans = 0;
        if (nums.length == 1) {
            if (nums[0] == k) {
                return 1;
            } else
                return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum > k) {
                sum = sum - nums[j];
                j++;
            }
            if (sum == k) {
                ans++;
            }
        }
        return ans;
    }
}