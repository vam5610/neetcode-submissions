class Solution {
    public int maxProfit(int[] prices) {
        int pro=0;
        int fb= prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]>fb){
                pro= pro+ (prices[i]-fb);
            }
            fb= prices[i];
        }
        return pro;
    }
}