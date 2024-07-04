import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> mp = new HashMap<>();
        int max = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (mp.containsKey(s.charAt(i))) {
                j = Math.max(j, mp.get(s.charAt(i)) + 1);
            }
            mp.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
