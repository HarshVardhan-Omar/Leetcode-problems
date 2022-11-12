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
            String s = br.readLine().trim();
            int k = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.characterReplacement(s, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int characterReplacement(String s, int k)
    {
        int max=Integer.MIN_VALUE;
        int n=s.length();
        for(char i='A';i<='Z';i++){
            int ct=0;
            int left=0;
            int right=0;
            while(right < n){
                if(s.charAt(right) == i){
                    max=Math.max(max,right-left+1);
                    right++;
                }
                else{
                    if(ct<k){
                        max=Math.max(max,right-left+1);
                        right++;
                        ct++;
                    }
                    else{
                        while(left < n && s.charAt(left) == i){
                            left++;
                        }
                        left++;
                        ct--;
                    }
                }
            }
            
        }
        return max;
    }
}