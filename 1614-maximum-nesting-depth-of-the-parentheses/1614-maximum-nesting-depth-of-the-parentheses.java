class Solution {
    public int maxDepth(String s) {
        int max = Integer.MIN_VALUE;
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                c++;
                max = Math.max(max, c);
            } else if (ch == ')') {
                c--;
            }
        }
        if (max != Integer.MIN_VALUE)
            return max;
        else
            return 0;
    }
}