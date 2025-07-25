class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans= new int[nums.length];
        int p=0,n=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans[n]=nums[i];
                n+=2;
            }else{
                ans[p]=nums[i];
                p+=2;
            }
        }
        return ans;
    }
}