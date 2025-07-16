class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int m=x,d=0,res=0;
        while(m>0){
            d=m%10;
            res=res*10+d;
            m=m/10;
        }
        if(res==x){
            return true;
        }
        return false;
    }
}