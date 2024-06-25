class Solution {
    public int sumSubarrayMins(int[] A) {
        Stack<int[]> previousLess = new Stack<>();
        Stack<int[]> nextLess = new Stack<>();
        int[] leftDistance = new int[A.length];
        int[] rightDistance = new int[A.length];
        
        // Calculate distances to the previous less elements
        for (int i = 0; i < A.length; i++) {
            // use ">=" to deal with duplicate elements
            while (!previousLess.isEmpty() && previousLess.peek()[0] > A[i]) {
                previousLess.pop();
            }
            
            leftDistance[i] = previousLess.isEmpty() ? i + 1 : i - previousLess.peek()[1];
            previousLess.push(new int[]{A[i], i});
        }
        
        // Calculate distances to the next less elements
        for (int i = A.length - 1; i >= 0; i--) {
            // use ">" to deal with duplicate elements
            while (!nextLess.isEmpty() && nextLess.peek()[0] >= A[i]) {
                nextLess.pop();
            }
            
            rightDistance[i] = nextLess.isEmpty() ? A.length - i : nextLess.peek()[1] - i;
            nextLess.push(new int[]{A[i], i});
        } 
        
        // Calculate the result using left and right distances
        int ans = 0;
        int mod = 1000000007;
        for (int i = 0; i < A.length; i++) {
            long product = (long) A[i] * leftDistance[i] * rightDistance[i];
            ans = (int) ((ans + product) % mod);
        }
        return ans;
    }
}
