class Solution {
    public int countPrimes(int n) {
            boolean[] isPrime=new boolean[n+1];
            // isPrime[0]=isPrime[1]=false;
            int k=0;
            for(int i=0;i<=n;i++)
                    isPrime[k++]=true;
            int cnt=0;
            for(int i=2;i<n;i++){
                    if(isPrime[i]){
                            cnt++;
                            for(int j=2*i;j<n;j=j+i){
                                    isPrime[j]=false;
                            }
                    }
                    
            }
            return cnt;
        
    }
}