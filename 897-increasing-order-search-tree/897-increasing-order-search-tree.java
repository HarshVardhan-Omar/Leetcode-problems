class Solution {
    public TreeNode increasingBST(TreeNode root) {
       TreeNode dummy=new TreeNode(-1) ;
        inorder(root,dummy);
        return dummy.right;
    }
    public void inorder(TreeNode root,TreeNode dummy){
        if(root!=null){
            inorder(root.left,dummy);
            TreeNode current=dummy;
            while(current.right!=null){
                current=current.right;
            }
            current.right=new TreeNode(root.val);
            inorder(root.right,dummy);   
        }
    }   
}