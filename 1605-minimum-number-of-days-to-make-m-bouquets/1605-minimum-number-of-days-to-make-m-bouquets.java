class Solution {
    public static Pair<Integer, Integer> findLowHigh(int[] bloomDay) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }
        Pair<Integer, Integer> p = new Pair<>(min, max);
        return p;
    }

    public static boolean possible(int[] bloomDay, int day, int m, int k) {
        int cf = 0, cb = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                cf++;
                if (cf == k) {
                    cb++;
                    cf = 0;
                }
            } else {
                cf = 0;
            }
        }
        if (cb >= m)
            return true;
        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        //first of all if num of Bouquets(m) * num of flowers(k)> arrlength then its not possible
        //Define range [minOfArr,maxOfArr](because these are the days our ans will lie between this)
        int n = bloomDay.length;
        if ((long)m * k > n) {
            return -1;
        }
        Pair<Integer, Integer> p = findLowHigh(bloomDay);
        int low = p.getKey(), high = p.getValue();
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}