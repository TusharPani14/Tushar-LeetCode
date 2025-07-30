class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Better sol logic
        //nums[k]=-(nums[i]+nums[j])
        //So we have to put elems in hashset and find nums[k]
        //So by this method we can optimise it to N^2
        //But one catch is there that we cannot put all elems at once in hashset and look for nums[k] because it may find the same number where i or j are standing. For detailed explanation look notes
        //So we have to take hashset elems between i and j
        List<List<Integer>> ans=new ArrayList<>();
        HashSet<List<Integer>> uniqueSet=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                List<Integer> row=new ArrayList<>();
                int third=-(nums[i]+nums[j]);
                if(set.contains(third)){
                    row.add(nums[i]);
                    row.add(nums[j]);
                    row.add(third);
                    Collections.sort(row);
                    uniqueSet.add(row);
                }
                set.add(nums[j]);
            }
        }
        for(var s: uniqueSet){
            ans.add(s);
        }
        return ans;
    }
}