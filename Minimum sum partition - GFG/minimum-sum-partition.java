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
	    boolean[] prev=new boolean[k+1];
	    prev[0]=true;
	    if(arr[0] <= k)prev[arr[0]]=true;
	    
	    for(int i=1;i<n;i++){
	        boolean[] curr=new boolean[k+1];
	        for(int j=1;j<k+1;j++){
	            curr[0]=true;
	            boolean take=false;
	            if(j >= arr[i]){
	                take=prev[j-arr[i]];
	            }
	            boolean nottake=prev[j];
	            curr[j]=take || nottake;
	        }
	        prev=curr;
	    }
	    int min=Integer.MAX_VALUE;
	    for(int i=0;i<=sum/2;i++){
	        if(prev[i]){
	            int s2=sum-i;
	            int diff=Math.abs(s2-i);
	            min=Math.min(min,diff);
	        }
	    }
	    return min;
	} 
}
