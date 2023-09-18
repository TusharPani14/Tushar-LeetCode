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
    void traverse(TreeNode* root, int hd, int level, map<int, map<int, vector<int>>>& m) {
        if (!root) return;
        
        m[hd][level].push_back(root->val);
        traverse(root->left, hd - 1, level + 1, m);
        traverse(root->right, hd + 1, level + 1, m);
    }

    vector<vector<int>> verticalTraversal(TreeNode* root) {
        map<int, map<int, vector<int>>> m; 
        traverse(root, 0, 0, m);
        
        vector<vector<int>> result;
        for (auto& entry : m) {
            vector<int> levelVals;
            for (auto& levelEntry : entry.second) {
                vector<int>& vals = levelEntry.second;
                sort(vals.begin(), vals.end());
                levelVals.insert(levelVals.end(), vals.begin(), vals.end());
            }
            result.push_back(levelVals);
        }
        
        return result;
    }
};
