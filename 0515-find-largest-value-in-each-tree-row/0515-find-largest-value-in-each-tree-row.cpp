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
    vector<int> largestValues(TreeNode* root) {
        vector <int> ans;
        queue <TreeNode *>q;
        if(root==NULL)
            return ans;
        q.push(root);
        while(!q.empty()){
            int maxElem=INT_MIN;
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode * cur=q.front();
                q.pop();
                maxElem=max(maxElem,cur->val);
                if(cur->left!=NULL)
                    q.push(cur->left);
                if(cur->right!=NULL)
                    q.push(cur->right);
            }
            ans.push_back(maxElem);
        }
        return ans;
    }
};