class Solution {
    public boolean isIsomorphic(String s, String t) {
        //Hashmap
        int l1=s.length();
        int l2=t.length();
        HashMap<Character,Character> mp=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        if(l1!=l2) return false;
        for(int i=0;i<l1;i++){
            if(!mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),t.charAt(i));
            }else{
                if(mp.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
            set.add(t.charAt(i));
        }
        if(set.size()!=mp.size()){
            return false;
        }
        return true;
    }
}