class Solution {
    public int majorityElement(int[] nums) {
        //Moore’s Voting Algorithm
        int c=0;
        int elem=nums[0];
        for(int i=0;i<nums.length;i++){
            if(c==0){
                elem=nums[i];
                c++;
            }else{
                if(elem==nums[i]){
                    c++;
                }else{
                    c--;
                }
            }
        }
        return elem;
    }
}