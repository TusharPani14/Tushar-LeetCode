class Solution {
public:
    TreeNode* searchBST(TreeNode* root, int val) {
        while (root != nullptr) {
            if (root->val == val) {
                return root;
            } else if (root->val > val) {
                root = root->left;
            } else {
                root = root->right;
            }
        }
        return nullptr; // Value not found in the BST
    }
};
