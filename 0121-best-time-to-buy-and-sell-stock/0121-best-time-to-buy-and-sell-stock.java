class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int i = 1;i < prices.length;i++) {
                if(prices[i]>minPrice) {
                      int curProfit = prices[i] - minPrice;
                      maxProfit = Math.max(curProfit, maxProfit);
                } else {
                        minPrice = prices[i];
                }
        }
        return maxProfit;
    }
}