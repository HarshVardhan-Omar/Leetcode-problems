class Solution {
        List<List<Integer>> ans=new ArrayList<>();
    private void generate(ArrayList<Integer> subset,int i,int[] nums){
            if(i==nums.length){
                    ans.add(new ArrayList<Integer>(subset));
                    return;
            }
            generate(subset,i+1,nums);
            subset.add(nums[i]);
            generate(subset,i+1,nums);
            // subset.trimtosize();
            subset.remove(subset.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
            // List<List<Integer>> ans=new ArrayList<>();
            ArrayList<Integer> subset=new ArrayList<>();
            generate(subset,0,nums);
            return ans;
    }
}