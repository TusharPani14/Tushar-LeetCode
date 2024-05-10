class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int s = nums[i] + nums[j] + nums[k];
                if (s == 0) {
                    List<Integer> l = new ArrayList<>(3);
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    res.add(l);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if (s < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return res;
    }
}