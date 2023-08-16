class Solution {
public:
    bool matrixFound = false;
    bool isSafe(vector<vector<char>>& board,int i,int j,int no){
        for(int k=0;k<9;k++){
            if(board[k][j]==no+'0' || board[i][k]==no+'0'){
                return false;
            }
        }
        int sx=(i/3)*3;
        int sy=(j/3)*3;
        for(int x=sx;x<sx+3;x++){
            for(int y=sy;y<sy+3;y++){
                if(board[x][y]==no+'0')
                return false;
            }
        }
        return true;
    }
    void recursiveSol(vector<vector<char>>& board,int i,int j){
        if (matrixFound) return;
        if(i==9){
            matrixFound = true;
            return;
        }
        if(j==9){
            recursiveSol(board,i+1,0);
        }
        else{
            if(board[i][j]!='.'){
                recursiveSol(board,i,j+1);
                if (matrixFound) return;
            }else{
                for(int no=1;no<=9;no++){
                    if(isSafe(board,i,j,no)){
                    board[i][j]=no+'0';
                    recursiveSol(board,i,j+1);
                    if (matrixFound) return;
                    board[i][j]='.';
                    }
                }
            }
        }
    }
    void solveSudoku(vector<vector<char>>& board) {
        recursiveSol(board,0,0);
    }
};