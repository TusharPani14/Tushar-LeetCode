// class Solution {
// public:
//     static int height(vector<int> c){
//         return max(c[0],max(c[1],c[2]));
//     }
//     static bool customComp(vector<int> a, vector<int> b){
//         return height(a)>=height(b);
//     }
//     bool canPlace(vector<int> a, vector<int> b){
//         sort(a.begin(), a.end(), greater<int>());
//         sort(b.begin(), b.end(), greater<int>());
//         if(a[0]>=b[0] && ((a[1]>=b[1] && a[2]>=b[2])||(a[1]>=b[2] && a[2]>=b[1]))){
//             return true;
//         }
//         return false;
//     }
//     int maxHeight(vector<vector<int>>& cuboids) {
//         sort(cuboids.begin(),cuboids.end(),customComp);
//         int n=cuboids.size();
//         vector <int> dp(n,0);
//         for(int i=0;i<n;i++){
//             dp[i]=height(cuboids[i]);
//             cout<<dp[i]<<" ";
//         }
//         int maxHeight=dp[0];
//         for(int i=1;i<n;i++){
//             for(int j=0;j<i;j++){
//                 if(canPlace(cuboids[j],cuboids[i])){
//                     if(height(cuboids[i])+dp[j]>dp[i]){
//                         dp[i]=height(cuboids[i])+dp[j];
//                     }
//                 }
//             }
//             maxHeight=max(maxHeight,dp[i]);
//         }
//         return maxHeight;
//     }
// };

class Solution {
    //comparator function
    static bool comp(vector<int>& d1, vector<int>& d2){
        if(d1[0] == d2[0]){
            if(d1[1] == d2[1]){
                return d1[2] < d2[2];
            }
            return d1[1] < d2[1];
        }
        return d1[0] < d2[0];
    }
public:
    int maxHeight(vector<vector<int>>& cuboids) {
        //sorting each value
        for(int i = 0; i < cuboids.size(); i++){
            sort(cuboids[i].begin(),cuboids[i].end());
        }
        //sorting the array
        sort(cuboids.begin(),cuboids.end(),comp);
        //dp array(pos,prev)
        vector<int> curr(cuboids.size()+1,0);
        vector<int> forw(cuboids.size()+1,0);
        for(int pos = cuboids.size() - 1; pos >= 0; pos--){
            for(int prev = pos - 1; prev >= -1; prev--){
                int skip = forw[prev+1];
                int take = 0;
                if(prev == -1 || (cuboids[prev][0] <= cuboids[pos][0] && cuboids[prev][1] <= cuboids[pos][1] && cuboids[prev][2] <= cuboids[pos][2])){
                    take = cuboids[pos][2] + forw[pos+1];
                }
                curr[prev+1] = max(skip,take);
            }
            forw = curr;
        }
        return curr[0];
    }
};