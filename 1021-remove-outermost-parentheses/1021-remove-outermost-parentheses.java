class Solution {
    public String removeOuterParentheses(String s) {
        int c = 0;
        String o = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                if (c != 0) {
                    o += ch;
                }
                c++;
            } else if (ch == ')') {
                if (c != 1) {
                    o += ch;
                }
                c--;
            }
        }
        return o;
    }
}