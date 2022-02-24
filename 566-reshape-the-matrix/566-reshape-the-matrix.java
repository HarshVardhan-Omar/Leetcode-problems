class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int rl=mat.length;
        int cl=mat[0].length;
        
        if(rl*cl != r*c) return mat;
        if(rl==r) return mat;
        
        int res[][]=new int[r][c];
        
        int i=0,j=0;
        for(int []temp : mat){
            for(int x : temp){
                res[i][j++]=x;
                if(j==c){
                    i++;j=0;
                }  
            }
        }
        return res;
       
    }
}