//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    int sum=0;
	    for(int i:arr){
	        sum+=i;
	    }
	    int k=sum;
	    boolean[][] dp=new boolean[n][k+1];
	    for(int i=0;i<n;i++){
	        dp[i][0]=true;
	    }
	    if(arr[0] <= k)dp[0][arr[0]]=true;
	    
	    for(int i=1;i<n;i++){
	        for(int j=1;j<k+1;j++){
	            boolean take=false;
	            if(j >= arr[i]){
	                take=dp[i-1][j-arr[i]];
	            }
	            boolean nottake=dp[i-1][j];
	            dp[i][j]=take || nottake;
	        }
	    }
	    int min=Integer.MAX_VALUE;
	    for(int i=0;i<=sum/2;i++){
	        if(dp[n-1][i]){
	            int s2=sum-i;
	            int diff=Math.abs(s2-i);
	            min=Math.min(min,diff);
	        }
	    }
	    return min;
	} 
}
