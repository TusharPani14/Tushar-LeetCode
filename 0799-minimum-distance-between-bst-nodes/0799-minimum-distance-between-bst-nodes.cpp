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
    void function(TreeNode* root,int &preVal,int &minDiff){
        if(root == NULL)
        return;
        function(root->left,preVal,minDiff);
        if(preVal != -1){
            minDiff = min(minDiff,root->val - preVal);
        }
        preVal = root->val;
        function(root->right,preVal,minDiff);
    }
    int minDiffInBST(TreeNode* root) {
        int minDiff = INT_MAX;
        int preVal = -1;
        function(root,preVal,minDiff);
        return minDiff;
    }
};