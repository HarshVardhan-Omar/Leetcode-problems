class Solution {
    public int maxProfit(int[] prices){
            int n=prices.length;
            int leastprice=Integer.MAX_VALUE;
            int maxprofit=0;
            int profit=0;
            int i=0;
            while(i<n){
                    if(prices[i]<leastprice){
                            leastprice=prices[i];
                    }
                    profit=prices[i]-leastprice;
                    maxprofit=Math.max(maxprofit,profit);
                    i++;
            }
        return maxprofit;
    }
}