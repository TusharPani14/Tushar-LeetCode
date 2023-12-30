class Solution {
public:
    bool makeEqual(vector<string>& words) {
        unordered_map<char,int>mp;
        for(auto word:words){
            for(auto ch:word){
                mp[ch]++;
            }
        }
        for(auto entry: mp){
            if(entry.second % words.size()!=0){
                return false;
            }
        }
        return true;
    }
};