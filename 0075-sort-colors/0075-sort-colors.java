class Solution {
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void sortColors(int[] nums) {
        //Three pointer
        //Dutch National flag algorithm
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                if(low!=mid){
                    swap(nums,mid,low);
                    low++;
                }
                else{
                    mid++;
                } 
            }
            else if(nums[mid]==2){
                if(mid!=high){
                    swap(nums,mid,high);
                    high--;
                }
                else{
                    mid++;
                }  
            }
            else{
                mid++;
            }
        }
    }
}