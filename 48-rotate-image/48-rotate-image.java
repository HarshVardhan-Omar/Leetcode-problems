class Solution {
    public void rotate(int[][] matrix) {
            int[][] ans=new int[matrix.length][matrix[0].length];
            int n=matrix.length;
            for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                            ans[j][n-(i+1)]=matrix[i][j];
                    }
            }
            // System.out.println(Arrays.toString(ans));
            for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                            matrix[i][j]=ans[i][j];
                    }
            }
        
    }
}