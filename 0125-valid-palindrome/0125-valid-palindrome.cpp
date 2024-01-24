class Solution {
public:
    bool isPalindrome(string s) {
        int i = 0, f = 0;
        int l = s.size();
        string t;
        for (i = 0; i < l; i++) {
            if (isalnum(s[i])) {
                t += s[i];
            }
        }
        int l2 = t.size();
        for (i = 0; i < l2 / 2; i++) {
            if (tolower(t[i]) == tolower(t[l2 - i - 1]))
                continue;
            else {
                f = 1;
                break;
            }
        }
        if (f == 1)
            return false;
        else
            return true;
            
    }
};