class Solution {
public:
    string longestPalindrome(string s) {
        int start = 0;
    int maxLength = 1;
    int length = s.length();

    for (int i = 0; i < length; ++i) {
        // Find odd length palindromes
        int low = i - 1;
        int high = i + 1;

        while (low >= 0 && high < length && s[low] == s[high]) {
            if (high - low + 1 > maxLength) {
                start = low;
                maxLength = high - low + 1;
            }
            --low;
            ++high;
        }

        // Find even length palindromes
        low = i;
        high = i + 1;

        while (low >= 0 && high < length && s[low] == s[high]) {
            if (high - low + 1 > maxLength) {
                start = low;
                maxLength = high - low + 1;
            }
            --low;
            ++high;
        }
    }

    return s.substr(start, maxLength);
    }
};