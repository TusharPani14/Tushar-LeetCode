class Solution {
public:
    int minCost(string colors, vector<int>& neededTime) {
        int l=colors.length();
        int prev=0,time=0;
        for(int i=1;i<l;i++){
            if(colors[i]==colors[prev]){
                time+=min(neededTime[i],neededTime[prev]);
                if(neededTime[i]<neededTime[prev]){
                    continue;
                }
            }
            prev=i;
        }
        return time;
    }
};