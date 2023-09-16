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
    int balanced(TreeNode* root){
        if(root==NULL){
            return 0;
        }
        int leftHeight = balanced (root -> left);
        if(leftHeight==-1)
        return -1;
        int rightHeight = balanced(root->right);
        if(rightHeight==-1)
        return -1;
        if (abs(leftHeight - rightHeight) > 1)  
            return -1;
        return max (leftHeight, rightHeight) + 1;
    }
    bool isBalanced(TreeNode* root) {
        int res=balanced(root);
        if(res!=-1)
        return true;
        else
        return false;
    }
};