class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> n=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                p.add(nums[i]);
            }else{
                n.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length/2;i++){
            nums[2*i]=p.get(i);
            nums[2*i+1]=n.get(i);
        }
        return nums;
    }
}