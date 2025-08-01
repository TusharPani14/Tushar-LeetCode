class Solution {
    public int reversePairs(int[] nums) {
        int c = mergeSort(nums, 0, nums.length - 1);
        return c;
    }

    public static int mergeSort(int arr[], int l, int h) {
        int c = 0;
        if (l >= h) {
            return 0;
        }
        int mid = l + (h - l) / 2;
        c += mergeSort(arr, l, mid);//count from lect
        c += mergeSort(arr, mid + 1, h);//count from right
        c += countPairs(arr, l, mid, h);
        merge(arr, l, mid, h);
        return c;
    }

    public static int countPairs(int arr[], int l, int mid, int h) {
        //[25, 40]  [12, 19]
        //25>12*2  So c=+1
        //25 !> 12*2
        //40>19*2 So c=+2 (If 25 greater than 12*2 so obiously 40 will be greater than 12*2. Thus we have to add that also)
        int c = 0;
        int r = mid + 1;
        for (int i = l; i <= mid; i++) {
            while (r <= h && (long)arr[i] > 2L * arr[r]) {
                r++;
            }
            c += (r - (mid + 1));
        }
        return c;
    }

    public static void merge(int arr[], int l, int mid, int h) {
        int left = l;
        int right = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();
        while (left <= mid && right <= h) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= h) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = l; i <= h; i++) {
            arr[i] = temp.get(i - l);
        }
    }
}