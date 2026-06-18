class Solution {
    public int maxProfit(int[] prices) {
        int fb= prices[0];
        int profit =0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<fb){
                fb= prices[i];
            }
            else{
                profit= Math.max(profit, prices[i]-fb);
            }
        }
        return profit;
    }
}
