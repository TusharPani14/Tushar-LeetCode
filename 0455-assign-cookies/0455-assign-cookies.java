class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int ans = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i = 0, j = 0; i < g.length; i++) {
            while (j < s.length && g[i] > s[j]) {
                j++;
            }
            if (j == s.length) {
                break;
            }
            ans++;
            j++;
        }
        return ans;
    }
}