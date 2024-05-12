class Solution {
    public int maxElem(int[] piles) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(piles[i], max);
        }
        return max;
    }

    public boolean possible(int[] piles, int elem, int h) {
        double s = 0;
        for (int i = 0; i < piles.length; i++) {
            s += Math.ceil((double)piles[i] / elem);
        }
        if (s <= h) {
            return true;
        } else {
            return false;
        }
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max = maxElem(piles);
        int i = 1, j = max;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (possible(piles, mid, h)) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return i;
    }
}