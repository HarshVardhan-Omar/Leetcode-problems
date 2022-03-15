class Solution {
    public int minSwaps(String s) {
            
            //Opening and closing barabar hone chhayiye
            int opening=0;
            int closing=0;
            int swaps=0;
            int n=s.length();
            for(int i=0;i<n;i++){
                    char c=s.charAt(i);
                    if(c==']'){
                            closing++;
                            if(closing>opening){
                                    opening++;
                                    closing--;
                                    swaps++;
                            }
                    }
                    else{
                            opening++;
                    }
            }
            return swaps;
        
    }
}