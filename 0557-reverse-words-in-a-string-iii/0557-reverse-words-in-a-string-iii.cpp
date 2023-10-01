class Solution {
public:
    string reverseWords(string s) {
        s+=" ";
        string t,res;
        for(int i=0;i<s.length();i++){
            if(s[i]!=' '){
                t+=s[i];
            }else{
                reverse(t.begin(), t.end());
                res+=t+" ";
                t="";
            }
        }
        res.erase(res.length()-1);
        return res;
    }
};