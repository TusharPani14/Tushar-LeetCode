class Solution {
    public int helper(int x){
        int res=0;
        while(x>0){
            int d=x%10;
            res=res*10+d;
            x=x/10;
        }
        return res;
    }
    public boolean isPalindrome(int x) {
        if(x>=0 && x==helper(x)){
            return true;
        }
        return false;
    }
}