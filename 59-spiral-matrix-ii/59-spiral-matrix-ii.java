class Solution {
    public int[][] generateMatrix(int n) {
            int[][] ans=new int[n][n];
            int rowstart=0;
            int rowend=n-1;
            int colstart=0;
            int colend=n-1;
            int way=1;
            int k=1;
            while(rowstart<=rowend&&colstart<=colend){
                    if(way==1){
                            for(int i=colstart;i<=colend;i++){
                                    ans[rowstart][i]=k++;
                            }
                            way=2;
                            rowstart++;
                    }
                    else if(way==2){
                            for(int i=rowstart;i<=rowend;i++){
                                    ans[i][colend]=k++;
                            }
                            way=3;
                            colend--;
                    }
                    else if(way==3){
                            for(int i=colend;i>=colstart;i--){
                                    ans[rowend][i]=k++;
                            }
                            way=4;
                            rowend--;
                    }
                    else{
                            for(int i=rowend;i>=rowstart;i--){
                                    ans[i][colstart]=k++;
                            }
                            way=1;
                            colstart++;
                    }
            }
            return ans;
        
    }
}