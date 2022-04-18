class Solution {
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)
            return -1;
        int l = kthSmallest(root.left,k);
        if(count==k)
            return l;
        count++;
        if(count==k)
            return root.val;
        int r = kthSmallest(root.right,k);
        if(count==k)
            return r;
        return -1;
    }
}