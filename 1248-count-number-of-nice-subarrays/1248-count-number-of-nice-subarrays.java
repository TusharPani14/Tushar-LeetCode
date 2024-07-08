class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return solve(nums, k) - solve(nums, k - 1);
    }

    public int solve(int[] nums, int k) {
        int c = 0, j = 0, res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                c++;
            }
            while (c > k) {
                if (nums[j] % 2 != 0) {
                    c--;
                }
                j++;
            }
            res += i - j + 1;
        }
        return res;
    }

}