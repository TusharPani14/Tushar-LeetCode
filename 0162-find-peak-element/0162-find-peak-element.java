class Solution {
    public int findPeakElement(int[] nums) {
        //check if mid is greater than its both side. If yes return mid;
        //if increasing slope assume the peak will not be there remove left half
        //else remove right half(if it is decreasing slope of else it may be bottom or valley)
        int n = nums.length;
        if (n == 1) {
            return 0;
        }
        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[n - 2] < nums[n - 1]) {
            return n - 1;
        }
        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid - 1] <= nums[mid] && nums[mid] <= nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}