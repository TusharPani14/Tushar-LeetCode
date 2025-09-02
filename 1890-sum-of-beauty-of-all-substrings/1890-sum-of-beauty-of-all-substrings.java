class Solution {
    public int beautySum(String s) {
        //Generate all substrings
        //Count beauty
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] mp = new int[26];
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                mp[ch - 'a']++;
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < 26; k++) {
                    if (mp[k] > 0) {
                        min = Math.min(min, mp[k]);
                        max = Math.max(max, mp[k]);
                    }
                }
                res += (max - min);
            }
        }
        return res;
    }
}