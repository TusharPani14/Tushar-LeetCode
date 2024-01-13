class Solution {
public:
    int minSteps(string s, string t) {
        int sum=0;
        unordered_map<char,int>mp;
        for(auto ch : s){
            mp[ch]++;
        }
        for(auto ch : t){
            if(mp[ch]!=0){
                mp[ch]--;
            }
        }
        for(auto pair : mp){
            sum+=pair.second;
        }
        return sum;
    }
};