class Solution {
public:
    bool backspaceCompare(string s, string t) {
        stack<int> s1,t1;
        for(int i=0;i<s.length();i++){
            if(s[i]!='#'){
                s1.push(s[i]);
            } else if (!s1.empty()) {
                s1.pop();
            }
        }
        for(int i=0;i<t.length();i++){
            if(t[i]!='#'){
                t1.push(t[i]);
            } else if (!t1.empty()) {
                t1.pop();
            }
        }
        while (!s1.empty() && !t1.empty()) {
            if (s1.top() != t1.top()) {
                return false;
            }
            s1.pop();
            t1.pop();
        }
        return s1.empty() && t1.empty();
    }
};