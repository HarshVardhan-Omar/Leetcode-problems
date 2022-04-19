class Solution {
    public void setZeroes(int[][] matrix) {
            int rows=matrix.length;
            int cols=matrix[0].length;
            int[][] visited=new int[rows][cols];
            for(int i=0;i<rows;i++){
                    for(int j=0;j<cols;j++){
                            visited[i][j]=0;
                    }
            }
            int i=0;
            while(i<rows){
                    int j=0;
                    while(j<cols){
                            if(matrix[i][j]==0&&visited[i][j]==0){
                                    for(int row=0;row<rows;row++){
                                            if(matrix[row][j]==0){
                                                    continue;
                                            }
                                            matrix[row][j]=0;
                                            visited[row][j]=1;
                                    }
                                    for(int col=0;col<cols;col++){
                                            if(matrix[i][col]==0){
                                                    continue;
                                            }
                                            // System.out.println("inside");
                                            matrix[i][col]=0;
                                            visited[i][col]=1;
                                    }
                                   
                            }
                            j++;
                    }
                    i++;
            }
            
        
    }
}