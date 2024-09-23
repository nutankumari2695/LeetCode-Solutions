class Solution {
    public int maxProfit(int[] prices) {
        int i=1, profit=0, min_price=prices[0],n=  prices.length;
        while(i<n){
            if(prices[i] < min_price){
                min_price= prices[i];
            }else{
                profit= Math.max(profit,prices[i]- min_price);
            }
            i++;
        }
        return profit;
    }
}