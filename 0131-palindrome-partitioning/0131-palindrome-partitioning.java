class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> l = new ArrayList<List<String>>();
        solve(l, new ArrayList<>(), s, 0);
        return l;
    }

    public void solve(List<List<String>> l, List<String> sl, String s, int i) {
        if (i >= s.length()) {
            l.add(new ArrayList<>(sl));
            return;
        }
        for (int j = i; j < s.length(); j++) {
            if (isPalin(i, j, s)) {
                sl.add(s.substring(i, j + 1));
                solve(l, sl, s, j + 1);
                sl.remove(sl.size() - 1);
            }
        }
    }

    public boolean isPalin(int st, int e, String s) {
        while (st <= e) {
            if (s.charAt(st++) != s.charAt(e--)) {
                return false;
            }
        }
        return true;
    }
}