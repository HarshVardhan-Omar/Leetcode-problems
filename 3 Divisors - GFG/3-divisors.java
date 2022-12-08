//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int q = sc.nextInt();
            ArrayList<Long> query = new ArrayList<>();
            for(int i=0;i<q;i++){
                query.add(sc.nextLong());
            }
            Solution ob = new Solution();
                
            ArrayList<Integer> ans = ob.threeDivisors(query,q);
            for(int cnt : ans) {
                System.out.println(cnt);
            }
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q){
        ArrayList<Integer> ans=new ArrayList<>();
        int primesize=(int)1e6+5;
        boolean[] primes=new boolean[primesize];
        Arrays.fill(primes,true);
        fillprime(primes,primesize);
        
        for(int i=0;i<q;i++){
            int nums=solve(query.get(i),primes);
            ans.add(nums);
        }
        return ans;

        
    }
    private static int solve(long num,boolean[] primes){
        int cnt=0;
        
        for(long i=2;i*i<=num;i++){
            if(primes[(int)i]){
                cnt++;
            }
        }
        return cnt;
    }
    private static void fillprime(boolean[] a,int n){
        a[0]=false;
        a[1]=false;
        
        for(int i=2;i*i <= n;i++){
            if(a[i]){
                for(int k=2*i;k<n;k+=i){
                    a[k]=false;
                }
            }
        }
    }
}