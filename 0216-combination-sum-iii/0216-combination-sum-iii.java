class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> l = new ArrayList<>();
        solve(l, new ArrayList<>(), k, n, 1);
        return l;
    }

    public void solve(List<List<Integer>> l, List<Integer> sl, int k, int n, int i) {
        if (sl.size() == k && n == 0) {
            l.add(new ArrayList<>(sl));
            return;
        } else if (sl.size() == k && n != 0)
            return;
        for (int j = i; j < 10; j++) {
            sl.add(j);
            solve(l, sl, k, n - j, j + 1);
            sl.remove(sl.size() - 1);
        }
    }
}