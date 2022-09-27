class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp=new int[n];
        return findmax(nums,n-1,dp);
    }
    int findmax(int[] nums,int ind,int[] dp){
            dp[0]=nums[0];
            for(int i=1;i<nums.length;i++){
                    int pick=0;
                    if(i>1){
                        pick=nums[i]+dp[i-2];
                    }
                    else{
                            pick=nums[i];
                    }
                    int nonpick=dp[i-1];
                    dp[i]=Math.max(pick,nonpick);
            }
         
            return dp[nums.length-1];
    }
}