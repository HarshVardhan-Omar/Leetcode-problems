class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
            boolean ans=binarysearch2D(matrix,target);
            return ans;
    }
    boolean binarysearch2D(int[][] matrix,int target){
            int n=matrix[0].length;
            int col=0;int colend=n-1;
            int rowstart=0;int rowend=matrix.length-1;
            while(rowstart<=rowend&&col<=colend){
                    if(matrix[rowstart][col]<target&&target<matrix[rowstart][colend]){
                            col++;
                            colend--;
                    }
                    else if(target>matrix[rowstart][colend]){
                            rowstart++;
                    }
                    else if(target<matrix[rowstart][col]){
                            rowend--;
                    }
                    else if(target==matrix[rowstart][col]||target==matrix[rowstart][colend]){
                            return true;
                    }
            }
            return false;
        
    }
}