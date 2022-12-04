//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String St[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(St[0]);
            int m = Integer.parseInt(St[1]);
            int k = Integer.parseInt(St[2]);
            
            int[][] mat = new int[n][m];
            
            for(int i=0; i<n; i++)
            {
                String S[] = read.readLine().split(" ");
                for(int j=0; j<m; j++)
                    mat[i][j] = Integer.parseInt(S[j]);
            }

            Solution ob = new Solution();
            System.out.println(ob.shotestPath(mat,n,m,k));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class node{
    int i,j,dist;
    node(int i,int j,int dist){
        this.i=i;
        this.j=j;
        this.dist=dist;
    }
}
class Solution {
    static int shotestPath(int[][] mat, int n, int m, int k) {
        int[][][] vis=new int[n][m][k+1];
        
        return solve(mat,n,m,k,vis,0,0);
    }
    private static int solve(int[][] mat,int n,int m,int k,int[][][] vis,int i,int j){
        Queue<node> q=new LinkedList<>();
        q.add(new node(i,j,k));
        vis[0][0][k]=1;
        int dist=0;
        while(!q.isEmpty()){
            int size=q.size();
            while(size > 0){
            node cell=q.poll();
            int a=cell.i;
            int b=cell.j;
            int walls=cell.dist;
            if(a == n-1 && b == m-1)return dist;
            int[] delrow={0,-1,1,0};
            int[] delcol={-1,0,0,1};
            for(int x=0;x<4;x++){
                int nrow=a+delrow[x];
                int ncol=b+delcol[x];
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m){
                    if(mat[nrow][ncol] == 0 && vis[nrow][ncol][walls] == 0){
                        q.add(new node(nrow,ncol,walls));
                        vis[nrow][ncol][walls]=1;
                    }
                    else if(mat[nrow][ncol] == 1){
                        if(walls > 0 && vis[nrow][ncol][walls-1] == 0){
                            q.add(new node(nrow,ncol,walls-1));
                            vis[nrow][ncol][walls-1]=1;
                        }
                    }
                }
            }
            size--;
            
            }
            dist++;
        }
        return -1;
    }
};