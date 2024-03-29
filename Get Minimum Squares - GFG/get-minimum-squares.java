//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.MinSquares(n);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int MinSquares(int n)
    {
        if(n <= 3)return n;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        
        return solve(n,dp);
    }
    private int solve(int n,int[] dp){
        if(n <= 3)return n;
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for (int i = 4; i <= n; i++)
        {
            dp[i] = i;
            for (int x = 1; x <= Math.ceil(
                              Math.sqrt(i)); x++)
            {
                int temp = x * x;
                if (temp > i)
                    break;
                else
                    dp[i] = Math.min(dp[i], 1
                                  + dp[i - temp]);
            }
        }
        int res=dp[n];
        return res;
        
    }
}