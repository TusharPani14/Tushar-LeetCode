class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        unordered_map<int,int>mp;
        vector<int>op;
        for(auto num:nums){
            mp[num]++;
            if(mp[num]>1){
                op.push_back(num);
            }
        }
        return op;
    }
};