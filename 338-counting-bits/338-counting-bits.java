class Solution {
    public int[] countBits(int n) {
            int[] r=new int[n+1];
            r[0]=0;
            // r[1]=1;
            for(int i=1;i<n+1;i++){
                    r[i]=r[i/2]+i%2;
            }
            return r;
        
    }
}