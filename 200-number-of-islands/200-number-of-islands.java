class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] vis=new boolean[grid.length][grid[0].length];
        
            for(int i=0;i<grid.length;i++){
                    for(int j=0;j<grid[0].length;j++){
                            vis[i][j]=false;
                    }
            }
            int cnt=0;
            for(int i=0;i<grid.length;i++){
                    for(int j=0;j<grid[0].length;j++){
                            if(!vis[i][j] && grid[i][j] == '1'){
                                    dfs(i,j,vis,grid);
                                    cnt++;
                            }
                    }
            }
            return cnt;
            
    }
        private void dfs(int ro,int col,boolean[][] vis,char[][] grid){
                vis[ro][col]=true;
                int n=grid.length;
                int m=grid[0].length;
                for(int j=-1;j<=1;j++){
                        int nro=ro;
                        int nco=col+j;
                        if(nco>=0 && nco<m && !vis[nro][nco] && grid[nro][nco] == '1'){
                                dfs(nro,nco,vis,grid);
                        }
                }
                for(int i=-1;i<=1;i++){
                        int nro=ro+i;
                        int nco=col;
                        if(nro>=0 && nro<n && !vis[nro][nco] && grid[nro][nco] == '1'){
                                dfs(nro,nco,vis,grid);
                        }
                } 
        }
}