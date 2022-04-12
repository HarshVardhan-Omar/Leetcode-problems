class Solution {
    public void gameOfLife(int[][] board) {
            int rows=board.length;
            int column=board[0].length;
            int[][] ans=new int[rows][column];
            
            for(int i=0;i<rows;i++){
                    for(int j=0;j<column;j++){
                            int c=0;
                            int element=board[i][j];
                            if((i-1) >= 0 && j-1 >= 0 && board[i-1][j-1] == 1){
                                    c++;
                            }  
                            if( (i-1) >= 0 && j < column && board[i-1][j] == 1){
                                    c++;
                            }
                            if( (i-1) >= 0 && j+1 < column && board[i-1][j+1] == 1){
                                    c++;
                            }
                            if( j-1 >= 0 && board[i][j-1] == 1){
                                    c++;
                            }
                            if( j+1 < column && board[i][j+1] == 1){
                                    c++;
                            }
                            if( i+1 < rows && j-1 >= 0 && board[i+1][j-1] == 1){
                                    c++;
                            }
                            if(i+1 <rows && board[i+1][j] == 1){
                                    c++;
                            }
                            if(i+1 < rows && j+1 < column && board[i+1][j+1] == 1){
                                    c++;
                            }
                            if(element==0){
                                    if(c==3){
                                        ans[i][j]=1;    
                                    }
                                    else{
                                            ans[i][j]=element;
                                    }
                            }
                            if(element==1){
                                    if(c<2||c>3){
                                            ans[i][j]=0;
                                    }
                                    else{
                                            ans[i][j]=element;
                                    }
                            }
                    }
            }
            for(int i=0;i<rows;i++){
                    for(int j=0;j<column;j++){
                            board[i][j]=ans[i][j];
                    }
            }
        
    }
}