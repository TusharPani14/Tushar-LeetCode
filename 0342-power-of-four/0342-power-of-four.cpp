class Solution {
public:
    bool isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        double res=log(n)/log(4);
        int res2=log(n)/log(4);
        return res==double(res2);
    }
};