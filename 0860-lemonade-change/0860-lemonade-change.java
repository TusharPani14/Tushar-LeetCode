class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f = 0, t = 0, fi = 0;
        for (int bill : bills) {
            if (bill == 5)
                f++;
            else if (bill == 10) {
                f--;
                t++;
            } else if (t > 0) {
                t--;
                f--;
            } else {
                f -= 3;
            }
            if (f < 0)
                return false;
        }
        return true;
    }
}