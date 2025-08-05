class Solution {

    public static int getFirst(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int minIdx = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                minIdx = mid;
                high = mid - 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return minIdx;
    }

    public static int getLast(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int maxIdx = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                maxIdx = mid;
                low = mid + 1;
            }
            if (arr[mid] <= x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return maxIdx;
    }

    public int[] searchRange(int[] nums, int target) {
        int f = getFirst(nums, nums.length, target);
        int c = getLast(nums, nums.length, target);
        int[] ans = { f, c };
        return ans;
    }
}