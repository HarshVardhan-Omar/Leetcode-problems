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
    public static int a=0;
    public static void helper(TreeNode root){
        
        if(root==null)
            return;
        helper(root.right);
        root.val+=a;
        a=root.val;
        helper(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        a=0;
        helper(root);

        return root;
    }
}