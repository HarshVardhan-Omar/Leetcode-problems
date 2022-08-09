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
    public boolean isSameTree(TreeNode p, TreeNode q) {
            // boolean ans=false;
            if(p ==null && q!=null || p!=null && q==null){
                    return false;
                    
            }
            if(p == null && q == null){
                    return true;
            }
            if(p.val==q.val){
                    boolean ans1=isSameTree(p.left,q.left);
                    boolean ans2=isSameTree(p.right,q.right);  
                    if(!ans1 || !ans2){
                            return false;
                    }
                    else{
                            return true;
                    }
            }
            else{
                    return false;
            }
            
    }
}