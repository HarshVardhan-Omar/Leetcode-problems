class Solution {
class Pair{
int i ; int j;
Pair(int i, int j){
this.i =i;
this.j =j;
}
}
public int orangesRotting(int[][] grid) {
int n = grid.length;
int m = grid[0].length;

    for(int i =0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==2){
                q.add(new Pair(i,j));
             }
        }
    }
      solve(grid,n,m);
     for(int i =0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==1){
                return -1;
            }
        }
    }
  
    return count;
    
}
int count =0;
 Queue<Pair> q = new LinkedList<>();
public void solve(int[][] grid, int n, int m){
 
    
  
    
    while(q.isEmpty()==false){
        int x = q.size();
        boolean tag = false;
        for(int o = 0; o<x;o++){
        Pair p = q.poll();
       int  i = p.i;
     int   j =p.j;
        
        for(int k=-1;k<=1;k=k+2){
           if(i+k>=0&&i+k<n&&j>=0&&j<m){
            if(grid[i+k][j]==1){
                tag = true;
                grid[i+k][j]=0;
                q.add(new Pair(i+k,j));
            }
           }
             if(j+k>=0&&j+k<m&&i>=0&&i<n){
            if(grid[i][j+k]==1){
                tag = true;
                 grid[i][j+k]=0;
                q.add(new Pair(i,j+k));
            }
             }
        }
            
        
    }
        if(tag) count++;
    }
}
}