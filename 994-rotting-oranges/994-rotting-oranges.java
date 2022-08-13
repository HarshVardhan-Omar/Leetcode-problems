class Solution {
    class pair{
            int i;
            int j;
            int t;
            
            pair(int i,int j,int t){
                    this.i=i;
                    this.j=j;
                    this.t=t;
            }
    }
    public int orangesRotting(int[][] grid) {
            int m=grid.length;
            int n=grid[0].length;
            int cntFresh=0;
            
            int[][] vis=new int[m][n];
            Queue<pair> bfs=new LinkedList<>();
            
            for(int i=0;i<m;i++) {
                    for(int j=0;j<n;j++) {
                            if(grid[i][j] == 2){
                                    bfs.add(new pair(i,j,0));
                                    vis[i][j] = 2;  
                            }
                            else{
                                    vis[i][j]=0;
                            }
                            if(grid[i][j] == 1){
                                    cntFresh++;
                            }
                            
                    }
            }
            
            int tm=0;
            int cnt=0;
            while(!bfs.isEmpty()){
                    int row=bfs.peek().i;
                    int col=bfs.peek().j;
                    int time=bfs.peek().t;
                    bfs.remove();
                    if(time>tm){
                            tm=time;
                    }
                    
                    
                    
                    for(int i=-1;i<=1;i++){
                            int nr=row+i;
                            int nc=col;
                            if(nr >= 0 && nr < m && grid[nr][nc] == 1 && vis[nr][nc] == 0){
                                    bfs.add(new pair(nr,nc,time+1));
                                    vis[nr][nc]=2;
                                    cnt++;
                                    
                            }
                            
                            int nr1=row;
                            int nc1=col+i;
                            if(nc1 >=0 && nc1 < n && grid[nr1][nc1]==1 && vis[nr1][nc1]==0){
                                    bfs.add(new pair(nr1,nc1,time+1));
                                    vis[nr1][nc1]=2;
                                    // cnt++;
                                   
                            }
                    }
            }
                   for(int i=0;i<m;i++){
                            for(int j=0;j<n;j++){
                                    if(vis[i][j]!=2 && grid[i][j] ==1){
                                            return -1;
                                    }
                            }
                    }
                    return tm;    
    }
}