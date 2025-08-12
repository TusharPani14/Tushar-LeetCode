class Solution {
    public int findKthPositive(int[] arr, int k) {
        //Array is sorted so binary search can be applied but how
        //key point is index here
        //missing numbers means index at a particular number should be less than that number. So number of missing nos at a particular idx is=arr[i]-i+1;
        //if no of missing nos<k low=mid+1 else high=mid-1;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return k+low;
    }
}