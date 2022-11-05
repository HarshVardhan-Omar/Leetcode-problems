//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> numbers= new ArrayList<Integer>();
            numbers = ob.minPartition(N);
            for(int i: numbers){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> minPartition(int n)
    {
        List<Integer> ans=new ArrayList<>();
        int[] coins=new int[10];
        coins[0]=1;
        coins[1]=2;
        coins[2]=5;
        coins[3]=10;
        coins[4]=20;
        coins[5]=50;
        coins[6]=100;
        coins[7]=200;
        coins[8]=500;
        coins[9]=2000;
        
        for(int i=9;i>=0;i--){
            while(coins[i] <= n){
                n-=coins[i];
                ans.add(coins[i]);
            }
        }
        return ans;
        
    }
}