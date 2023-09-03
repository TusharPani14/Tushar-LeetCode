class Solution {
public:
    long long countInterestingSubarrays(vector<int>& nums, int modulo, int k) {
        int n = nums.size();
        vector<int> prefix_sum(n + 1, 0);
        unordered_map<int, int> count;

        prefix_sum[0] = 0;
        count[0] = 1;
        long result = 0;

        for (int i = 0; i < n; i++) {
            prefix_sum[i + 1] = (prefix_sum[i] + (nums[i] % modulo == k ? 1 : 0)) % modulo;
            cout<<prefix_sum[i + 1]<<" ";
            int complement = (prefix_sum[i + 1] - k + modulo) % modulo;
            result += count[complement];
            count[prefix_sum[i + 1]]++;
        }

        return result;
    }
};