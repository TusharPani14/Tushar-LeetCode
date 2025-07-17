class Solution {
    public void rev(char[] s,int i){
        if(i>=s.length/2){
            return;
        }
        char ch=s[i];
        s[i]=s[s.length-i-1];
        s[s.length-i-1]=ch;
        rev(s,i+1);
    }
    public void reverseString(char[] s) {
        rev(s,0);
    }
}