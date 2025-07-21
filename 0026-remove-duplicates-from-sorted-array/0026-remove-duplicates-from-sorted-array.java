class Solution {
    // Better sol using hashmap
    // public int removeDuplicates(int[] nums) {
    //     int c=0;
    //     TreeSet<Integer> set=new TreeSet<>();
    //     for(int i=0;i<nums.length;i++){
    //         set.add(nums[i]);
    //     }
    //     for(Integer s:set){
    //         nums[c]=s;
    //         c++;
    //     }
    //     return c;
    // }
    // Optimal approach
    public int removeDuplicates(int[] nums){
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[++i]=nums[j];
            }
        }
        return i+1;
    }
}