class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Better sol logic
        //nums[k]=-(nums[i]+nums[j])
        //So we have to put elems in hashset and find nums[k]
        //So by this method we can optimise it to N^2
        //But one catch is there that we cannot put all elems at once in hashset and look for nums[k] because it may find the same number where i or j are standing. For detailed explanation look notes
        //So we have to take hashset elems between i and j
        // List<List<Integer>> ans=new ArrayList<>();
        // HashSet<List<Integer>> uniqueSet=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     HashSet<Integer> set=new HashSet<>();
        //     for(int j=i+1;j<nums.length;j++){
        //         List<Integer> row=new ArrayList<>();
        //         int third=-(nums[i]+nums[j]);
        //         if(set.contains(third)){
        //             row.add(nums[i]);
        //             row.add(nums[j]);
        //             row.add(third);
        //             Collections.sort(row);
        //             uniqueSet.add(row);
        //         }
        //         set.add(nums[j]);
        //     }
        // }
        // for(var s: uniqueSet){
        //     ans.add(s);
        // }
        // return ans;


        //Now optimal approach
        //sort
        //Fix move i and k from both ends
        //-4,-1,-1,0,1,2
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    ans.add(List.of(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }
                else if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return ans;
    }
}