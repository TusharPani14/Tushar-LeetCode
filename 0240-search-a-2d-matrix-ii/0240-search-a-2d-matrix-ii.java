class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Binary search can be applied in completly increasing or decreasing array
        //Find a point or a combination of row and col where the complete array is increasing or decresing
        //Consider the first row and last col. Notice that it is increasing from 1-15 then again increasing from 15-30. 
        //So mid will be 15. Check 15< or >target. 15>5. So remove the part where it is greater than 15. so row--;
        int row=0,col=matrix[0].length-1;
        while(col>=0 && row<matrix.length){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}