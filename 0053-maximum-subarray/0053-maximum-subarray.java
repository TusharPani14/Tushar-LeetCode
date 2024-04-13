class Solution {
    public int maxSubArray(int[] nums) {
        int m=Integer.MIN_VALUE;
        int ma=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum<0){
                sum=0;
            }
            ma=Math.max(ma,nums[i]);
            m=Math.max(m,sum);
        }
        if(m<=0){
            return ma;
        }
        return m;
    }
}