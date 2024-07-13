/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    // public int maxDepth(TreeNode root) {
    // if (root == null) {
    // return 0;
    // }
    // Queue<TreeNode> q = new LinkedList<>();
    // q.add(root);
    // int ans = 0;
    // while (!q.isEmpty()) {
    // int n = q.size();
    // for (int i = 0; i < n; i++) {
    // if (q.peek().left != null) {
    // q.add(q.peek().left);
    // }
    // if (q.peek().right != null) {
    // q.add(q.peek().right);
    // }
    // q.poll();
    // }
    // ans++;
    // }
    // return ans;
    // }
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return 1 + Math.max(l, r);
    }
}