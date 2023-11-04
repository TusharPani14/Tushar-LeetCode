class Solution {
public:
    int getLastMoment(int n, std::vector<int>& left, std::vector<int>& right) {
        int maxLeft = left.empty() ? 0 : *std::max_element(left.begin(), left.end());
        int minRight = right.empty() ? n : *std::min_element(right.begin(), right.end());
        return max(maxLeft, n - minRight);
    }
};