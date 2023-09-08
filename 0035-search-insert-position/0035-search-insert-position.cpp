class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int i;
        for(i=0;i<nums.size();i++)
        {
            if(nums[i]==target)
            {
                break;
            }
            else if(nums[i]>target)
            {
                break;
            }
        }
        return i;
        }
        
};