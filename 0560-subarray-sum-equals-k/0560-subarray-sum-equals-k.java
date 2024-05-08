class Solution {
    // Sliding Window approach is for +ve numbers
    // public int subarraySum(int[] nums, int k) {
    //     int j = 0, sum = 0, ans = 0;
    //     if (nums.length == 1) {
    //         if (nums[0] == k) {
    //             return 1;
    //         } else
    //             return 0;
    //     }
    //     for (int i = 0; i < nums.length; i++) {
    //         sum += nums[i];
    //         while (sum > k) {
    //             sum = sum - nums[j];
    //             j++;
    //         }
    //         if (sum == k) {
    //             ans++;
    //         }
    //     }
    //     return ans;
    // }

    // To consider -ve numbers we have to use prefix sum
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int psum[] = new int[n];
        int ans=0;
        HashMap<Integer,Integer> mp= new HashMap<>();
        psum[0]=nums[0];
        for(int i=1;i<n;i++){
            psum[i]=psum[i-1]+nums[i];
        }
        for(int i=0;i<n;i++){
            if(psum[i]==k){
                ans++;
            }
            if(mp.containsKey(psum[i]-k)){
                ans+=mp.get(psum[i]-k);
            }
            mp.put(psum[i],mp.getOrDefault(psum[i], 0) + 1);
        }
        return ans;
    }
}