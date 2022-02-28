class Solution {
    public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> ans=new ArrayList<>();
            List<Integer> output=new ArrayList<>();
            solve(n,k,0,ans,output);
            return ans;
                
    }
    private void solve(int n,int k,int i,List<List<Integer>> ans,List<Integer> output){
            if(i==n||k==0){
                    if(k==0){
                    ans.add(new ArrayList(output));
                    }
                    return;
            }
            
            //Either we take value at i or we ignore
            //Call of not taking ith value
            solve(n,k,i+1,ans,output);
            output.add(i+1);
            solve(n,k-1,i+1,ans,output);
            output.remove(output.size()-1);
    }
}