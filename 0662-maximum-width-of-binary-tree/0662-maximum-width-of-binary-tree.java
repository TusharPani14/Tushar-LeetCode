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
            long e = s;  
            for (int i = 0; i < n; i++) {
                Pair<TreeNode, Long> current = q.poll();
                TreeNode node = current.getKey();
                long index = current.getValue();
                e = index;  
                if (node.left != null) {
                    q.add(new Pair<>(node.left, 2 * index + 1));
                }
                if (node.right != null) {
                    q.add(new Pair<>(node.right, 2 * index + 2));
                }
            }
            res = Math.max(res, e - s + 1);
        }
        return (int) res;
    }
}
