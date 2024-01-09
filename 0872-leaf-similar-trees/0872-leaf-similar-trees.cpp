/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    void solve(TreeNode* &root, vector<int> &leaf){
        if(root==NULL){
            return;
        }
        if(root->left==NULL && root->right==NULL){
            leaf.push_back(root->val);
        }
        solve(root->left,leaf);
        solve(root->right,leaf);
    }
    bool leafSimilar(TreeNode* root1, TreeNode* root2) {
        vector<int>leaf1,leaf2;
        solve(root1, leaf1);
        solve(root2, leaf2);
        if(leaf1==leaf2){
            return true;
        }
        return false;
    }
};