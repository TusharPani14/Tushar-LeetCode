class Solution {
    public String removeOuterParentheses(String s) {
        //before adding check if flag is 0 then skip. After substracting check if flag is 0 then skip.
        String ans = "";
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                if (flag != 0) {
                    ans += ch;
                }
                flag++;
            } else if (ch == ')') {
                flag--;
                if (flag != 0) {
                    ans += ch;
                }
            }
        }
        return ans;
    }
}