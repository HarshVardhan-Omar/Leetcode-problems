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
    private static boolean safe(int i,int j,int n,int m){
        if(i >= 0 && i < n && j >= 0 && j < m)return true;
        return false;
    }
    static long numOfWays(int n, int m)
    {
        long mod=1000000007;
        long ways=0;
        int total=n*m;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //total 16 attacking points
                long pos=total-1;
                //Down forward direction
                
                ////Horizontal movement
                int a=i+1;
                int b=j+2;
                ////Vertical movement
                int c=i+2;
                int d=j+1;
                
                //down Backward direction
                ////vertical movement
                int e=i+2;
                int f=j-1;
                ////Horizontal movement
                int g=i+1;
                int h=j-2;
                
                //Up Forward direction
                ///Horizontal movement
                int w=i-1;
                int k=j+2;
                ////vertical movement
                int l=i-2;
                int x=j+1;
                
                //Up backward movement
                ////Horizontal movement
                int y=i-1;
                int z=j-2;
                ////vertical movement
                int val=i-2;
                int val1=j-1;
                
                
                if(safe(a,b,n,m))pos--;
                if(safe(c,d,n,m))pos--;
                if(safe(e,f,n,m))pos--;
                if(safe(g,h,n,m))pos--;
                if(safe(w,k,n,m))pos--;
                if(safe(l,x,n,m))pos--;
                if(safe(y,z,n,m))pos--;
                if(safe(val,val1,n,m))pos--;
                ways+=pos;
            }
        }
        return ways%mod;
    }
}