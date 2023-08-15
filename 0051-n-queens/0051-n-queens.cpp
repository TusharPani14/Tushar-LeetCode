class Solution {
public:
    bool canPlace(vector<string> &temp,int n,int x,int y){
        for(int k=0;k<x;k++){
            if(temp[k][y]=='Q')
            return false;
        }
        int i=x;
        int j=y;
        while(i>=0 && j>=0){
            if(temp[i][j]=='Q')
            return false;
            i--;
            j--;
        }
        i=x;
        j=y;
        while(i>=0 && j<n){
            if(temp[i][j]=='Q')
            return false;
            i--;
            j++;
        }
        return true;
    }
    void recursiveSol(int n,vector<string> &temp,int i,vector<vector<string>> &ans){
        if(i==n){
            ans.push_back(temp);
            return;
        }
        for(int j=0;j<n;j++){
            if(canPlace(temp,n,i,j)){
                temp[i][j]='Q';
                recursiveSol(n,temp,i+1,ans);
                temp[i][j]='.';
            }
        }
    }
    vector<vector<string>> solveNQueens(int n) {
        vector<vector<string>> ans;
        vector<string> temp(n, string(n, '.'));
        recursiveSol(n, temp, 0, ans);
        return ans;
    }
};