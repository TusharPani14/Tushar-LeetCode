class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<>();
        solve(l, "", n, n);
        return l;
    }

    public void solve(List<String> l, String s, int left, int right) {
        if (left == 0 && right == 0) {
            l.add(s);
            return;
        }
        if (left > 0) {
            solve(l, s + "(", left - 1, right);
        }
        if (right > left) {
            solve(l, s + ")", left, right - 1);
        }
    }
}