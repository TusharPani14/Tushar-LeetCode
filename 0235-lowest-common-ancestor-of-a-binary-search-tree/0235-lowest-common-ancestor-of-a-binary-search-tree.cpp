/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

class Solution {
public:
   
bool isLeaf(TreeNode *head)
{
    return !(head->left || head->right);
}
TreeNode *lowestCommonAncestor(TreeNode *root, TreeNode *p, TreeNode *q)
{
    if(!root)
        return nullptr; 
    if (root->val == p->val)
        return p;
    else if (root->val == q->val)
        return q;
    else if (isLeaf(root))
        return nullptr;
    
    auto left = lowestCommonAncestor(root->left, p,q); 
    auto right = lowestCommonAncestor(root->right, p,q); 
    if(left == right)
        return left; 
    if(!left)
        return right; 
    if(!right)
        return left; 
    return root; 
}
};