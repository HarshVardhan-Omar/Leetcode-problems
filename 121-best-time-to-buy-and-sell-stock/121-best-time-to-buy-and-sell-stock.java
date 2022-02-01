class Solution {
    public int maxProfit(int[] prices) {
            int n=prices.length;
            int leastvalue=Integer.MAX_VALUE;
            int profit=0;
            int todayprofit=0;
            for(int i=0;i<n;i++){
                    
                    //Can we buy
                    if(prices[i]<leastvalue){
                            leastvalue=prices[i];
                    }
                    
                    //Can we sell
                    todayprofit=prices[i]-leastvalue;
                    if(todayprofit>profit)
                            profit=todayprofit;
            }
            return profit;
        
    }
}