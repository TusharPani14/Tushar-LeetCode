class Solution {
    public void sortColors(int[] nums) {
        int ze=0,on=0,tw=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ze++;
            }else if(nums[i]==1){
                on++;
            }else if(nums[i]==2){
                tw++;
            }
        }
        int i=0;
        while(i<ze){
            nums[i]=0;
            i++;
        }
        int j=i;
        while(i<j+on){
            nums[i]=1;
            i++;
        }
        int k=i;
        while(i<k+tw){
            nums[i]=2;
            i++;
        }
    }
}