class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        List<Integer> sl = new ArrayList<>();
        solve(l, sl, candidates, target, 0);
        return l;
    }

    public void solve(List<List<Integer>> l, List<Integer> sl, int[] candidates, int target, int i) {
        if (target == 0) {
            l.add(new ArrayList<>(sl));
            return;
        }
        if (target < 0 || i == candidates.length) {
            return;
        }
        if (target >= candidates[i]) {
            sl.add(candidates[i]);
            solve(l, sl, candidates, target - candidates[i], i);
            sl.remove(sl.size() - 1);
        }
        solve(l, sl, candidates, target, i + 1);
    }
}