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
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postorderTraversal2(root);
        
        
    
        return list;
    }
    public void postorderTraversal2(TreeNode root){
        if(root == null){
            return;
        }
        postorderTraversal2(root.left);
        postorderTraversal2(root.right);
        list.add(root.val);
         
    }
}
            

    
        