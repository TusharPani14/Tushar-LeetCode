class Solution {
    public int reverse(int x) {
        int res=0,d=0;
        int m= (x>=0)? x:x*-1; 
        while(m>0){
            d=m%10;
            if(res>(Integer.MAX_VALUE-d)/10)
                return 0;
            res=res*10+d;
            m=m/10;
        }
        return (x>0)?res: res*-1;
    }
}