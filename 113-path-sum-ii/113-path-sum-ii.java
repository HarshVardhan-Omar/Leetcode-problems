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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> ans=new ArrayList<>();
            List<Integer> temp=new ArrayList<>();
            
            findSum(root,targetSum,ans,temp);
            return ans;
        
    }
    private void findSum(TreeNode root,int sum,List<List<Integer>> ans,List<Integer> temp){
            
            //Base Case
            if(root == null){
                    // ans.add(new ArrayList<>(temp));
                    return;
            }
            // if(sum < 0){
            //         return;
            // }
            
            int value=root.val;
            temp.add(value);
            if(root.right == null && root.left == null){
                    if(sum-value == 0){
                            ans.add(new ArrayList<>(temp));
                            temp.remove(temp.size()-1);
                            return;
                    }
                    else{
                            temp.remove(temp.size()-1);
                            return;
                    }
            }
            findSum(root.left,sum-value,ans,temp);
            findSum(root.right,sum-value,ans,temp);
            temp.remove(temp.size()-1);
            
            
    }
}