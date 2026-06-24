class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int []dp= new int[cost.length+1];
        Arrays.fill(dp,-1);
        return Math.min(fun(0,cost,dp), fun(1,cost,dp));
    }
    static int fun(int i, int[] costs, int[] dp){
        if(i>=costs.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int os= costs[i]+fun(i+1,costs,dp);
        int ts= costs[i] +fun(i+2, costs,dp);
        return dp[i]=Math.min(os,ts);
    }
}
