class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> l = new ArrayList<List<Integer>>();
        List<Integer> sl = new ArrayList<>();
        solve(l, sl, nums, 0);
        return l;
    }

    public void solve(List<List<Integer>> l, List<Integer> sl, int[] nums, int i) {
        if (i >= nums.length) {   
            l.add(new ArrayList<>(sl));
            return;
        }
        sl.add(nums[i]);
        solve(l,sl,nums,i+1);
        sl.remove(sl.size()-1);
        solve(l,sl,nums,i+1);
    }
}