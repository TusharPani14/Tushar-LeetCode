class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String s1 = strs[0];
        String s2 = strs[1];
        String ps = "";
        int i = 0;
        while (i != s1.length() && i != s2.length() && s1.charAt(i) == s2.charAt(i)) {
            i++;
        }
        ps = s1.substring(0, i);
        // System.out.println(ps);
        for (int j = 2; j < strs.length; j++) {
            while (i > strs[j].length() || !strs[j].substring(0, i).equals(ps)) {
                i--;
                if (i == 0) {
                    return "";
                }
                ps = ps.substring(0, i);
            }

        }
        return ps;
    }
}