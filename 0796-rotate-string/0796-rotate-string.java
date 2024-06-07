class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        String temp = s + s;
        for (int i = 0; i < temp.length(); i++) {
            if (i < goal.length() && goal.equals(temp.substring(i, i + goal.length())))
                return true;
        }
        return false;
    }
}