
class bestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int n = 0;
        for(int i = 1; i< prices.length; i++)
        {
            if(prices[i] > prices[i-1]){
                n = n + (prices[i] -prices[i-1]);
            }    
        }
        return n;
        
    }
}