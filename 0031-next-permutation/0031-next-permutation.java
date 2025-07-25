class Solution {
    public void nextPermutation(int[] nums) {
        //Start moving from end of array.
        //Find the peak. Means find an elem where arr[i-1]<arr[i]
        //After finding the elem which is just smaller than peak find an elem which is just greater than the elem 
        //Swap with that elem
        //reverse the part of array from peak to last
        int idx=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                idx=i-1;
                break;
            }
        }
        if(idx==-1){
            reverse(nums,0,nums.length-1);
        }else{
            int swapidx=0;
            for(int i=nums.length-1;i>idx;i--){
                if(nums[i]>nums[idx]){
                    swapidx=i;
                    break;
                }
            }
            int temp=nums[swapidx];
            nums[swapidx]=nums[idx];
            nums[idx]=temp;
            reverse(nums,idx+1,nums.length-1);
        }
    }
    public static void reverse(int[] nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}