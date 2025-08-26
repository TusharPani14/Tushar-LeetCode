class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int sign = 1;
        int num = 0;
        int res = 0;
        if (s.length() == 0) {
            return 0;
        }
        if (s.charAt(0) == '-') {
            sign = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int digit = s.charAt(i) - '0';
                if (res > (Integer.MAX_VALUE - digit) / 10) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                res = res * 10 + digit;
            } else if (i == 0 && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                continue;
            } else if (!Character.isDigit(s.charAt(i))) {
                break;
            }
        }
        return res * sign;
    }
}