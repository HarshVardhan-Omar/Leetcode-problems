class Solution {
    public int climbStairs(int n) {
            int[] dp=new int[n+1];
            for(int i=0;i<n+1;i++)
                    dp[i]=-1;
            int ans=find(n,dp);
            return ans;
        
    }
        private int find(int n,int[] dp){
                if(n == 0 || n == 1)return 1;
                if(dp[n] != -1)return dp[n];
                return dp[n]=find(n-1,dp)+find(n-2,dp);
        }
}