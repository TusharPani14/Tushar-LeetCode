class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>mp=new HashMap<Integer,Integer>();
        int[] res= new int[2];
        for(int i=0;i<nums.length;i++){
            if(mp.get(target-nums[i])!=null && mp.get(target-nums[i])!=i){
                res[0]=i;
                res[1]=mp.get(target-nums[i]);
                return res;
            }
            mp.put(nums[i],i);
        }
        return res;
    }
}