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
    bool check(TreeNode* &root, int val,TreeNode* &res){
        if(root==NULL){
            return false;
        }
        if(root->val==val){
            res=root;
            return true;
        }
        if(root->val>val){
            return check(root->left,val,res);
        }
        else{
            return check(root->right,val,res);
        }
    }
    TreeNode* searchBST(TreeNode* root, int val) {
        TreeNode* res=nullptr;
        check(root,val,res);
        return res;
    }
};