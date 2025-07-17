class Solution {
    public boolean checkPalin(String cs,int i){
        if(i>=cs.length()/2){
            return true;
        }
        if(cs.charAt(i)!=cs.charAt(cs.length()-i-1)){
            return false;
        }
        return checkPalin(cs,i+1);
    }
    public boolean isPalindrome(String s) {
        String cs="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                cs=cs+Character.toLowerCase(ch);
            }
        }
        return checkPalin(cs,0);
    }
}