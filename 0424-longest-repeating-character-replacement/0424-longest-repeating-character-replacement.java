class Solution {
    public int characterReplacement(String s, int k) {
        int j = 0;
        int max = Integer.MIN_VALUE;
        int res = Integer.MIN_VALUE;
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
            max = Math.max(max, mp.get(ch));
            if (i - j + 1 - max > k) {
                char chj = s.charAt(j);
                mp.put(chj, mp.getOrDefault(chj, 0) - 1);
                j++;
            }
            res = Math.max(res, i - j + 1);
        }
        return res;
    }
}