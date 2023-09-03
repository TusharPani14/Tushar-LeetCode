class Solution {
public:
    int minimumOperations(string num) {
        int ans = num.length();
        int n = num.length();
        int c1 = 0, c2 = 0, c3 = 0, d1 = 0, d2 = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (d1 == 0) {
                if (num[i] == '0') {
                    d1++;
                } else {
                    c1++;
                }
            } else {
                if (num[i] == '0' || num[i] == '5') {
                    d1 = 2;
                    break;
                } else {
                    c1++;
                }
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (d2 == 0) {
                if (num[i] == '5') {
                    d2++;
                } else {
                    c2++;
                }
            } else {
                if (num[i] == '2' || num[i] == '7') {
                    d2 = 2;
                    break;
                } else {
                    c2++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (num[i] != '0') {
                c3++;
            }
        }

        if (d1 == 2) {
            ans = min(c1, ans);
        }

        if (d2 ==  2) {
            ans = min(c2, ans);
        }

        ans = min(c3, ans);

        return ans;
    }
};
