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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        q.add(root);
        int left=0;
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer>l=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(left==0){
                    if(q.peek().right!=null){
                        q.add(q.peek().right);
                    }
                    if(q.peek().left!=null){
                        q.add(q.peek().left);
                    }
                }else{
                    if(q.peek().left!=null){
                        q.add(q.peek().left);
                    }
                    if(q.peek().right!=null){
                        q.add(q.peek().right);
                    }
                }
                l.add(q.poll().val);
            }
            left=left^1;
            res.add(l);
        }
        return res;
    }
}