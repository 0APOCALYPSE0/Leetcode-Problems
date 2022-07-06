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
    public void preOrder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        if(root.left != null){
            preOrder(root.left, list);
        }
        if(root.right != null){
            preOrder(root.right, list);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        this.preOrder(root, list);
        return list;
    }
}