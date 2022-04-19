 // * Definition for a binary tree node.
 // * public class TreeNode {
 // *     int val;
 // *     TreeNode left;
 // *     TreeNode right;
 // *     TreeNode() {}
 // *     TreeNode(int val) { this.val = val; }
 // *     TreeNode(int val, TreeNode left, TreeNode right) {
 // *         this.val = val;
 // *         this.left = left;
 // *         this.right = right;
 // *     }
 // * }
 
class Solution {
    TreeNode prev = null;
    TreeNode first = null;
    TreeNode second = null;
    
    // If we traverse the tree inorder, we know that we are going to get the BST values in ascending order :)
    public void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        // Inorder left -> node -> right
        // Left
        helper(root.left);
        
        // Node
        
        // Populate our first node
        // We check if the first one has been found yet
        // Otherwise, we can know a node is out of place if it isn't 
            // bigger than the previous node
        if (first == null && prev != null && prev.val > root.val) {
            // We found the first 
            first = prev;
        }
        
        // Populate our second out of place node
        // We know we found the second node, when we see 
            // that the first node has been populated   
        // We set it to the root in case the second node that needs to be swapped is the last one
        if (first != null && prev.val > root.val) {
            second = root;
        }
        
        // Set the previous node to be the root we just visited.
        prev = root;
        
        // Right
        helper(root.right);        
    }
    
    public void recoverTree(TreeNode root) {
        helper(root);
        
        // Swap
        int tmp = first.val;
        first.val = second.val;
        second.val = tmp;
    }
}