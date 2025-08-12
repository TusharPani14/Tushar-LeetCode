class Solution {
    public static int maxElem(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    }
    public static boolean possible(int[] nums, int div, int threshold){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(Math.ceil((double)nums[i]/div));
            if(sum>threshold){
                return false;
            }
        }
        return true;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        //If threshold is less than array size return -1
        //We have to guess a number so we can apply binary search
        //Think of range[1-maxElem]
        if(threshold<nums.length){
            return -1;
        }
        int low=1,high=maxElem(nums);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(nums,mid,threshold)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}