class Solution {
    public boolean check(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                c++;
            }
            if(i==nums.length-1){
                if(c==0){
                    return true;
                }else if(c==1 && nums[i]<=nums[0]){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}