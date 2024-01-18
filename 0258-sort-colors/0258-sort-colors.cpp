class Solution {
public:
    void sortColors(int A[], int n) {
        int num[3];
        num[0] = num[1] = num[2];
        for (int i=0; i<n; i++) {
            num[A[i]]++;
        }
        int idx = 0;
        for (int i=0; i<3; i++) {
            for (int j=0; j<num[i]; j++) {
                A[idx++] = i;
            }
        }
    }
};