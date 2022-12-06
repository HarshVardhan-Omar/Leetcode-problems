//{ Driver Code Starts
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
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int[][] ans = obj.nearest(grid);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


class Solution
{
    class pair{
        int a,b,c;
        pair(int a,int b,int c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
    }
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        int[][] ans=new int[n][m];
        Queue<pair> bfs=new LinkedList<>();
        
        
        //Fill the visited matrix initially to zero
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                vis[i][j]=0;
            }
        }
        //Iterating through the grid
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    bfs.add(new pair(i,j,0));
                    vis[i][j]=1;
                }
            }
        }
        
        while(!bfs.isEmpty()){
            int row=bfs.peek().a;
            int col=bfs.peek().b;
            int steps=bfs.peek().c;
            bfs.poll();
            ans[row][col]=steps;
            
            if(row-1>=0){
                if(vis[row-1][col] == 0){
                    vis[row-1][col]=1;
                    bfs.add(new pair(row-1,col,steps+1));
                }
            }
            if(row+1<n){
                if(vis[row+1][col] == 0){
                    vis[row+1][col]=1;
                    bfs.add(new pair(row+1,col,steps+1));
                }
                
            }
            if(col-1>=0){
                if(vis[row][col-1] == 0){
                    vis[row][col-1]=1;
                    bfs.add(new pair(row,col-1,steps+1));
                }
                
            }
            if(col+1<m){
                if(vis[row][col+1] == 0){
                    vis[row][col+1]=1;
                    bfs.add(new pair(row,col+1,steps+1));
                }
                
            }
        }
        return ans;
    }
}