class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        unordered_map<int,int> mp;
        unordered_set<int> s;
        for(auto num : arr){
            mp[num]++;
        }
        for(auto pair : mp){
            if(s.find(pair.second)!=s.end()){
                return false;
            }
            s.insert(pair.second);
        }
        return true;
    }
};