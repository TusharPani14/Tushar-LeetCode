class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (mp.getOrDefault(nums[i], 0) != -1) {
                mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
            }
            if (mp.get(nums[i]) > Math.floor(n / 3)) {
                res.add(nums[i]);
                mp.put(nums[i], -1);
            }
        }
        return res;
    }
}