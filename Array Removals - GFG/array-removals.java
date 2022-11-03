//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().removals(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int removals(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return solve(arr,0,n-1,k,0,dp);
    }
    private int solve(int[] arr,int i,int j,int k,int remove,int[][] dp) {
        int n=arr.length;
        if(j < 0 || i >= n)return Integer.MAX_VALUE;
        int diff=Math.abs(arr[i]-arr[j]);
        if(dp[i][j] != -1)return dp[i][j];
        if(diff <= k)return remove;
        
        int end=solve(arr,i,j-1,k,remove+1,dp);
        int start=solve(arr,i+1,j,k,remove+1,dp);
        
        return dp[i][j]=Math.min(end,start);
    }
}