class Solution {
public:
    unordered_map<int, int> countMap;
    int maxCount = 0;

    void inorder(TreeNode* root) {
        if (!root) return;

        inorder(root->left);

        countMap[root->val]++;
        maxCount = max(maxCount, countMap[root->val]);

        inorder(root->right);
    }

    vector<int> findMode(TreeNode* root) {
        inorder(root);

        vector<int> modes;
        for (const auto& pair : countMap) {
            if (pair.second == maxCount) {
                modes.push_back(pair.first);
            }
        }

        return modes;
    }
};
