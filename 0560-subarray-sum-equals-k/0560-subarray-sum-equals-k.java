class Solution {
    public int subarraySum(int[] nums, int k) {
        //prefix sum and hashmap for storing count
        HashMap<Integer,Integer> mp=new HashMap<>();
        int sum=0,c=0;
        mp.put(0, 1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(mp.containsKey(sum-k)){
                c+=mp.get(sum-k);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return c;
    }
}