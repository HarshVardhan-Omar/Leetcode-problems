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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String s) {
        String rev=reverse(s);
        return rev.equals(s)?1:0;
    }
    private String reverse(String s){
        StringBuilder str=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            str.append(s.charAt(i));
        }
        return str.toString();
    }
};