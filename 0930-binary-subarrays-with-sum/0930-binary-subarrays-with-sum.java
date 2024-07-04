class Solution {
    public int atMost(int[] nums, int goal) {
        int j = 0, sum = 0, res = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum > goal && j <= i) {
                sum -= nums[j];
                j++;
            }
            res += i - j + 1;
        }
        return res;
    }
    public int numSubarraysWithSum(int[] nums, int goal){
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
}