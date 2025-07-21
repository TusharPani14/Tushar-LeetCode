class Solution {
    public int removeDuplicates(int[] nums) {
        //Better sol using hashmap
        int c=0;
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(Integer s:set){
            nums[c]=s;
            c++;
        }
        return c;
    }
}