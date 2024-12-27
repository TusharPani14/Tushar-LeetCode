class Solution {
    public boolean helper(String s, int i) {
        if (i >= s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        return helper(s, i + 1);
    }

    public boolean isPalindrome(String s) {
        String news="";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                news+=Character.toLowerCase(c);
            }
        }
        return helper(news, 0);
    }
}
