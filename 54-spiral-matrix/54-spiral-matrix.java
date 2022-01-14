class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
            int rowstart=0;
            int colstart=0;
            int rowend=matrix.length-1;
            int colend=matrix[0].length-1;
            List<Integer> ans=new ArrayList<>();
            int way=1;
            while(rowstart<=rowend&&colstart<=colend){
                    if(way==1){
                            for(int i=colstart;i<=colend;i++){
                                    ans.add(matrix[rowstart][i]);
                            }
                            way=2;
                            rowstart++;
                    }
                    else if(way==2){
                            for(int i=rowstart;i<=rowend;i++){
                                    ans.add(matrix[i][colend]);
                            }
                            way=3;
                            colend--;
                    }
                    else if(way==3){
                            for(int i=colend;i>=colstart;i--){
                                    ans.add(matrix[rowend][i]);
                            }
                            way=4;
                            rowend--;
                    }
                    else{
                            for(int i=rowend;i>=rowstart;i--){
                                    ans.add(matrix[i][colstart]);
                            }
                            way=1;
                            colstart++;
                    }
            }
            return ans;
        
    }
}