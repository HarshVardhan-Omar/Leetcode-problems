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
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int findMaxSum(int arr[], int n) {
        int[] dp=new int[n];
        dp[0]=arr[0];
        for(int i=1;i<n;i++){
            int first=arr[i];
            if(i>1){
                first+=dp[i-2];
            }
            
            int second=dp[i-1];
            dp[i]=Math.max(first,second);
        }
        return dp[n-1];
    }
    private int solve(int[] arr,int[] dp,int start){
        if(start == 0)return arr[0];
        
        if(dp[start] != -1)return dp[start];
        int first=arr[start],second=Integer.MIN_VALUE;
        if(start > 1){
            first+=solve(arr,dp,start-2);
        }
        second=solve(arr,dp,start-1);
        
        return dp[start]=Math.max(first,second);
        
    }
}