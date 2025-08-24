class Solution {
    public static int maxElem(int[][] mat, int mid) {
        int max = -1;
        int row = -1;
        for (int i = 0; i < mat.length; i++) {
            if (max < mat[i][mid]) {
                max = mat[i][mid];
                row = i;
            }
        }
        return row;
    }

    public int[] findPeakGrid(int[][] mat) {
        //We will perform BS on col
        //In the mid col find maxElem
        //So the elem which is max is surely greater that its top and bottom
        //We have to check for its left and right elem and progress with BS.
        int low = 0, high = mat[0].length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = maxElem(mat, mid);
            int left = mid > 0 ? mat[row][mid - 1] : Integer.MIN_VALUE;
            int right = mid < mat[0].length - 1 ? mat[row][mid + 1] : Integer.MIN_VALUE;
            if (mat[row][mid] > left && mat[row][mid] > right) {
                System.out.println(mat[row][mid] + " " + left + " " + right);
                return new int[] { row, mid };
            } else if (mat[row][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }
}