class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int l = i + 1; l < nums.length; l++) {
                if (l > i + 1 && nums[l] == nums[l - 1]) {
                    continue;
                }
                int j = l + 1;
                int k = nums.length - 1;
                while (j < k) {
                    long sum = nums[i];
                    sum += nums[l];
                    sum += nums[j];
                    sum += nums[k];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[l], nums[j], nums[k]));
                        j++;
                        k--;
                        while (j < k && nums[j] == nums[j - 1]) {
                            j++;
                        }
                        while (j < k && nums[k] == nums[k + 1]) {
                            k--;
                        }
                    } else if (sum < target) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }
        }
        return res;
    }
}