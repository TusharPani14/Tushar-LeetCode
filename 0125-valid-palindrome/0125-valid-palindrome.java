class Solution {
    public boolean isPalindrome(String s) {
        int st=0,e=s.length()-1;
        while(st<=e){
            char ch1=s.charAt(st);
            char ch2=s.charAt(e);
            if(Character.isLetterOrDigit(ch1) && !Character.isLetterOrDigit(ch2)){
                e--;
            }else if(!Character.isLetterOrDigit(ch1) && Character.isLetterOrDigit(ch2)){
                st++;
            }else{
                if(Character.toLowerCase(ch1)!=Character.toLowerCase(ch2)){
                    return false;
                }
                e--;
                st++;
            }
        }
        return true;
    }
}