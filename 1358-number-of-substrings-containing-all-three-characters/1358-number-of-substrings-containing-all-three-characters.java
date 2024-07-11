class Solution {
    public int numberOfSubstrings(String s) {
        int[] ls = { -1, -1, -1 };
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            ls[s.charAt(i) - 'a'] = i;
            if (ls[0] != -1 && ls[1] != -1 && ls[2] != -1) {
                res += (1 + (Math.min(ls[2], Math.min(ls[0], ls[1]))));
            }
        }
        return res;
    }
}