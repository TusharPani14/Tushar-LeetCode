class Solution {
    public static int maxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static int arrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static boolean possible(int[] arr, int cap, int n, int m) {
        int st = 1, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > cap) {
                st++;
                sum = arr[i];
                if (st > m) {
                    return false;
                }
            }
        }
        return true;
    }

    public int splitArray(int[] nums, int k) {
        // Write your code here.
        // Maximum min question(BS can be applied)
        // Define the range(maxValue,sum of all pages)
        // If m>arr.length not possible(return -1)
        if (k > nums.length)
            return -1;
        int low = maxValue(nums);
        int high = arrSum(nums);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(nums, mid, nums.length, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}