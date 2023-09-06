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
 #include <queue> 
class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        vector<vector<int>> a;
        if(root==NULL)
        return a;

        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty() )
        {
            int size=q.size();
            vector<int> b;
            for(int i=0;i<size;i++)
            {
                TreeNode* cur=q.front();
                b.push_back(cur->val);
                if(cur->left!=NULL)
                q.push(cur->left);
                if(cur->right!=NULL)
                q.push(cur->right);
                q.pop();
            }
            a.push_back(b);
        }
        return a;
    }
};