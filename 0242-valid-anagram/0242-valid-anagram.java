class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int l1 = s.length();
        int l2 = t.length();
        if (l1 != l2) {
            return false;
        }
        for (int i = 0; i < l1; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            mp.put(c1, mp.getOrDefault(c1, 0) + 1);
            mp.put(c2, mp.getOrDefault(c2, 0) - 1);
        }
        for (Integer value : mp.values()) {
            if (value != 0)
                return false;
        }
        return true;
    }
}