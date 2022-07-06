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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return list;
        }
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> nestedList = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode tempNode = q.poll();
                nestedList.add(tempNode.val);
                if(tempNode.left!=null) q.add(tempNode.left);
                if(tempNode.right!=null) q.add(tempNode.right);
            }
            list.add(nestedList);
        }
        return list;
    }
}