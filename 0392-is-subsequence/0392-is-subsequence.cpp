class Solution {
public:
    bool isSubsequence(string s, string t) {
        string comp;
        if(s.length()==0){
            return true;
        }
        for(int i=0,j=0;i<s.length() && j<t.length();){
            if(s.at(i)!=t.at(j)){
                j++;
            }else{
                comp+=s.at(i);
                i++;
                j++;
            }
        }
        if(comp.compare(s)==0){
            return true;
        }
        else{
            return false;
        }
    }
};