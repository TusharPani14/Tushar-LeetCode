class Solution {
public:
    int recursiveSol(int i,int j,vector<int> & nums){
        if(i>j){
            return 0;
        }
        if(i==j){
            return nums[i];
        }
        int pick_i=nums[i]+min(recursiveSol(i+2,j,nums),recursiveSol(i+1,j-1,nums));
        int pick_j=nums[j]+min(recursiveSol(i+1,j-1,nums),recursiveSol(i,j-2,nums));
        return max(pick_i,pick_j);
    }
    bool predictTheWinner(vector<int>& nums) {
        int total=accumulate(nums.begin(),nums.end(),0);
        int player1Score=recursiveSol(0,nums.size()-1,nums);
        int player2Score=total-player1Score;
        cout<<total<<" "<<player1Score<<" "<<player2Score;
        if(player1Score>=player2Score){
            return true;
        }
        return false;
    }
};