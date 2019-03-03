class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        if(n<=2){
            return n;
        }
        for(int i=0;i<=2;i++){
            dp[i]=i;
        }
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}