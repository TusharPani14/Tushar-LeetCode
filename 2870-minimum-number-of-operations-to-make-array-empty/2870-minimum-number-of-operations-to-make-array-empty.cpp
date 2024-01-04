class Solution {
public:
    int minOperations(vector<int>& nums) {
        unordered_map<int,int> m;
        for(int i=0;i<nums.size();i++){
            m[nums[i]]++;
        }
        int sumFreq = 0;
        
        for (const auto& pair : m) {
            if(pair.second == 1){
                return -1;
            }
            if(pair.second % 3==0){
                sumFreq+=pair.second/3;
            }
            else if(pair.second % 2==0){
                if(pair.second % 3==2 || pair.second % 3==1){
                    sumFreq+=pair.second/3 + 1;
                }
            }
            else{
                sumFreq+=pair.second/3 + 1;
            }
        }
        return sumFreq;
    }
};