class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            dp[i][0]=i;
        }
        for(int i=0;i<=n;i++){
            dp[0][i]=i;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                }
            }
        }
        return dp[m][n];
    }

    //优化：滚动数组
    // public int minDistance(String word1, String word2) {
    //     int m = word1.length();
    //     int n = word2.length();
    //     if(m==0){
    //         return word2.length();
    //     }else if(n==0){
    //         return word1.length();
    //     }
    //     int[] dp = new int[n+1];
    //     for(int i=0;i<=n;i++){
    //         dp[i]=i;
    //     }
    //     for(int i=1;i<=word1.length();i++){
    //         int[] dp2=new int[n+1];
    //         dp2[0]=i;
    //         for(int j=1;j<=n;j++){
    //             if(word1.charAt(i-1)==word2.charAt(j-1)){
    //                 dp2[j]=dp[j-1];
    //             }else{
    //                 dp2[j]=1+Math.min(dp[j-1],Math.min(dp[j],dp2[j-1]));
    //             }
    //         }
    //         dp=dp2;
    //     }
    //     return dp[n];
    // }
}