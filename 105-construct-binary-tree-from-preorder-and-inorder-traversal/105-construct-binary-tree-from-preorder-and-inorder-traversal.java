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
    public TreeNode constructTree(int[] preorder, int preStart, int preEnd, int[] inorder,
                                 int inStart, int inEnd, Map<Integer, Integer> map){
        if(preStart > preEnd || inStart > inEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int element = map.get(root.val);
        int nElement = element - inStart;
        
        root.left = constructTree(preorder, preStart + 1, preStart + nElement, inorder,                           inStart, element - 1, map);
        root.right = constructTree(preorder, preStart + nElement + 1, preEnd,                                      inorder, element + 1, inEnd, map);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int inStart = 0; int preStart = 0;
        int inEnd = inorder.length - 1; int preEnd = preorder.length - 1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        return this.constructTree(preorder, preStart, preEnd, inorder, inStart, inEnd, map);
    }
}