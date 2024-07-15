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
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<Pair<TreeNode, Long>> q = new LinkedList<>();
        long res = 1;
        q.add(new Pair<>(root, 0L));
        while (!q.isEmpty()) {
            long n = q.size();
            long s = q.peek().getValue();
            long e = 0;
            for (int i = 0; i < n; i++) {
                e = q.peek().getValue();
                if (q.peek().getKey().left != null) {
                    q.add(new Pair<>(q.peek().getKey().left, 2 * e + 1));
                }
                if (q.peek().getKey().right != null) {
                    q.add(new Pair<>(q.peek().getKey().right, 2 * e + 2));
                }
                q.poll();
            }
            res = Math.max(res, e - s + 1);
        }
        return (int) res;
    }
}