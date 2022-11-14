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
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.longestPerfectPiece(arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int longestPerfectPiece(int[] nums, int n) {
        int max=nums[0];
        int min=nums[0];
        int i=0;
        int j=0;
        int len=Integer.MIN_VALUE;
        while(j < n && i <= j){
            while(j < n && (max - min <= 1)){
                j++;
                if(j < n && nums[j] > max)max=nums[j];
                if(j < n && nums[j] < min)min=nums[j];
            }
            len=Math.max(len,j-i);
            if(j == n)break;
            while(i <= j && (max - min > 1)){
                if(i < n && nums[i] == max)max=nums[i+1];
                if(i < n && nums[i] == min)min=nums[i+1];
                i++;
            }
            
        }
        return len;
    }
    
}