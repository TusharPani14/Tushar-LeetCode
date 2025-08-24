class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Main logic is convert 1D to 2D
        //if mat[n][m]
        //row=mid%m
        //col=mid/m
        int n=matrix.length,m=matrix[0].length;
        int low=0,high=n*m-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=mid%m;
            int col=mid/m;
            if(matrix[col][row]==target){
                return true;
            }
            else if(matrix[col][row]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}