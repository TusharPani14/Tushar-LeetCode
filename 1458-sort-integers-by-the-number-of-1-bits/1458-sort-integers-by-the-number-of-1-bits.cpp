class Solution {
public:
    static bool customComp(int a,int b){
        int countA=0,countB=0;
        int tempA=a,tempB=b;
        while(a){
            if(a&1==1){
                countA++;
            }
            a=a>>1;
        }
        while(b){
            if(b&1==1){
                countB++;
            }
            b=b>>1;
        }
        if(countA==countB){
            return tempA<tempB;
        }else{
            return countA<countB;
        }
    }
    vector<int> sortByBits(vector<int>& arr) {
        sort(arr.begin(),arr.end(),customComp);
        return arr;
    }
};