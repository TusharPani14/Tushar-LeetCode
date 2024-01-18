class Solution {
public:
    int addDigits(int num) {
        int c=2;
        while(c>1){
            int d=0,s=0;
            c=0;
            while(num>0){
                d=num%10;
                s+=d;
                c=c+1;
                cout<<c<<endl;
                num=num/10;
            }
            num=s;
        }
        return num;
    }
};