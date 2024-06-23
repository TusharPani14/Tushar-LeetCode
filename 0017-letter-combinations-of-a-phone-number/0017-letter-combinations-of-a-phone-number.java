class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return Collections.emptyList();
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs" ,"tuv", "wxyz"};
        List<String>l=new ArrayList<String>();
        solve(l,new String(),digits,mapping,0);
        return l;
    }
    public void solve(List<String>l,String s,String digits,String[] mapping,int i){
        if(i>=digits.length()){
            l.add(s);
            return;
        }
        int num=digits.charAt(i)-'0';
        String value=mapping[num];
        for(int j=0;j<value.length();j++){
            s+=value.charAt(j);
            solve(l,s,digits,mapping,i+1);
            s = s.substring(0, s.length() - 1);
        }
    }
}