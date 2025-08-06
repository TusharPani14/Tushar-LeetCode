class Solution {
    public boolean search(int[] nums, int target) {
        //problem with traditional approach arrises when all three low,mid and high have same value;
        //In that case we will use the logic that if arr[mid]!=target neighter will low and high. So in that case we will shrink our search space to low++ and high--;
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return true;
            }
            else if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }
            else if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
}