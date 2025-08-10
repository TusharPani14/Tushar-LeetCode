class Solution {
    public static int maxElem(int[] piles) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }
        return max;
    }

    public static boolean possible(int[] piles, int mid, int h) {
        int hrs = 0;
        for (int i = 0; i < piles.length; i++) {
            int hr = piles[i] % mid == 0 ? (int) piles[i] / mid : (int) Math.ceil((double) piles[i] / mid);
            if (hrs + hr > h) {
                return false;
            }
            hrs += hr;
        }
        if (hrs <= h) {
            return true;
        }
        return false;
    }

    public int minEatingSpeed(int[] piles, int h) {
        //koko will eat all bananas
        //min speed k such that koko can finish all bananas
        //determine search space
        //if(h<arrLength not possible)
        //high will be max elem because that is the max koko can eat in 1hr
        //low can be 1
        if (h < piles.length) {
            return -1;
        }
        int low = 1, high = maxElem(piles);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(piles, mid, h) == true) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}