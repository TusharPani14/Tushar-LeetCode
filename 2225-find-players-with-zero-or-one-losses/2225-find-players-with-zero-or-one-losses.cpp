class Solution {
public:
    vector<vector<int>> findWinners(vector<vector<int>>& matches) {
        unordered_map<int,int>win;
        unordered_map<int,int>loss;
        vector<int>winn,losss;
        for(auto pair : matches){
            win[pair[0]]++;
            loss[pair[1]]++;
        }
        for(auto pair : win){
            if(loss.find(pair.first)==loss.end()){
                winn.push_back(pair.first);
            }
        }
        for(auto pair : loss){
            if(pair.second == 1){
                losss.push_back(pair.first);
            }
        }
        sort(winn.begin(),winn.end());
        sort(losss.begin(),losss.end());
        return{winn,losss};
    }
};