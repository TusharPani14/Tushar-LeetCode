class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int p=0,m=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                p++;
            }else{
                m=Math.max(m,p);
                p=0;
            }
        }
        return Math.max(m,p);
    }
}