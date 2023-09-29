class Solution {
public:
    bool isMonotonic(vector<int>& nums) {
        int temp=1;
        if(nums.size()==1 || nums.size()==0){
            return true;
        }
        if(nums[0]>nums[nums.size()-1]){
            temp=1;
        }
        else{
            temp=0;
        }
        bool res=false;
        for(int i=0;i<nums.size()-1;i++){
            if(temp==1){
                if(nums[i]>=nums[i+1]){
                    res=true;
                }
                else{
                    return false;
                }
            }
            else if(temp==0){
                if(nums[i]<=nums[i+1]){
                    res=true;
                }
                else{
                    return false;
                }
            }
        }
        return res;
    }
};