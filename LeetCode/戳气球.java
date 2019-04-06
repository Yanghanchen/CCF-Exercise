class Solution {
    public int maxCoins(int[] nums) {
        if(nums.length!=0) {
            int n=nums.length;
            int[][] dp = new int[n][n];
            for(int i=0;i<n;i++){
                int a=i==0?1:nums[i-1];
                int b=nums[i];
                int c=i==n-1?1:nums[i+1];
                dp[i][i]=a*b*c;
            }
            for(int l=0;l<=n;l++){
                for(int i=0;i<n+1-l;i++){
                    int j=i+l-1;
                    for(int k=i;k<=j;k++){
                        int left=k>i?dp[i][k-1]:0;
                        int right=k<j?dp[k+1][j]:0;
                        dp[i][j]=Math.max(dp[i][j],left+right+(i>0?nums[i-1]:1)*(j+1<n?nums[j+1]:1)*nums[k]);
                    }
                }
            }
            return dp[0][n-1];
        }
        return 0;
    }
}