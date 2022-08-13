class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            int m=image.length;
            int n=image[0].length;
            if(color == image[sr][sc])
                    return image;
            int old=image[sr][sc];
            
            dfs(sr,sc,image,color,old);
            return image;
        
    }
        
    private void dfs(int r,int c,int[][] image,int color,int old){
            int m=image.length;
            int n=image[0].length;
            if(image[r][c] != old){
                    return;
            }
            image[r][c]=color;
            
            for(int i=-1;i<=1;i++){
                    int nr=r+i;
                    int nc=c;
                    if(nr>=0 && nr<m && image[nr][nc] == old){
                            dfs(nr,nc,image,color,old);
                    }
            }
            for(int i=-1;i<=1;i++){
                    int nr=r;
                    int nc=c+i;
                    
                    if(nc >= 0 && nc < n && image[nr][nc] == old) {
                            dfs(nr,nc,image,color,old);
                    }
            }
    }
}