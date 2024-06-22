class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        List<Integer> sl = new ArrayList<>();
        Arrays.sort(candidates);
        solve(l, sl, candidates, target, 0);
        return l;
    }

    public void solve(List<List<Integer>> l, List<Integer> sl, int[] candidates, int target, int i) {
        if (target == 0) {
            l.add(new ArrayList<>(sl));
            return;
        }
        for (int j = i; j < candidates.length; j++) {
            if (j > i && candidates[j] == candidates[j - 1]) {
                continue;
            }
            if (candidates[j] > target) {
                break;
            }
            sl.add(candidates[j]);
            solve(l, sl, candidates, target - candidates[j], j + 1);
            sl.remove(sl.size() - 1);
        }
    }
}