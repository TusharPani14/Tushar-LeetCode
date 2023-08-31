class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        vector<int> output;
        unordered_map<int, int> nextGreater;

        stack<int> s;
        for (int num : nums2) {
            while (!s.empty() && s.top() < num) {
                nextGreater[s.top()] = num;
                s.pop();
            }
            s.push(num);
        }

        for (int num : nums1) {
            if (nextGreater.count(num)) {
                output.push_back(nextGreater[num]);
            } else {
                output.push_back(-1);
            }
        }

        return output;
    }
};
