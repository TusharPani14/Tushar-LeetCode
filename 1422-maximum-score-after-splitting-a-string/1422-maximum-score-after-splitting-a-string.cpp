class Solution {
public:
    int maxScore(string s) {
        int one=0,zero=0,res=INT_MIN;
        for(auto ch:s){
            if(ch=='1')
            one++;
        }
        for(int i = 0; i < s.size() - 1; ++i){
            if(s[i]=='0'){
                zero++;
            }else{
                one--;
            }
            res=max(res,(zero+one));
        }
        return res;
    }
};