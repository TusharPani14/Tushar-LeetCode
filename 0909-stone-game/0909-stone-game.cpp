class Solution {
public:
    int t[502][502];
    int recursiveSol(int i,int j,vector<int> &piles){
        if(i==j){
            return piles[i];
        }
        if(i>j){
            return 0;
        }
        if(t[i][j]!=-1) return t[i][j];
        int pick_i=piles[i]+min(recursiveSol(i+2,j,piles),recursiveSol(i+1,j-1,piles));
        int pick_j=piles[j]+min(recursiveSol(i+1,j-1,piles),recursiveSol(i,j-2,piles));
        return t[i][j]=max(pick_i,pick_j);
    }
    bool stoneGame(vector<int>& piles) {
        memset(t, -1, sizeof(t));
        int total=accumulate(piles.begin(),piles.end(),0);
        int Alice=recursiveSol(0,piles.size()-1,piles);
        int Bob=total-Alice;
        if(Alice>=Bob){
            return true;
        }
        return false;
    }
};