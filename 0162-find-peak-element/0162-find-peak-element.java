class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1) return 0;
        int n = nums.length;
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;
        int i = 1, j = n - 2;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])
                return mid;
            else if (nums[mid] < nums[mid - 1])
                j = mid - 1;
            else if (nums[mid] < nums[mid + 1])
                i = mid + 1;
        }
        return -1;
    }
}