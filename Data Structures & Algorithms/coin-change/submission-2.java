class Solution {
    public int coinChange(int[] coins, int amount) {
        int n= coins.length;
        int dp[][]= new int[n][amount+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int res=  fun(coins, n-1, amount,dp);
        return res==(int)1e9? -1: res;
    }
    static int fun(int[] coins, int i, int amount, int[][] dp){
        if(i==0){
            if(amount%coins[i]==0) return amount/coins[i];
            else{
                return (int)1e9;
            }
        }
        if(dp[i][amount]!=-1){
            return dp[i][amount];
        }

        int no_take= fun(coins, i-1, amount, dp);
        int take= (int)1e9;
        if(coins[i]<=amount){
            take= 1+ fun(coins,i, amount-coins[i], dp);
        } 
        return dp[i][amount]= Math.min(take, no_take);
    }
}
