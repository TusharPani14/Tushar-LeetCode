class Solution {
    public int reverse(int x) {
        int rev=0,d=0;
        int n=Math.abs(x);
        while(n>0){
            d=n%10;
            if (rev > (Integer.MAX_VALUE - d) / 10) {
                return 0;  
            }
            rev=rev*10+d;
            n=n/10;
        }
        if(x>=0){
            return rev;
        }else{
            return -rev;
        }
    }
}