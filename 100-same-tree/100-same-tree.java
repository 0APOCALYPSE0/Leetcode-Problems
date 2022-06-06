/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean isSame = true;
    int count = 0;
    public void preOrder(TreeNode p, TreeNode q){
        if(p.val != q.val || p.left == null && q.left != null || p.left != null && q.left == null || p.right == null && q.right != null || p.right != null && q.right == null){
            this.count++;
            if(this.count == 1){
                this.isSame = false;   
            }
        }
        if(p.left != null && q.left != null){
            this.isSameTree(p.left, q.left);
        }
        if(p.right != null && q.right != null){
            this.isSameTree(p.right, q.right);
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p != null && q != null){
            this.preOrder(p,q);   
        }else{
            return false;
        }
        return isSame;
    }
}