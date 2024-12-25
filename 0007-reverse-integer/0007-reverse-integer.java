class Solution {
    public int helper(int x){
        int rev=0;
        while(x>0){
            int d=x%10;
            rev=rev*10+d;
            x=x/10;
        }
        return rev;
    }
    public int reverse(int x) {
        if(x<0){
            return -1*helper(x*-1);
        }else{
            return helper(x);
        }
    }
}