//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.fillingBucket(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int fillingBucket(int n) {
        int[] dp=new int[n+1];
        for(int i=0;i<n+1;i++){
            dp[i]=-1;
        }
        return solve(n,dp);
    }
    private static int solve(int n,int[] dp){
        if( n == 2 )return 2;
        if( n == 1 )return 1;
        if(dp[n] != -1)return dp[n];
        int one=solve(n-1,dp)%100000000;
        int two=solve(n-2,dp)%100000000;
        return dp[n]=(one+two)%(100000000);
    }
};