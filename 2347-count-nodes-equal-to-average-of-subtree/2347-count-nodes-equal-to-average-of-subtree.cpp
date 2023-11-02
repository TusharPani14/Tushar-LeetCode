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
    pair<int, int> f(TreeNode * root, int &res){
        if(root==NULL){
            return {0,0};
        }
        auto [left_sum, left_count]=f(root->left,res);
        auto [right_sum,right_count]=f(root->right,res);
        int curr_sum=left_sum+right_sum+root->val;
        int curr_count=left_count+right_count+1;
        if(curr_sum/curr_count==root->val){
            res++;
        }
        return {curr_sum,curr_count};
    }
    int averageOfSubtree(TreeNode* root) {
        int res=0;
        f(root,res);
        return res;
    }
};