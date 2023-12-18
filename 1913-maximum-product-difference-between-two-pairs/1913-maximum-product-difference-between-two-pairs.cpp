class Solution {
public:
    int maxProductDifference(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int l=nums.size();
        return nums[l-1]*nums[l-2]-nums[0]*nums[1];
    }
};