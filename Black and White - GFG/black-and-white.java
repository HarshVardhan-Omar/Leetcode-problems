//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Driverclass {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println(new BlackAndWhite().numOfWays(N, M));
        }
    }
}
// } Driver Code Ends


class BlackAndWhite
{
    //Function to find out the number of ways we can place a black and a 
    //white Knight on this chessboard such that they cannot attack each other.
    private static boolean safe(long i,long j,int n,int m){
        if(i >= 0 && i < n && j >= 0 && j < m)return true;
        return false;
    }
    static long numOfWays(int n, int m)
    {
        long mod=1000000007;
        long ways=0;
        int total=n*m;
        long[][] moves={{1,2},{2,1},{2,-1},{1,-2},{-1,2},{-2,1},{-1,-2},{-2,-1}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //total 16 attacking points
                long pos=total-1;
                for(long[] a:moves){
                    long nrow=i+a[0];
                    long ncol=j+a[1];
                    if(safe(nrow,ncol,n,m))pos--;
                }
                
                ways+=pos;
            }
        }
        return ways%mod;
    }
}