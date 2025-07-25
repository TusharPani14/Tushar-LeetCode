class Solution {
    public void setZeroes(int[][] matrix) {
        //See first thing is we need row array and col array to keep track of 0's
        //But question says we have to do it in place.
        //So we will use first col and first row as arrays to keep track.
        //But the problem is first elem of matrix will overlap
        //To avoid that we can keep the first elem to one single var as col1
        //Then we need to start the traversal and marking excluding the 1st row and col
        //Then we can perform the col array part then we can proceed with row array part.
        int col1=1;
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0 && j!=0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }else if(matrix[i][j]==0 && j==0){
                    col1=0;
                }
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(matrix[0][0]==0){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }
        if(col1==0){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
    }
}