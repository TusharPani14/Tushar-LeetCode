class Solution {
public:
    bool halvesAreAlike(string s) {
        int c1 = 0, c2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' ||
                s[i] == 'u' || s[i] == 'A' || s[i] == 'E' || s[i] == 'I' ||
                s[i] == 'O' || s[i] == 'U') {
                if (i < s.length() / 2) {
                    c1++;
                } else {
                    c2++;
                }
            }
        }
        return c1 == c2;
    }
};