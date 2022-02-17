class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> comb=new ArrayList<>();
        combinations(candidates,0,candidates.length,target,comb);
        return ans;
    }
    private void combinations(int[] candidates,int i,int n,int target,List<Integer>comb){
            if(i==n){
                    if(target==0){
                            ans.add(new ArrayList<Integer>(comb));
                            return;
                    }
                    else{
                            return;
                    }
            }
            combinations(candidates,i+1,n,target,comb);
            if(candidates[i]<=target){
                    comb.add(candidates[i]);
                    combinations(candidates,i,n,target-candidates[i],comb);
                    comb.remove(comb.size()-1);
            }
            
            
    }
}