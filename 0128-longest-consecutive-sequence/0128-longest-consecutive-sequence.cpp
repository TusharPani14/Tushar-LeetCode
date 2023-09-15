class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int>numsSet;
        int count=1,largest=0;
        for(auto num:nums){
            numsSet.insert(num);
        }
        for(int i=0;i<nums.size();i++){
            if(numsSet.find(nums[i]-1)== numsSet.end()){
                int j=i;
                count=1;
                int sum=nums[j]+1;
                while(numsSet.find(sum)!= numsSet.end()){
                    count++;
                    sum++;
                }
                largest=max(largest,count);
            }
        }
        return largest;
    }
};