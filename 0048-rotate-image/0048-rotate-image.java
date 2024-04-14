class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                swap(matrix,i,j,j,i);
            }
        }
        for(int i=0;i<matrix.length;i++){
            reverse(matrix[i]);
        }
    }
    public void reverse(int[] row){
        int s=0;
        int e=row.length-1;
        while(s<e){
            swap(row,s,e);
            s++;
            e--;
        }
    }
    private void swap(int[][] matrix, int i1, int j1, int i2, int j2) {
        int temp = matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2] = temp;
    }

    private void swap(int[] row, int i, int j) {
        int temp = row[i];
        row[i] = row[j];
        row[j] = temp;
    }
}