class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> ans;
        int n = nums.size();
       vector<int>::iterator lower, upper;

        lower = lower_bound(nums.begin(), nums.end(), target);
        upper = upper_bound(nums.begin(), nums.end(), target);

        if (lower != nums.end() && *lower == target) 
        {
        ans.push_back(std::distance(nums.begin(), lower));
        ans.push_back(std::distance(nums.begin(), upper) - 1);
        } 
        else 
        {
        ans.push_back(-1);
        ans.push_back(-1);
        }

        return ans;
    }
};