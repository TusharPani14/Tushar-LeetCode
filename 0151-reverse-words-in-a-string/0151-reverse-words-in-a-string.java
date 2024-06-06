class Solution {
    public String reverseWords(String s) {
        String o = "", w = "";
        s = " " + s;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                w = ch + w;
            } else {
                if (w != "")
                    o += " " + w;
                w = "";
            }
        }
        return o.substring(1);
    }
}