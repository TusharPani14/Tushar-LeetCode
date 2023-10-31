class Solution {
public:
    vector<int> findArray(vector<int>& pref) {
        vector<int>ans;
        int temp=0;
        for(int i=0;i<pref.size();i++){
            ans.push_back(temp^pref[i]);
            temp=pref[i];
        }
        return ans;
    }
};