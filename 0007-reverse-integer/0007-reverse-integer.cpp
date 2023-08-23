class Solution {
public:
    int reverse(int x) {
        long n=abs(x),d=0,s=0;
        while(n>0)
        {
            d=n%10;
            s=s*10+d;
            n=n/10;
        }
        cout<<s;
        if(s>(pow(2,31)-1))
        return 0;
        else
        {
            if(x>0)
              return s;
              else
              return -s;
        }
    }
};