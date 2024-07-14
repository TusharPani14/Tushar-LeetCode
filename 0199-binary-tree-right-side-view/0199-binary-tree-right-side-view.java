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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        reversePreOrder(root, 0, l);
        return l;
    }

    public void reversePreOrder(TreeNode root, int level, List<Integer> l) {
        if (root == null) {
            return;
        }
        if (l.size() == level)
            l.add(root.val);
        reversePreOrder(root.right, level + 1, l);
        reversePreOrder(root.left, level + 1, l);
    }
}