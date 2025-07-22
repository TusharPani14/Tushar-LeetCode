class Solution {
    public int missingNumber(int[] nums) {
        //Brute
        //Check nums.length. Check for each elem if present in nums
        //Optimal
        //XOR
        int xor1=nums[0],xor2=0;
        for(int i=1;i<nums.length;i++){
            xor1=xor1^nums[i];
        }
        for(int i=1;i<=nums.length;i++){
            xor2=xor2^i;
        }
        return xor1^xor2;
    }
}