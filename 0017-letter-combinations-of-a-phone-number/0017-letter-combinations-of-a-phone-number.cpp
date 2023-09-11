class Solution {
public:
    vector<string> ans;
    vector<string> dial = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    vector<string> letterCombinations(string digits) {
        ans.clear();
        if (digits.length() == 0) {
            return ans;
        }
        helper("", 0, digits);
        return ans;
    }
    
    void helper(string comb, int index, string digits) {
        if (index == digits.length()) {
            ans.push_back(comb);
            return;
        }
            
        string letters = dial[digits[index] - '0'];
        for (int i = 0; i < letters.length(); i++) {
            helper(comb + letters[i], index + 1, digits);
        }
    }
};