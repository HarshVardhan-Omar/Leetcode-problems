//{ Driver Code Starts
//Initial Template for Java
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isSumOfTwo(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String isSumOfTwo(int n){
        for(int i=1;i<n;i++){
            if(isPrime(i)){
            int second=n-i;
            if(isPrime(second))return "Yes";
            }
        }
        return "No";
    }
    private static boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i == 0)return false;
        }
        return true;
    }
}