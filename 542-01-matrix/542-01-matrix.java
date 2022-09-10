class Solution {
        class pair{
                int a,b,c;
                pair(int a,int b,int c){
                        this.a=a;
                        this.b=b;
                        this.c=c;
                }
        }
    public int[][] updateMatrix(int[][] mat) {
            int m=mat.length;
            int n=mat[0].length;
            
            int[][] vis=new int[m][n];
            int[][] ans=new int[m][n];
            
            Queue<pair> bfs=new LinkedList<>();
            
            for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                            vis[i][j]=0;
                    }
            }
            
            for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                            if(mat[i][j]==0){
                                    vis[i][j]=1;
                                    bfs.add(new pair(i,j,0));
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
                if(row+1<m){
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
            if(col+1<n){
                if(vis[row][col+1] == 0){
                    vis[row][col+1]=1;
                    bfs.add(new pair(row,col+1,steps+1));
                }
                
            }
                    
            }
            return ans;
        
    }
}