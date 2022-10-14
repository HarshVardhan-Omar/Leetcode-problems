//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }
            int[] source = new int[2];
            for (int i = 0; i < 2; i++) {
                int x = sc.nextInt();
                source[i] = x;
            }
            int[] dest = new int[2];
            for (int i = 0; i < 2; i++) {
                int x = sc.nextInt();
                dest[i] = x;
            }
            Solution ob = new Solution();
            int ans = ob.shortestPath(grid, source, dest);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    class pair{
        int a,b,c;
        pair(int a,int b,int c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
    }

    int shortestPath(int[][] grid, int[] source, int[] destination) {
        int m=grid.length;
        int n=grid[0].length;
        
        int[][] vis=new int[m][n];
        vis[source[0]][source[1]]=1;
        return bfs(grid,source,destination,vis);
    
    }
    private int bfs(int[][] grid,int[] s,int[] d,int[][] vis){
        int m=grid.length;
        int n=grid[0].length;
        int sx=s[0];
        int sy=s[1];
        
        int dx=d[0];
        int dy=d[1];
        
        Queue<pair> q=new LinkedList<>();
        int[] delrow={0,-1,0,1};
        int[] delcol={-1,0,1,0};
        
        q.add(new pair(sx,sy,0));
        int dist=Integer.MAX_VALUE;
        while(!q.isEmpty()){
            pair cell=q.peek();
            int x=cell.a;
            int y=cell.b;
            int level=cell.c;
            if(x == dx && y == dy)return level;
            q.poll();
            for(int i=0;i<4;i++){
                int nx=x+delrow[i];
                int ny=y+delcol[i];
                
                if(nx >= 0 && nx < m && ny >= 0 && ny < n && grid[nx][ny] == 1 && vis[nx][ny] == 0){
                    vis[nx][ny]=1;
                    q.add(new pair(nx,ny,level+1));
                    dist=Math.min(dist,level);
                }
            }
            
        }
        return -1;
    }
}
