class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char cs=s.charAt(i);
            char ct=t.charAt(i);
            if(mp.containsKey(cs)){
                if(mp.get(cs)!=ct)
                return false;
            }
            mp.put(cs,ct);
        }
        return true;
    }
}