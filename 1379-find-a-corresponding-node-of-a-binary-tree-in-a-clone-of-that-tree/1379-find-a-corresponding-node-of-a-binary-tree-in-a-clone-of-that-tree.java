/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    private int targetValue;
    private TreeNode treeNode;
    private void preOrder(TreeNode tree, TreeNode target){
        if(target == tree){
            this.targetValue = tree.val;
            return;
        }
        if(tree.left != null){
            this.preOrder(tree.left, target);
        }
        if(tree.right != null){
            this.preOrder(tree.right, target);
        }
    }
    
    private void preOrder(TreeNode tree, int target){
        if(target == tree.val){
            this.treeNode = tree;
            return;
        }
        if(tree.left != null){
            this.preOrder(tree.left, target);
        }
        if(tree.right != null){
            this.preOrder(tree.right, target);
        }
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        this.preOrder(original, target);
        System.out.println(targetValue);
        this.preOrder(cloned, targetValue);
        return treeNode;
    }
}