class Solution {
    public int longestConsecutive(int[] nums) {
        //store the elems in hashset
        //loop through hashset
        //check if the hashset contain elem-1. If not then we can assume it is the smallest elem and search for elems greater(elem+1) than that until it doesn't exist anymore and store the maxLength.
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max=1;
        if(nums.length==0) max=0;
        for(Integer it: set){
            if(!set.contains(it-1)){
                int i=it;
                while(set.contains(i+1)){
                    max=Math.max(max,++i-it+1);
                }
            }
        }
        return max;
    }
}