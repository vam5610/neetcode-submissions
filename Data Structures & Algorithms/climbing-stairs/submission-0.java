class Solution {
    public int climbStairs(int n) {
        int[] dp= new int[n+1];
        Arrays.fill(dp,-1);
        return fun(dp,n);
    }
    static int fun(int[] dp,int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int os= fun(dp,n-1);
        int ts= fun(dp,n-2);
        return dp[n]= os+ts;
    }
}
