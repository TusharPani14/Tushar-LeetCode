class Solution {
public:
    bool check(TreeNode* root1, TreeNode* root2) {
        if (root1 == nullptr && root2 == nullptr) {
            return true;
        }
        if (root1 == nullptr || root2 == nullptr) {
            return false;
        }
        if (root1->val != root2->val) {
            return false;
        }

        bool sameOrientation = check(root1->left, root2->left) && check(root1->right, root2->right);
        bool flippedOrientation = check(root1->left, root2->right) && check(root1->right, root2->left);

        return sameOrientation || flippedOrientation;
    }

    bool flipEquiv(TreeNode* root1, TreeNode* root2) {
        if (check(root1, root2)) {
            return true;
        }
        return false;
    }
};
