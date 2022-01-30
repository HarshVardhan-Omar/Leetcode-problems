class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
            int n=nums.length;
            int rightones=0;
            for(int i=0;i<n;i++){
                    rightones+=nums[i];
            }
            int max=1;
            List<Integer> ans=new ArrayList<>();
            int leftzeros=0;
            for(int j=0;j<=n;j++){
                    int score=leftzeros+rightones;
                    if(score>max){
                            max=score;
                            ans.clear();
                    }
                    if(max==score){
                            ans.add(j);
                    }
                    if(j<n){
                            if(nums[j]==0){
                                    leftzeros+=1;
                            }
                            else{
                                    rightones-=1;
                            }
                    }
            }
            return ans;
        
    }
}