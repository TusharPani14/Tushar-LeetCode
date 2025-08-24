class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s=' '+s;
        int n = s.length();
        int r = n;
        int flag = 0;
        String res = "";
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ' ' && flag == 0) {
                res += s.substring(i, r);
                r = i;
                flag = 1;
            } else if (ch == ' ' && flag == 1) {
                r--;
            } else if (ch != ' ') {
                flag = 0;
            }
        }
        return res.substring(1,res.length());
    }
}