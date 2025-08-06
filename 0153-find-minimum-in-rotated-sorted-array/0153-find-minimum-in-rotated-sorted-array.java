class Solution {
    public int findMin(int[] nums) {
        //Find the sorted half
        //Carry the min in sorted half and move to right side
        int min = Integer.MAX_VALUE;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[low] <= nums[mid]) {
                min = Math.min(min, nums[low]);
                low = mid + 1;
            } else {
                min = Math.min(min, nums[mid]);
                high = mid - 1;
            }
        }
        return min;
    }
}