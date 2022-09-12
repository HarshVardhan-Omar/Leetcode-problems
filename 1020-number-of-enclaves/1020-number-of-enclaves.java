class Solution {
    private void dfs(int i,int j,int[][] grid,int[][] vis,int m,int n){
        int[] delrow={-1,0,1,0};
        int[] delcol={0,-1,0,1};
        for(int k=0;k<4;k++){
            int nrow=i+delrow[k];
            int ncol=j+delcol[k];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && grid[nrow][ncol] == 1 && vis[nrow][ncol] == 0){
                vis[nrow][ncol]=1;
                dfs(nrow,ncol,grid,vis,m,n);
            }
        }
    }
    public int numEnclaves(int[][] grid) {
            int m=grid.length;
            int n=grid[0].length;
            
            int[][] vis=new int[m][n];
            for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                            if(i == 0 || i == m-1 || j == 0 || j == n-1){
                                    if(vis[i][j] == 0 && grid[i][j] == 1){
                                            vis[i][j]=1;
                                            dfs(i,j,grid,vis,m,n);
                                    }
                            }
                    }
            }
                    int cnt=0;
                    for(int i=0;i<m;i++){
                            for(int j=0;j<n;j++){
                                    if(vis[i][j] == 0 && grid[i][j] == 1){
                                            cnt++;
                                    }
                            }
                    }
                    return cnt;
            }
        
    }
