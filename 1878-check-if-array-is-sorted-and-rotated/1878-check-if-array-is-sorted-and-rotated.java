class Solution {
    public boolean check(int[] nums) {
        int inc=0;
        int max=0;
        int loop=1;
        if(nums.length==1){
            return true;
        }
        for(int i=0;i<nums.length;i++){
            if(i!=nums.length-1){
                if(nums[i+1]>=nums[i]){
                    inc++;
                    max=Math.max(max,inc);
                }else{
                    inc=0;
                }
            }          
            else if(i==nums.length-1){
                if(nums[0]>=nums[nums.length-1]){
                    inc++;
                    max=Math.max(max,inc);
                }
                loop++;
                i=-1;
            }
            if(loop==3){
                break;
            }
        }
        if(max%(nums.length-1)==0){
            return true;
        }
        return false;
    }
}