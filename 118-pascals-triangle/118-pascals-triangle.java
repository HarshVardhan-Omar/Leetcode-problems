class Solution {
   public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList(); 
        
        int[][] dp = new int[numRows][numRows];
        
        
        dp[0][0] = 1 ;
        
        List<Integer> temp = new ArrayList();
        
        temp.add(1);
        
        ans.add(temp);

        
        for(int i=1 ; i<numRows ; i++){
            
             temp = new ArrayList();
          
            for(int c=0 ; c<numRows ; c++){
                    
                    if(c==0){
                        
                       temp.add(1);
                       dp[i][c] = 1 ;
                        
                    }
                    else{
                        
                       dp[i][c] = dp[i-1][c] + dp[i-1][c-1]; 
                        
                       if(dp[i][c]!=0) temp.add(dp[i][c]);
                        
                       else break ;
                        
                    }    
                    
                } 
            ans.add(temp);
        }
        
        
        return ans ;
        
    }
}