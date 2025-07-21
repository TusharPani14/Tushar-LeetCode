class Solution {
    //brute using O(N^2)
    //better sol using extra space but T.C = O(N)
    // public void rotate(int[] nums, int k) {
    //     k=k%nums.length;
    //     int[] temp = new int[k];
    //     for(int i=nums.length-1;i>=nums.length-k;i--){
    //         temp[i-(nums.length-1)+k-1]=nums[i];
    //     }
    //     //move rest elems to +k pos
    //     for(int i=nums.length-k-1;i>=0;i--){
    //         nums[i+k]=nums[i];
    //     }
    //     for(int i=0;i<k;i++){
    //         nums[i]=temp[i];
    //     }
    // }

    //Optimal Sol
    public void reverse(int[] nums, int l,int r){
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
}