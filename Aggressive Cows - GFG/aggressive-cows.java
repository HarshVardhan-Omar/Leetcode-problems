//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int i=0;
        int j=stalls[n-1]-stalls[0];
        int ans=-1;
        while(i <= j){
            int mid=i+(j-i)/2;
            if(possible(stalls,k,mid)){
                ans=mid;
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return ans;
    }
    private static boolean possible(int[] stalls,int k,int mid){
        int cows=1;
        int lastindex=stalls[0];
        int n=stalls.length;
        for(int i=1;i<n;i++){
            if(stalls[i] - lastindex >= mid){
                cows+=1;
                lastindex=stalls[i];
            }
            if(cows >= k)return true;
        }
        return false;
    }
}