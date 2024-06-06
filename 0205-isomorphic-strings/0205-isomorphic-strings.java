import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        char cs,ct;

        for (int i = 0; i < s.length(); i++) {
            cs = s.charAt(i);
            ct = t.charAt(i);

            if (mapST.containsKey(cs)) {
                if (mapST.get(cs) != ct) {
                    return false;
                }
            } else {
                mapST.put(cs, ct);
            }

            if (mapTS.containsKey(ct)) {
                if (mapTS.get(ct) != cs) {
                    return false;
                }
            } else {
                mapTS.put(ct, cs);
            }
        }

        return true;
    }
}
