class Solution {
    public boolean ifPossible(int x, int[] nums, int threshold) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.ceil((double)nums[i] / (double)x);
        }
        return sum <= threshold;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        int l = 1, h = max;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (ifPossible(mid, nums, threshold)) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}