class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        if(n==1){
            return nums[0];
        }
        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        int case1 = fun(nums, 0, n - 1, dp1);

        // Case 2: Rob from index 1 to n - 1
        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int case2 = fun(nums, 1, n, dp2);

        return Math.max(case1, case2);
    }
    static int fun(int[] nums, int i, int n, int[] dp){
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int rob= nums[i] + fun(nums,i+2,n,dp);
        int skip= fun(nums,i+1, n,dp);

        return dp[i]=Math.max(rob,skip);
    }
}
