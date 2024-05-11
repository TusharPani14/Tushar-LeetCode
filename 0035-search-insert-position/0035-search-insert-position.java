class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length;
        int mid = 0;
        if(target>nums[j-1]){
            return j;
        }
        while (i <= j) {
            mid = (i + j) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }
}