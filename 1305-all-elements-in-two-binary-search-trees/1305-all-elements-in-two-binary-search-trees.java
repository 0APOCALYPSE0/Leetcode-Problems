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
    List<Integer> list = new LinkedList<Integer>();
    
    /* recursive function to perform inorder traversal of tree */
    public void inorder(TreeNode t){
        if (t == null){
            return;
        }
        if (t.left != null)    
            inorder(t.left);
        
        list.add(t.val);
        
        if (t.right != null)    
            inorder(t.right);
    }
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        this.inorder(root1);
        this.inorder(root2);
        Collections.sort(list);
        return this.list;
    }
}