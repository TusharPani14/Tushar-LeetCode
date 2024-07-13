class Solution {
    public int jump(int[] nums) {
        int l = 0, r = 0, j = 0;
        while (r < nums.length - 1) {
            int far = 0;
            for (int i = l; i <= r; i++) {
                far = Math.max(far, i + nums[i]);
            }
            l = r + 1;
            r = far;
            j++;
        }
        return j;
    }
}