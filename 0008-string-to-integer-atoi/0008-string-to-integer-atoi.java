class Solution {
    public int myAtoi(String s) {
        boolean nve = false, digit = false;
        long res = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                if (digit)
                    break;
                continue;
            } else if (ch == '-') {
                if (digit)
                    break;
                nve = true;
                digit = true;
            } else if (ch == '+') {
                if (digit)
                    break;
                digit = true;
            } else if (Character.isDigit(ch)) {
                digit = true;
                res = res * 10 + (ch - '0');
                if (res > Integer.MAX_VALUE) {
                    break;
                }
            } else {
                break;
            }
        }

        if (nve) {
            res = -res;
        }

        if (res < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else if (res > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        return (int) res;
    }
}
