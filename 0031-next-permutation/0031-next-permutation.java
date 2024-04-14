class Solution {
    public void nextPermutation(int[] nums) {
        int min = Integer.MAX_VALUE, minPos = 0;
        int bp = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (min > nums[i + 1]) {
                min = nums[i + 1];
                minPos = i + 1;
            }
            if (nums[i + 1] > nums[i]) {
                bp = i;
                break;
            }
        }
        if (bp == -1) {
            reverse(nums, 0, nums.length - 1);
        } else {
            int temp = nums[bp];
            nums[bp] = nums[minPos];
            nums[minPos] = temp;
            reverse(nums, bp + 1, nums.length - 1);
        }
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}