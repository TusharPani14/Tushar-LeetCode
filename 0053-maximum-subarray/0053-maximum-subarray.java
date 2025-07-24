class Solution {
    public int maxSubArray(int[] nums) {
        //Kadane's Algorithm
        //Prefix sum but when sum<0 make it sum=0 as sum<0 will not contribute to max sum.
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(sum<0){
                sum=0;
            }
            sum+=nums[i];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}